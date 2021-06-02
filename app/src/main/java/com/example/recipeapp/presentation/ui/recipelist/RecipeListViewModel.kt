package com.example.recipeapp.presentation.ui.recipelist

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipeapp.domain.models.Recipe
import com.example.recipeapp.network.RetrofitService
import com.example.recipeapp.network.models.RecipeDTOMapper
import com.example.recipeapp.repository.RecipeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class RecipeListViewModel @Inject constructor(
     @Named("auth_token")private val authToken: String,
    private val recipeService: RecipeRepository
) : ViewModel() {

    val recipe: MutableState<List<Recipe>> = mutableStateOf(listOf())
    init {
        viewModelScope.launch {
            recipe.value = recipeService.searchRecipe(authToken, 1, "chicken")
        }
    }
}