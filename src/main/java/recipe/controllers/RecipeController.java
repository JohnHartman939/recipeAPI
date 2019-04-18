package recipe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import recipe.DTOs.IngredientListDTO;
import recipe.DTOs.RecipeDTO;
import recipe.objects.Recipe;
import recipe.services.RecipeService;

import java.util.List;

@RestController
@RequestMapping(value = "recipe")
public class RecipeController {
    @Autowired
    private RecipeService recipeService;

    @GetMapping
    public RecipeDTO getLatestRecipe(@RequestParam(name = "half", required = false)boolean half, @RequestParam(name = "double",required = false)boolean doubleRecipe){
        RecipeDTO recipeDTO=recipeService.getLatestRecipe();
        if(half!=doubleRecipe && half){
            for(IngredientListDTO ingredientListDTO:recipeDTO.getIngredientList()){
                ingredientListDTO.halveIngredient();
            }
        }
        if(half!=doubleRecipe && doubleRecipe){
            for(IngredientListDTO ingredientListDTO:recipeDTO.getIngredientList()){
                ingredientListDTO.doubleIngredient();
            }
        }
        return recipeDTO;
    }

    @PostMapping
    public void addRecipe(@RequestBody Recipe recipe){
        recipeService.addRecipe(recipe);
    }
}
