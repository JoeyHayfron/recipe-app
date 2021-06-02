package com.example.recipeapp.repository

import com.example.recipeapp.domain.models.Recipe
import com.example.recipeapp.network.RetrofitService
import com.example.recipeapp.network.models.RecipeDTOMapper
import javax.inject.Inject

class RecipeRepositoryImpl
@Inject constructor(
    private val recipeService: RetrofitService,
    private val mapper: RecipeDTOMapper,
) : RecipeRepository {
    override suspend fun searchRecipe(token: String, page: Int, query: String): List<Recipe> {
        return mapper.toDomainList(recipeService.search(token, page, query).recipes)
    }

    override suspend fun getRecipe(token: String, id: Int): Recipe {
        return mapper.mapToDomainModel(recipeService.get(token, id))
    }
}