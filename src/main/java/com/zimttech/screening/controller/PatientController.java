package com.zimttech.screening.controller;


import com.zimttech.screening.domain.Patient;
import com.zimttech.screening.services.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/screening")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class PatientController {
    private final PatientService patientService;


    @GetMapping(path = "/patients")
    public @ResponseBody Iterable<Patient> getAllPatients() {

        return patientService.fetchAllPatients();

    }

    @PostMapping(path = "/addPatient")
    public @ResponseBody Boolean add(@RequestBody Patient patient) {
        return patientService.addPatient(patient);
    }

    @RequestMapping(path = "/deletePatient/{patientNumber}")
    @ResponseBody
    public Iterable<Patient> delete(@PathVariable String patientNumber) {

        return patientService.deletePatient(patientNumber);
    }

    @PutMapping("/updatePatient/{patientNumber}")
    @ResponseBody
    public Iterable<Patient> update(@PathVariable String patientNumber, @RequestBody Patient patient) {
        return patientService.updatePatient(patientNumber, patient);

    }

    @RequestMapping("/findPatient/{patientNumber}")
    public Patient find(@PathVariable String patientNumber) {

        return patientService.findPatient(patientNumber);
    }

    @RequestMapping("/patientDecision/{patientNumber}")
    public Patient getDecision(@PathVariable String patientNumber) {

        return patientService.getPatientDecision(patientNumber);
    }
}
