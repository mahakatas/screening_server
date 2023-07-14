package com.zimttech.screening.controller;


import com.zimttech.screening.domain.BloodPressure;
import com.zimttech.screening.domain.Weight;
import com.zimttech.screening.services.BloodPressureService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;


@Controller
@RequestMapping(path = "/screening")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class BloodPressureController {
    private final BloodPressureService bloodPressureService;


    @GetMapping(path = "/bloodPressures")
    public @ResponseBody Iterable<BloodPressure> getAllBloodPressures() {

        return bloodPressureService.fetchAllBPs();

    }

    @PostMapping(path = "/addBP")
    public @ResponseBody Boolean add(@RequestBody BloodPressure bloodPressure) {
        return bloodPressureService.addBloodPressure(bloodPressure);
    }

    @RequestMapping(path = "/deleteBloodPressure/{patientNumber}")
    @ResponseBody
    public Iterable<BloodPressure> delete(@PathVariable String patientNumber) {

        return bloodPressureService.deleteBloodPressure(patientNumber);
    }

    @PutMapping("/updateBloodPressure")
    @ResponseBody
    public Iterable<BloodPressure> update(@RequestBody BloodPressure bloodPressure) {
        return bloodPressureService.updateBloodPressure(bloodPressure);

    }

    @RequestMapping("/findBloodPressure/{patientNumber}")
    public BloodPressure find(@PathVariable String patientNumber) {

        return bloodPressureService.findBloodPressure(patientNumber);
    }

}