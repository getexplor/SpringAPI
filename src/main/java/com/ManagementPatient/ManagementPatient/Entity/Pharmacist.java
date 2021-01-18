package com.ManagementPatient.ManagementPatient.Entity;

import javax.persistence.*;

@Entity
public class Pharmacist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "TINYINT(1) default 0")
    private Boolean status;
    private String medicine;
    private Integer totalMedicine;

    @ManyToOne
    @JoinColumn(name="id_treatment")
    private Treatments treatments;

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

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public Integer getTotalMedicine() {
        return totalMedicine;
    }

    public void setTotalMedicine(Integer totalMedicine) {
        this.totalMedicine = totalMedicine;
    }

    public Treatments getTreatments() {
        return treatments;
    }

    public void setTreatments(Treatments treatments) {
        this.treatments = treatments;
    }

    public Pharmacist(Integer id, Boolean status, String medicine, Integer totalMedicine, Treatments treatments) {
        this.id = id;
        this.status = status;
        this.medicine = medicine;
        this.totalMedicine = totalMedicine;
        this.treatments = treatments;
    }

    public Pharmacist(){

    }
}
