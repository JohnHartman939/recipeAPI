package recipe.objects;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "ingredients")
public class Ingredients implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="ingredientID")
    private int ingredientID;

    @Column(name="ingredientName")
    private String ingredientName;


    @JsonIgnore
    @OneToMany(mappedBy = "ingredients")
    private Set<IngredientsList> ingredientsList;

    public int getIngredientID() {
        return ingredientID;
    }

    public void setIngredientID(int ingredientID) {
        this.ingredientID = ingredientID;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public Set<IngredientsList> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(Set<IngredientsList> ingredients) {
        this.ingredientsList = ingredients;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ingredientID);
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ingredients other = (Ingredients) obj;
        return Objects.equals(ingredientID, other.getIngredientID());
    }
}
