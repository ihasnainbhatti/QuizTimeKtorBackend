package com.nainnie.presentation.routes.quiz_question

import com.nainnie.domain.model.QuizQuestion
import com.nainnie.questions
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getAllQuizQuestions() {
    get(path = "/quiz/questions") {
        val id = call.queryParameters["topicId"]?.toIntOrNull()
        val limit = call.queryParameters["limit"]?.toIntOrNull()

        call.respond(filteredList)
    }
}