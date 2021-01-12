package com.thoo.api.models

class Budy(
     val uuid: String,
     val displayName: String,
     val themeUuid: String?,
     val displayIcon: String,
     val assetPath: String,
     val isHiddenIfNotOwned: Boolean
)