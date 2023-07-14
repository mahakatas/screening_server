package com.zimttech.screening.controller;


import com.zimttech.screening.domain.Weight;
import com.zimttech.screening.services.WeightService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;


@Controller
@RequestMapping(path = "/screening")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class WeightController {
    private final WeightService weightService;


    @GetMapping(path = "/weights")
    public @ResponseBody Iterable<Weight> getAllWeights() {

        return weightService.fetchAllWeights();

    }

    @PostMapping(path = "/addWeight")
    public @ResponseBody Boolean add(@RequestBody Weight weight) {
        return weightService.addWeight(weight);
    }

    @RequestMapping(path = "/deleteWeight/{patientNumber}")
    @ResponseBody
    public Iterable<Weight> delete(@PathVariable String patientNumber) {

        return weightService.deleteWeight(patientNumber);
    }

    @PutMapping("/updateWeight")
    @ResponseBody
    public Weight update(@RequestBody Weight weight) {
        return weightService.updateWeight(weight);

    }

    @RequestMapping("/findWeight/{patientNumber}")
    public Weight find(@PathVariable String patientNumber) {

        return weightService.findWeight(patientNumber);
    }

}
