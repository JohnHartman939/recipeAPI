package recipe.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import recipe.scaler.doublers.DoublerInterface;
import recipe.scaler.halvers.HalverInterface;
import recipe.objects.IngredientsList;


public class IngredientDTO {

    @JsonIgnore
    private DoublerInterface doubler;
    @JsonIgnore
    private HalverInterface halver;

    public IngredientDTO(IngredientsList ingredients){
        this.setQuantity(ingredients.getQuantity());
        this.setUnit(ingredients.getUnit().getUnitName());
        this.setIngredientName(ingredients.getIngredients().getIngredientName());
    }

    public IngredientDTO(){}

    private float quantity;
    private String unit;
    private String ingredientName;

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public void doubleIngredient(){
        System.err.println(doubler.getClass().getName()+ "hjkjdn");
        doubler.doubleIngredient(this);
    }

    public void halveIngredient(){
        System.err.println(halver.getClass().getName()+ "kjndckjn");
        halver.halveIngredient(this);
    }

    public DoublerInterface getDoubler() {
        return doubler;
    }

    public void setDoubler(DoublerInterface doubler) {
        this.doubler = doubler;
    }

    public HalverInterface getHalver() {
        return halver;
    }

    public void setHalver(HalverInterface halver) {
        this.halver = halver;
    }
}
