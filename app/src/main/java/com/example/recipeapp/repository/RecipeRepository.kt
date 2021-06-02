package com.example.recipeapp.repository

import com.example.recipeapp.domain.models.Recipe

interface RecipeRepository {

    suspend fun searchRecipe (token: String, page: Int, query: String) : List<Recipe>

    suspend fun getRecipe(token: String, id: Int) : Recipe
}