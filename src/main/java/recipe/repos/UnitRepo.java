package recipe.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import recipe.objects.Recipe;
import recipe.objects.Unit;

public interface UnitRepo extends JpaRepository<Unit,Integer> {
    Unit findByUnitId(int unitId);
}
