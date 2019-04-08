package recipe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recipe.objects.Recipe;
import recipe.repos.RecipeRepo;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepo recipeRepo;

    public Recipe getLatestRecipe() {
        return recipeRepo.findTopOneByOrderByDateAddedDesc();
        //return recipeRepo.findAll();
    }

    public void addRecipe(Recipe recipe){
        recipe.setDateAdded(LocalDateTime.now());
        recipeRepo.save(recipe);
    }
}
