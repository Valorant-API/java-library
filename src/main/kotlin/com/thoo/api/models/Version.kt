package com.thoo.api.models

import java.util.*

data class Version(
    val branch: String,
    val version: String,
    val buildVersion: String,
    val buildDate: Date
)