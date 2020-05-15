package recipe.objects;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import recipe.DTOs.IngredientDTO;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "ingredients")
public class Ingredients implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ingredientid")
    private int ingredientId;

    @Column(name="ingredientName")
    private String ingredientName;


    @JsonIgnore
    @OneToMany(mappedBy = "ingredients")
    private Set<IngredientsList> ingredientsList;

    public Ingredients(){}

    public Ingredients(IngredientDTO ingredientDTO){
        ingredientName=ingredientDTO.getIngredientName();
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientID(int ingredientId) {
        this.ingredientId = ingredientId;
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
}
