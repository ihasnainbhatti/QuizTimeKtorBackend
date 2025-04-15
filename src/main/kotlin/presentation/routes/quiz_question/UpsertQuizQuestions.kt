package com.nainnie.presentation.routes.quiz_question

import com.nainnie.domain.model.QuizQuestion
import com.nainnie.domain.repository.QuizQuestionsRepository
import io.ktor.http.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.upsertQuizQuestion(quizQuestionsRepository: QuizQuestionsRepository) {
    post(path = "/quiz/questions") {
        val question = call.receive<QuizQuestion>()
        call.respond(message = "Question receives", status = HttpStatusCode.Created)
    }
}