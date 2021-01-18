package com.ManagementPatient.ManagementPatient.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Treatments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "TINYINT(1) default 0")
    private Boolean status;
    private String receipt;

    @ManyToOne
    @JoinColumn(name = "id_doctor")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "id_patient")
    private Patient patient;

    @OneToMany(mappedBy = "treatments")
    private Set<Pharmacist> pharmacistSet;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public Treatments(){

    }

    public Treatments(Integer id, Boolean status, String receipt, Doctor doctor, Patient patient) {
        this.id = id;
        this.status = status;
        this.receipt = receipt;
        this.doctor = doctor;
        this.patient = patient;
    }
}
