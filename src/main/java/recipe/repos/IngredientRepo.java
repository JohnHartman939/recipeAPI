package recipe.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import recipe.objects.Ingredients;
import recipe.objects.Recipe;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IngredientRepo extends JpaRepository<Ingredients,Integer> {
    Ingredients findByIngredientId(int ingredientId);
}