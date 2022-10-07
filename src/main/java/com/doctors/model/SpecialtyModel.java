package com.doctors.model;



import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table (name = "specialty")

public class SpecialtyModel implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Integer id;

    private String name;

    private String description;


    public SpecialtyModel() {
    }

    public SpecialtyModel(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public SpecialtyModel(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }


    @Override
    public String toString() {
        return "SpecialtyModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
