package com.example.messanger_task1.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.messanger_task1.R
import com.example.messanger_task1.model.Chat
import com.google.android.material.imageview.ShapeableImageView
import dev.ogabek.kotlin.model.Room

class ChatAdapter(private val context: Context, private val chats: List<Chat>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_ITEM_ROOM = 0
    private val TYPE_ITEM_MESSAGE = 1

    override fun getItemViewType(position: Int): Int {
        val feed: Chat = chats[position]
        return if (feed.rooms.size > 0) TYPE_ITEM_ROOM else TYPE_ITEM_MESSAGE
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == TYPE_ITEM_ROOM) {
            val view: View =
                LayoutInflater.from(parent.context).inflate(R.layout.item_chat_room, parent, false)
            return RoomViewHolder(context, view)
        }
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_chat_message, parent, false)
        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val message: Chat = chats[position]
        if (holder is RoomViewHolder) {
            refreshAdapter(holder.recyclerView, message.rooms)
        }
        if (holder is MessageViewHolder) {
            holder.profile.setImageResource(message.message!!.profile)
            holder.fullName.setText(message.message!!.fullName)
            if (message.message!!.isOnline) {
                holder.isOnline.visibility = View.VISIBLE
            } else {
                holder.isOnline.visibility = View.GONE
            }
        }
    }

    private fun refreshAdapter(recyclerView: RecyclerView, rooms: ArrayList<Room>) {
        val adapter = RoomAdapter(rooms)
        recyclerView.adapter = adapter
    }

    override fun getItemCount(): Int {
        return chats.size
    }

    private class RoomViewHolder(context: Context?, view: View) : RecyclerView.ViewHolder(view) {

        var recyclerView: RecyclerView = view.findViewById(R.id.rv_chat_room)

        init {
            val manager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            recyclerView.layoutManager = manager
        }
    }

    private class MessageViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var profile: ShapeableImageView = view.findViewById(R.id.iv_profile)
        var fullName: TextView = view.findViewById(R.id.tv_full_name)
        var isOnline: LinearLayout = view.findViewById(R.id.is_online)

    }

}