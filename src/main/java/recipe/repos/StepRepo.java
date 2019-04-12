package recipe.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import recipe.objects.Steps;

import java.util.List;

@Repository
public interface StepRepo extends JpaRepository<Steps,Integer> {
    List<Steps> findByRecipeId(int recipeId);
}
