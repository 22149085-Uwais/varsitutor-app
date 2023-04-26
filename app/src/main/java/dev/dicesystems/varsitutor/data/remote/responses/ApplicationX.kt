package dev.dicesystems.varsitutor.data.remote.responses

import java.io.File

data class ApplicationX(
    val vacancy_id: Int,
    val user_id: Int,
    val contact_number: String,
    val email: String,
    val job_title: String?,
    val duration: Float?,
    val company_department: String?,
    val motivation: String,
    val attachment: File
)
