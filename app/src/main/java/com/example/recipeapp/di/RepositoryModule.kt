package com.example.recipeapp.di

import com.example.recipeapp.network.RetrofitService
import com.example.recipeapp.network.models.RecipeDTOMapper
import com.example.recipeapp.repository.RecipeRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRecipeRepository(
        recipeService: RetrofitService,
        mapper: RecipeDTOMapper
    ): RecipeRepositoryImpl{
        return RecipeRepositoryImpl(recipeService, mapper)
    }

}