package com.zimttech.screening.controller;


    import com.zimttech.screening.domain.Patient;
    import com.zimttech.screening.services.PatientService;
    import lombok.AllArgsConstructor;
    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.CrossOrigin;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.ResponseBody;


    @Controller
    @RequestMapping(path = "/screening")
    @CrossOrigin(origins = "http://localhost:4200")
    @AllArgsConstructor
    public class MainController {
        private final PatientService patientService;

        @GetMapping(path = "/")
        public @ResponseBody Iterable<Patient> index() {

            return patientService.fetchAllPatients();
        }

}
