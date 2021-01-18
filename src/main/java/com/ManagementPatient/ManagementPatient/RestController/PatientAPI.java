package com.ManagementPatient.ManagementPatient.RestController;

import com.ManagementPatient.ManagementPatient.Entity.*;
import com.ManagementPatient.ManagementPatient.Repository.DoctorRepository;
import com.ManagementPatient.ManagementPatient.Repository.PatientRepository;
import com.ManagementPatient.ManagementPatient.Service.PatientService;
import com.ManagementPatient.ManagementPatient.Service.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientAPI {
    @Autowired
    private PatientService patientService;
    @Autowired
    private TreatmentService treatmentService;
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private PatientRepository patientRepository;

    @PostMapping("/api/patient")
    public BaseResponse CreatePatient(@RequestBody Patient patient){
        List<Patient> patients = doctorRepository.findPatients(patient.getDoctor().getId());
        if(patients.size() >= 15) {
            BaseResponse response = new BaseResponse();
            response.setMessage("Failed");
            response.setStatus(false);
            response.setData(null);
            return response;
        }
        //post patient
        Patient resultPatient = patientService.savePatient(patient);

        //post data id patient, id doctor ke table treatment
        Treatments modelTreatment = new Treatments();
        modelTreatment.setPatient(resultPatient);
        modelTreatment.setStatus(false);
        modelTreatment.setDoctor(resultPatient.getDoctor());

        Treatments treatmentPatient = treatmentService.createTreatment(modelTreatment);

        PatientTreatmentViewModel viewModel = new PatientTreatmentViewModel();
        viewModel.setIdPatient(resultPatient.getId());
        viewModel.setIdDoctor(modelTreatment.getDoctor().getId());
        viewModel.setStatus(treatmentPatient.getStatus());
        viewModel.setReceipt(treatmentPatient.getReceipt());

        BaseResponse response = new BaseResponse();
        response.setMessage("Success");
        response.setStatus(true);
        response.setData(viewModel);
        return response;

    }

    @GetMapping("/api/patients")
    public List<Patient> GetPatient(){
        return patientService.getPatient();
    }

    @GetMapping("/api/patients/{id}")
    public Patient GetPatientById(@PathVariable int id){
        return patientService.getPatientById(id);
    }

    @PutMapping("/api/patients/{id}")
    public Patient UpdatePatient(@PathVariable Integer id, @RequestBody Patient patient){
        return patientService.updatePatient(id,patient);
    }

    @DeleteMapping("/api/patients/{id}")
    public String DeletePatient(@PathVariable int id){
        return patientService.deletePatient(id);
    }
}
