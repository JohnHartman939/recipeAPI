package recipe.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import recipe.objects.Recipe;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface RecipeRepo extends JpaRepository<Recipe,Integer> {
    List<Recipe> findByDateAddedBetween(LocalDateTime start, LocalDateTime end);
    Recipe findTopOneByOrderByDateAddedDesc();
}
