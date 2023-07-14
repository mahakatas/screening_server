
package com.zimttech.screening.controller;


import com.zimttech.screening.domain.TreatmentData;
import com.zimttech.screening.services.TreatmentDataService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/screening")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class TreatmentDataController {
    private final TreatmentDataService treatmentDataService;


    @GetMapping(path = "/treatmentData")
    public @ResponseBody Iterable<TreatmentData> getAllTreatmentData() {

        return treatmentDataService.fetchAllTreatments();

    }

    @PostMapping(path = "/addTreatment")
    public @ResponseBody Boolean add(@RequestBody TreatmentData treatmentData) {
        return treatmentDataService.addTreatmentData(treatmentData);
    }

    @RequestMapping(path = "/deleteTreatmentData/{patientNumber}")
    @ResponseBody
    public Iterable<TreatmentData> delete(@PathVariable String patientNumber) {

        return treatmentDataService.deleteTreatmentData(patientNumber);
    }

    @PutMapping("/updateTreatmentData")
    @ResponseBody
    public TreatmentData update(@RequestBody TreatmentData treatmentData) {
        return treatmentDataService.updateTreatmentData(treatmentData);

    }

    @RequestMapping("/findTreatmentData/{patientNumber}")
    public TreatmentData find(@PathVariable String patientNumber) {

        return treatmentDataService.findTreatmentData(patientNumber);
    }

}