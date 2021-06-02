package com.example.recipeapp.network.models

import com.example.recipeapp.domain.models.Recipe
import com.example.recipeapp.domain.util.DomainMapper

class RecipeDTOMapper : DomainMapper <RecipeDTO, Recipe> {

    override fun mapToDomainModel(model: RecipeDTO): Recipe {
        return Recipe(
            id = model.pk,
            title = model.title,
            publisher = model.publisher,
            featuredImage = model.featuredImage,
            rating = model.rating,
            description = model.description,
            cookingInstructions = model.cookingInstructions,
            ingredients = model.ingredients,
            dateAdded = model.dateAdded,
            dateUpdated = model.dateUpdated,
            longDateAdded = model.longDateAdded,
            longDateUpdated = model.longDateUpdated,
        )
    }

    override fun mapFromDomainModel(domain: Recipe): RecipeDTO {
        return RecipeDTO(
            pk = domain.id,
            title = domain.title,
            publisher = domain.publisher,
            featuredImage = domain.featuredImage,
            rating = domain.rating,
            description = domain.description,
            cookingInstructions = domain.cookingInstructions,
            ingredients = domain.ingredients,
            dateAdded = domain.dateAdded,
            dateUpdated = domain.dateUpdated,
            longDateAdded = domain.longDateAdded,
            longDateUpdated = domain.longDateUpdated,
        )
    }

    fun toDomainList(initial: List<RecipeDTO>) : List<Recipe> {
        return initial.map{mapToDomainModel(it)}
    }

    fun fromDomainList(initial: List<Recipe>): List<RecipeDTO>{
        return initial.map{mapFromDomainModel(it)}
    }
}