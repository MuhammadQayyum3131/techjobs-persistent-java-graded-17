package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {
    @Size(min =3, max = 500, message = "Invalid name. Must be between 3 and 500 characters.")
    private String description;

    public Skill() {}
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
