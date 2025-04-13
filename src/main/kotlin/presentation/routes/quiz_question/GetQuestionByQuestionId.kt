package com.nainnie.presentation.routes.quiz_question

import com.nainnie.questions
import io.ktor.http.*
import io.ktor.server.resources.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.routing.get

fun Route.getQuestionByQuestionId() {
    get(path = "/quiz/questions/{questionId}") {
        val id = call.pathParameters["questionId"]
        if (id.isNullOrBlank()) {
            call.respond(message = "Id is required", status = HttpStatusCode.BadRequest)
            return@get
        }
        call.respond(message = "",status = HttpStatusCode.BadRequest )
    }
}