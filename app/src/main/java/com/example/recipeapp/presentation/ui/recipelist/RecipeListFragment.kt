package com.example.recipeapp.presentation.ui.recipelist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.recipeapp.presentation.components.RecipeCard
import dagger.hilt.android.AndroidEntryPoint
import androidx.compose.ui.Modifier

@AndroidEntryPoint
class RecipeListFragment: Fragment() {

    val viewModel: RecipeListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return ComposeView(requireContext()).apply{
            setContent {

                val recipe = viewModel.recipe.value

                LazyColumn(
                    modifier = Modifier
                        .padding(
                            start = 8.dp,
                            end = 8.dp
                        )
                ) {
                    itemsIndexed(items = recipe){ index, recipe ->
                        RecipeCard(recipe = recipe, onClick = {})
                    }
                }
            }
        }
    }
}