package com.zimttech.screening.controller;


import com.zimttech.screening.domain.Height;
import com.zimttech.screening.services.HeightService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;


@Controller
@RequestMapping(path = "/screening")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class HeightController {
    private final HeightService heightService;


    @GetMapping(path = "/heights")
    public @ResponseBody Iterable<Height> getAllHeights() {

        return heightService.fetchAllHeights();

    }

    @PostMapping(path = "/addHeight")
    public @ResponseBody Boolean add(@RequestBody Height height) {
        return heightService.addHeight(height);
    }

    @RequestMapping(path = "/deleteHeight/{patientNumber}")
    @ResponseBody
    public Iterable<Height> delete(@PathVariable String patientNumber) {

        return heightService.deleteHeight(patientNumber);
    }

    @PutMapping("/updateHeight")
    @ResponseBody
    public Iterable<Height> update(@RequestBody Height height) {
        return heightService.updateHeight(height);

    }

    @RequestMapping("/findHeight/{patientNumber}")
    public Height find(@PathVariable String patientNumber) {

        return heightService.findHeight(patientNumber);
    }

}