package com.example.recipeapp.network.responses

import com.example.recipeapp.network.models.RecipeDTO
import com.google.gson.annotations.SerializedName

data class RecipeSearchResponse(
    @SerializedName("count")
    var count: Int,

    @SerializedName("results")
    var recipes: List<RecipeDTO>
)