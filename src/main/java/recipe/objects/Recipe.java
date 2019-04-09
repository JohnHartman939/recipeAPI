package recipe.objects;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="recipe")
public class Recipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="recipeid")
    private int recipeId;

    @Column(name="recipeName")
    private String recipeName;

    @Column(name = "dateAdded", columnDefinition = "TIMESTAMP")
    private LocalDateTime dateAdded;

    @OneToMany(mappedBy = "recipe" ,fetch = FetchType.LAZY)
    private Set<IngredientsList> ingredients;

    @OneToMany(mappedBy = "stepKey.recipeId", fetch = FetchType.LAZY)
    private List<Steps> stepsList;

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    public List<Steps> getStepsList() {
        return stepsList;
    }

    public void setStepsList(List<Steps> stepsList) {
        this.stepsList = stepsList;
    }

    public Set<IngredientsList> getIngredients() {
        return ingredients;
    }

    public void setIngredientsList(Set<IngredientsList> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(recipeId);
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Recipe other = (Recipe) obj;
        return Objects.equals(recipeId, other.getRecipeId());
    }
}
