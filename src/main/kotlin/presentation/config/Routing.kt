package com.nainnie.presentation.config

import com.nainnie.data.repository.QuizQuestionsRepositoryImpl
import com.nainnie.presentation.routes.quiz_question.deleteQuizQuestionById
import com.nainnie.presentation.routes.quiz_question.getAllQuizQuestions
import com.nainnie.presentation.routes.quiz_question.getQuestionByQuestionId
import com.nainnie.presentation.routes.quiz_question.upsertQuizQuestion
import com.nainnie.presentation.routes.root
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting(){
    val quizQuestionsRepository = QuizQuestionsRepositoryImpl()
    routing {
        root()
        getAllQuizQuestions(quizQuestionsRepository)
        upsertQuizQuestion(quizQuestionsRepository)
        deleteQuizQuestionById(quizQuestionsRepository)
        getQuestionByQuestionId(quizQuestionsRepository)
    }
}