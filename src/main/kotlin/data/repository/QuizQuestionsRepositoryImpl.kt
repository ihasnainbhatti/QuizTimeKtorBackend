package com.nainnie.data.repository

import com.nainnie.domain.model.QuizQuestion
import com.nainnie.domain.repository.QuizQuestionsRepository
import io.ktor.server.request.*

class QuizQuestionsRepositoryImpl : QuizQuestionsRepository {
    val questions = mutableListOf<QuizQuestion>()
    override fun upsertQuestion(question: QuizQuestion) {
        questions.add(question)
    }

    override fun getAllQuestions(topicId: Int?, limit: Int?): List<QuizQuestion> {
        val filteredList = questions.filter { it.topicCode == topicId }
            .take(limit ?: 1)
        return filteredList
    }

    override fun getQuestionById(id: String?): QuizQuestion {
        return questions.first { it.id == id }
    }

    override fun deleteQuestionById(id: String?): Boolean {

        return questions.removeIf { id == it.id }
    }
}