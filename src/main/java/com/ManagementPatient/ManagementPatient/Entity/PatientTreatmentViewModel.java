package com.ManagementPatient.ManagementPatient.Entity;

public class PatientTreatmentViewModel{
    private Integer IdPatient;
    private Integer IdDoctor;
    private String Receipt;
    private Boolean Status;


    public Integer getIdPatient() {
        return IdPatient;
    }

    public void setIdPatient(Integer idPatient) {
        IdPatient = idPatient;
    }

    public Integer getIdDoctor() {
        return IdDoctor;
    }

    public void setIdDoctor(Integer idDoctor) {
        IdDoctor = idDoctor;
    }

    public String getReceipt() {
        return Receipt;
    }

    public void setReceipt(String receipt) {
        Receipt = receipt;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }
}
