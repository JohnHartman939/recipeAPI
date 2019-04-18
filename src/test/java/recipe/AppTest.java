package recipe;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import recipe.DTOs.IngredientDTO;
import recipe.Factories.IngredientDTOFactory;
import recipe.objects.Ingredients;
import recipe.objects.IngredientsList;
import recipe.objects.Unit;

public class AppTest 
{
    private IngredientsList ingredientsList=new IngredientsList();
    private Unit unit= new Unit();
    private Ingredients ingredients=new Ingredients();

    @Test
    public void testHalveTablespoon() {
        unit.setUnitName("Tbsp");
        ingredients.setIngredientName("Milk");
        ingredientsList.setUnit(unit);
        ingredientsList.setIngredients(ingredients);
        ingredientsList.setQuantity((float) 1);
        IngredientDTOFactory ingredientDTOFactory =new IngredientDTOFactory();
        IngredientDTO ingredientDTO = ingredientDTOFactory.makeIngredientListDTO(ingredientsList);
        IngredientDTO halved = ingredientDTO.halveIngredient();
        Assert.assertEquals((float) 1.5, halved.getQuantity(),0);
        Assert.assertTrue(halved.getUnit().equals("tsp"));
    }
}
