package com.nainnie.presentation.routes.quiz_question

import com.nainnie.domain.repository.QuizQuestionsRepository
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getAllQuizQuestions( quizQuestionsRepository: QuizQuestionsRepository) {
    get(path = "/quiz/questions") {
        val id = call.queryParameters["topicId"]?.toIntOrNull()
        val limit = call.queryParameters["limit"]?.toIntOrNull()

        call.respond(quizQuestionsRepository.getAllQuestions(id, limit))
    }
}