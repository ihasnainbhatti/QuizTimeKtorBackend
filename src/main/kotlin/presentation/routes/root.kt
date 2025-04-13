package com.nainnie.presentation.routes

import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.root(){
    get(path = "/") {
        call.respondText(text = "wELCOME TO THE QUIZ API")
    }
}