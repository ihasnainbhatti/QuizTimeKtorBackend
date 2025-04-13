package com.nainnie.domain.repository

import com.nainnie.domain.model.QuizQuestion

interface QuizQuestionsRepository {
    fun upsertQuestion(question: QuizQuestion)
    fun getAllQuestions(topicId: Int?, limit: Int?): List<QuizQuestion>
    fun getQuestionById(id: String?): QuizQuestion?
    fun deleteQuestionById(id: String?): Boolean
}