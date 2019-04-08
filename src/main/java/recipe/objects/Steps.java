package recipe.objects;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Steps")
public class Steps {



    @EmbeddedId
    private StepKey stepKey;

    @Column(name = "description")
    private String description;

    public StepKey getStepKey() {
        return stepKey;
    }

    public void setStepKey(StepKey stepKey) {
        this.stepKey = stepKey;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
