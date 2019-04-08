package recipe.objects;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "ingredients")
public class Ingredients {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="ingredientID")
    private int ingredientID;

    @Column(name="ingredientName")
    private String ingredientName;

//    @OneToMany(mappedBy = "ingredient")
//    private List<IngredientsList> ingredientsList;
//
    @OneToMany(mappedBy = "ingredients")
    private Set<IngredientsList> ingredients;

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
        return ingredients;
    }

    public void setIngredientsList(Set<IngredientsList> ingredients) {
        this.ingredients = ingredients;
    }


}
