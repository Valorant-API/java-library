package com.thoo.api.models

class Gamemode(
    val uuid: String,
    val displayName: String,
    val duration: String,
    val isTeamVoiceAllowed: Boolean,
    val isMinimapHidden: Boolean,
    val orbCount: Int,
    val teamRoles: Array<String>?,
    val gameFeatureOverrides: Array<OverriddenGameFeature>?,
    val displayIcon: String,
    val assetPath: String
)

class OverriddenGameFeature(
    val featureName: String,
    val state: Boolean
)

class GamemodeEquippable(
    val uuid: String,
    val displayName: String,
    val category: String,
    val displayIcon: String,
    val killStreamIcon: String,
    val assetPath: String
)