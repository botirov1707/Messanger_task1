package com.example.messanger_task1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.messanger_task1.R
import com.google.android.material.imageview.ShapeableImageView
import dev.ogabek.kotlin.model.Room


class RoomAdapter(private val rooms: List<Room>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_CREATE_ROOM_VIEW = 0
    private val TYPE_SIMPLE_ROOM_VIEW = 1

    override fun getItemViewType(position: Int): Int {
        if (position != 0) {
            return TYPE_SIMPLE_ROOM_VIEW
        } else {
            return TYPE_CREATE_ROOM_VIEW
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == TYPE_CREATE_ROOM_VIEW) {
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_create_room_view, parent, false)
            return CreateRoomViewHolder(view)
        }
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_room_view, parent, false)
        return RoomViewHolder(view)
    }

    class RoomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var profile: ShapeableImageView = view.findViewById(R.id.iv_profile)
        var fullName: TextView = view.findViewById(R.id.tv_full_name)
    }

    class CreateRoomViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val room = rooms[position]

        if (holder is RoomViewHolder) {
            holder.profile.setImageResource(room.profile)
            holder.fullName.text = room.fullName
        }

        if (holder is CreateRoomViewHolder) {
        }
    }

    override fun getItemCount() = rooms.size

}