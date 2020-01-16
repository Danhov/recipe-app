package com.hovorun.services;

import com.hovorun.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long id);
    IngredientCommand saveIngredientCommand(IngredientCommand command);
    void deleteIngredientById(Long recipeId, Long ingredientId);

}
