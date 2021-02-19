package com.thoo.api.models

import java.util.*

class Season(
    val uuid: String,
    val displayName: String,
    val startTime: Date,
    val endTime: Date,
    val borders: Array<SeasonBorder>,
    val assetPath: String
)

class SeasonBorder(
    val uuid: String,
    val winsRequired: Int,
    val level: Int,
    val displayIcon: String,
    val smallIcon: String,
    val assetPath: String
)