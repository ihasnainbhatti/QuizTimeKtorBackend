package com.nainnie.presentation.routes.quiz_question

import com.nainnie.domain.repository.QuizQuestionsRepository
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.deleteQuizQuestionById(
    quizQuestionsRepository: QuizQuestionsRepository
){
    delete(path = "/quiz/questions/{questionId}") {
      val id =  call.pathParameters["questionId"]
        if (id.isNullOrBlank()) {
            call.respond(message = "Id is required", status = HttpStatusCode.BadRequest)
            return@delete
        }
        quizQuestionsRepository.deleteQuestionById(id)
        call.respondText("Quiz question is deleted")
    }
}