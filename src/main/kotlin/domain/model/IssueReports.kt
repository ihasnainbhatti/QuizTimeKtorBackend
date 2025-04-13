package com.nainnie.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class IssueReports(
    val id:String?= null,
    val questionID:String,
    val issueType:String,
    val additionalComments:String?,
    val userEmail:String? ,
    val timeStamp:String
)
