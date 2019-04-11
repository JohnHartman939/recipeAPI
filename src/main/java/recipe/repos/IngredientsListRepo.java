package recipe.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import recipe.objects.IngredientsList;

import java.util.List;

@Repository

public interface IngredientsListRepo extends JpaRepository<IngredientsList,Integer> {
    List<IngredientsList> findByRecipeId(int recipeId);
}
