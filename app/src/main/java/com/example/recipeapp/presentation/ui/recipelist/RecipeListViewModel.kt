package com.example.recipeapp.presentation.ui.recipelist

import androidx.lifecycle.ViewModel
import com.example.recipeapp.network.RetrofitService
import com.example.recipeapp.network.models.RecipeDTOMapper
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RecipeListViewModel @Inject constructor(
    private val randomString: String,
    private val recipeService: RetrofitService
) : ViewModel() {

    init {
        println("VIEWMODEL: ${randomString}")
    }
}