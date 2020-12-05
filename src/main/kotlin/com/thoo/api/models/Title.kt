package com.thoo.api.models

class Title(
    val uuid: String,
    val displayName: String,
    val isbHiddenIfNotOwner: Boolean,
    val assetPath: String
)