package com.nainnie

import com.nainnie.domain.model.QuizQuestion
import com.nainnie.presentation.config.configureLogging
import com.nainnie.presentation.config.configureRouting
import com.nainnie.presentation.config.configureSerialization
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

@Suppress("unused")
fun Application.module() {
    configureRouting()
    configureSerialization()
    configureLogging()
}


