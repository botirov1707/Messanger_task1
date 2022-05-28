package com.example.messanger_task1.model

import dev.ogabek.kotlin.model.Message
import dev.ogabek.kotlin.model.Room

class Chat {
    var message: Message? = null
    var rooms = ArrayList<Room>()

    constructor(message: Message?) {
        this.message = message
    }

    constructor(rooms: ArrayList<Room>) {
        this.rooms = rooms
    }
}
