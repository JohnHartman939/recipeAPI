package recipe.objects;

import recipe.DTOs.IngredientDTO;

import javax.persistence.*;

@Entity
@Table(name = "Unit")
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "unit_id")
    private int unitId;

    @Column(name="unit_name")
    private  String unitName;

    public Unit(){}

    public Unit(IngredientDTO ingredientDTO){
        unitName=ingredientDTO.getUnit();
    }

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
}
