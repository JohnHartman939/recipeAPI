package recipe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import recipe.objects.Recipe;
import recipe.services.RecipeService;

import java.util.List;

@RestController
@RequestMapping(value = "recipe")
public class RecipeController {
    @Autowired
    private RecipeService recipeService;

    @GetMapping
    public Recipe getLatestRecipe(){
        return recipeService.getLatestRecipe();
    }

    @PostMapping
    public void addRecipe(@RequestBody Recipe recipe){
        recipeService.addRecipe(recipe);
    }
}
