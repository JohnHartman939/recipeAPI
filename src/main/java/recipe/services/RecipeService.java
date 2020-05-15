package recipe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recipe.DTOs.IngredientDTO;
import recipe.DTOs.RecipeDTO;
import recipe.DTOs.StepDTO;
import recipe.Factories.DTOFactories.IngredientDTOFactory;
import recipe.Factories.DTOFactories.RecipeDTOFactory;
import recipe.Factories.DTOFactories.StepDTOFactory;
import recipe.Factories.objectFactories.*;
import recipe.objects.*;
import recipe.repos.*;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepo recipeRepo;
    private RecipeDTOFactory recipeDTOFactory = new RecipeDTOFactory();
    private IngredientDTOFactory ingredientDTOFactory = new IngredientDTOFactory();
    private StepDTOFactory stepDTOFactory = new StepDTOFactory();
    private RecipeFactory recipeFactory=new RecipeFactory();
    private IngredientListFactory ingredientListFactory= new IngredientListFactory();
    private IngredientFactory ingredientFactory = new IngredientFactory();
    private UnitFactory unitFactory = new UnitFactory();
    private StepFactory stepFactory = new StepFactory();

    public RecipeDTO getLatestRecipe() {
        Recipe recipe = recipeRepo.findTopOneByOrderByDateAddedDesc();
        RecipeDTO recipeDTO = recipeDTOFactory.makeRecipeDTO(recipe);
        for(IngredientsList ingredientsList:recipe.getIngredientsList()){
            recipeDTO.getIngredientList().add(ingredientDTOFactory.makeIngredientDTO(ingredientsList));
        }

        for(Steps step:recipe.getStepsList()){
            recipeDTO.getStepList().add(stepDTOFactory.makeStepDTO(step));
        }
        return recipeDTO;
    }

    public void addRecipe(RecipeDTO recipeDto){
        Recipe recipe = recipeFactory.makeRecipe(recipeDto);
        for(IngredientDTO ingredientDTO:recipeDto.getIngredientList()){
            IngredientsList ingredientsList = ingredientListFactory.makeIngredientsList(ingredientDTO);
            ingredientsList.setUnit(unitFactory.makeUnit(ingredientDTO));
            ingredientsList.setIngredients(ingredientFactory.makeIngredient(ingredientDTO));
            recipe.getIngredientsList().add(ingredientsList);
        }

        for(StepDTO stepDTO:recipeDto.getStepList()){
            recipe.getStepsList().add(stepFactory.makeStep(stepDTO));
        }
        recipeRepo.save(recipe);
    }
}
