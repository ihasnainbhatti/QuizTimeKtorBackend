package com.nainnie.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class QuizQuestion(
    val id:String? = null,
    val question:String,
    val correctAnswer:String,
    val incorrectAnswer:List<String>,
    val explanation:String,
    val topicCode:Int
)
