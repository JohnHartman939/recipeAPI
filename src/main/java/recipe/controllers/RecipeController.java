package recipe.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import recipe.DTOs.IngredientDTO;
import recipe.DTOs.RecipeDTO;
import recipe.objects.Recipe;
import recipe.scaler.RecipeScaler;
import recipe.services.RecipeService;

import java.util.ArrayList;

// make a scaler package...should have list of halvers and doublers

@RestController
@RequestMapping(value = "recipe")
public class RecipeController {
    @Autowired
    private RecipeService recipeService;

    @Autowired
    private ModelMapper modelMapper;

    private RecipeScaler recipeScaler = new RecipeScaler();

    @GetMapping
    public RecipeDTO getLatestRecipe(@RequestParam(name = "half", required = false)boolean half, @RequestParam(name = "double",required = false)boolean doubleRecipe){
        RecipeDTO recipeDTO=recipeService.getLatestRecipe();
        if(half!=doubleRecipe && half){
            recipeScaler.halfRecipe(recipeDTO);
        }
        if(half!=doubleRecipe && doubleRecipe){
            recipeScaler.doubleRecipe(recipeDTO);
        }
        return recipeDTO;
    }

    @PostMapping
    public void addRecipe(@RequestBody RecipeDTO recipeDto){
        recipeService.addRecipe(recipeDto);
    }
}
