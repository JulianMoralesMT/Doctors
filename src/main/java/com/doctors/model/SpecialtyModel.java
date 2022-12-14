package com.doctors.model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table (name = "specialty")

public class SpecialtyModel implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;
    private String description;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "specialty")
    @JsonIgnoreProperties("specialty")
    private List<DoctorModel> doctors;

    public SpecialtyModel() {
    }
    public SpecialtyModel(Integer id, String name, String description, List<DoctorModel> doctors) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.doctors = doctors;
    }
    public SpecialtyModel(String name, String description, List<DoctorModel> doctors) {
        this.name = name;
        this.description = description;
        this.doctors = doctors;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<DoctorModel> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<DoctorModel> doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "SpecialtyModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", doctors=" + doctors +
                '}';
    }
}
