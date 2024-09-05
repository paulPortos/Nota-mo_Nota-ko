package com.group1.notamonotako.api.requests_responses.flashcards

import com.google.gson.annotations.SerializedName

data class FlashcardsResponse(
    val id: Int,
    val title: String,
    val cards: List<String>,
    val public: Boolean,
    @SerializedName("to_public")
    val toPublic: Boolean
)
