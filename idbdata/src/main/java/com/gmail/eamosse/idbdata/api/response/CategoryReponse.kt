package com.gmail.eamosse.idbdata.api.response

import com.google.gson.annotations.SerializedName

data class CategoryResponse(
    @SerializedName("genres")
    val genres: List<Genre>
) {
    data class Genre(
        @SerializedName("id")
        val id: Int,
        @SerializedName("name")
        val name: String
    )
}