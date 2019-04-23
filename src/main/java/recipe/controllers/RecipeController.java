package recipe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import recipe.DTOs.IngredientDTO;
import recipe.DTOs.RecipeDTO;
import recipe.objects.Recipe;
import recipe.services.RecipeService;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "recipe")
public class RecipeController {
    @Autowired
    private RecipeService recipeService;

    @GetMapping
    public RecipeDTO getLatestRecipe(@RequestParam(name = "half", required = false)boolean half, @RequestParam(name = "double",required = false)boolean doubleRecipe){
        RecipeDTO recipeDTO=recipeService.getLatestRecipe();
        if(half!=doubleRecipe && half){
            for(IngredientDTO ingredientDTO :recipeDTO.getIngredientList()){
                ingredientDTO.halveIngredient();
            }
        }
        if(half!=doubleRecipe && doubleRecipe){
            for(IngredientDTO ingredientDTO :recipeDTO.getIngredientList()){
                ingredientDTO.doubleIngredient();
            }
        }
        return recipeDTO;
    }

    @PostMapping
    public void addRecipe(@RequestBody Recipe recipe){
        recipeService.addRecipe(recipe);
    }
}
