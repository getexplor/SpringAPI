package com.ManagementPatient.ManagementPatient.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String name;
    private String treatment;

    @Column(columnDefinition = "TINYINT(1) default 0")
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "id_doctor")
    private Doctor doctor;

    @OneToMany(mappedBy = "patient")
    private Set<Treatments> treatmentsSet = new HashSet<>();

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Patient(){

    }

    public Patient(Integer id, String name, String treatment, Boolean status, Doctor doctor) {
        Id = id;
        this.name = name;
        this.treatment = treatment;
        this.status = status;
        this.doctor = doctor;
    }


}
