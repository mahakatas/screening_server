
package com.zimttech.screening.controller;


import com.zimttech.screening.domain.BloodGlucose;
import com.zimttech.screening.services.BloodGlucoseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/screening")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class BloodGlucoseController {
    private final BloodGlucoseService bloodGlucoseService;


    @GetMapping(path = "/bloodGlucoses")
    public @ResponseBody Iterable<BloodGlucose> getAllBloodGlucoses() {

        return bloodGlucoseService.fetchAllBGs();

    }

    @PostMapping(path = "/addBG")
    public @ResponseBody Boolean add(@RequestBody BloodGlucose bloodGlucose) {
        return bloodGlucoseService.addBloodGlucose(bloodGlucose);
    }

    @RequestMapping(path = "/deleteBloodGlucose/{patientNumber}")
    @ResponseBody
    public Iterable<BloodGlucose> delete(@PathVariable String patientNumber) {

        return bloodGlucoseService.deleteBloodGlucose(patientNumber);
    }

    @PutMapping("/updateBloodGlucose")
    @ResponseBody
    public BloodGlucose update(@RequestBody BloodGlucose bloodGlucose) {
        return bloodGlucoseService.updateBloodGlucose(bloodGlucose);

    }

    @RequestMapping("/findBloodGlucose/{patientNumber}")
    public BloodGlucose find(@PathVariable String patientNumber) {

        return bloodGlucoseService.findBloodGlucose(patientNumber);
    }

}