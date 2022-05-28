package com.example.messanger_task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.messanger_task1.adapter.ChatAdapter
import com.example.messanger_task1.model.Chat
import dev.ogabek.kotlin.model.Message
import dev.ogabek.kotlin.model.Room

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.rv_main)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
        refreshAdapter(getAllChats())
    }

    private fun refreshAdapter(chats: List<Chat>) {
        val adapter = ChatAdapter(this, getAllChats())
        recyclerView.adapter = adapter
    }

    private fun getAllChats(): ArrayList<Chat> {
        val stories: ArrayList<Room> = ArrayList<Room>()
        stories.add(Room(R.drawable.img, "Uchqun"))
        stories.add(Room(R.drawable.img, "Uchqun"))
        stories.add(Room(R.drawable.img, "Uchqun"))
        stories.add(Room(R.drawable.img, "Uchqun"))
        stories.add(Room(R.drawable.img, "Uchqun"))
        stories.add(Room(R.drawable.img, "Uchqun"))
        stories.add(Room(R.drawable.img, "Uchqun"))
        stories.add(Room(R.drawable.img, "Uchqun"))
        stories.add(Room(R.drawable.img, "Uchqun"))
        stories.add(Room(R.drawable.img, "Uchqun"))
        stories.add(Room(R.drawable.img, "Uchqun"))
        stories.add(Room(R.drawable.img, "Uchqun"))
        stories.add(Room(R.drawable.img, "Uchqun"))
        stories.add(Room(R.drawable.img, "Uchqun"))

        stories.add(Room(R.drawable.img, "Uchqun"))
        stories.add(Room(R.drawable.img, "Uchqun"))
        stories.add(Room(R.drawable.img, "Uchqun"))
        stories.add(Room(R.drawable.img, "Uchqun"))
        stories.add(Room(R.drawable.img, "Uchqun"))

        val chats: ArrayList<Chat> = ArrayList<Chat>()
        chats.add(Chat(stories))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))
        chats.add(Chat(Message(R.drawable.img, "Bekhruzbek")))

        return chats
    }
}