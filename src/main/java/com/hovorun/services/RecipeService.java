package com.hovorun.services;

import com.hovorun.commands.RecipeCommand;
import com.hovorun.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set <Recipe> getRecipes();
    Recipe findById(Long id);

    RecipeCommand findCommandById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long id);
}
