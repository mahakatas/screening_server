package com.zimttech.screening.services;

import com.zimttech.screening.domain.Weight;
import com.zimttech.screening.repositories.WeightRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class WeightServiceImpl  implements WeightService{

    WeightRepository weightRepository;
    public Iterable<Weight> fetchAllWeights(){
        return weightRepository.findAll();
    }

    public Boolean addWeight(Weight Weight){
        weightRepository.save(Weight);
        return true;
    }

    public Iterable<Weight> deleteWeight(String patientNumber){
        weightRepository.deleteByPatientNumber(patientNumber);
        return weightRepository.findAllByPatientNumber(patientNumber);
    }

    public Weight updateWeight(Weight weight){
        weightRepository.save(weight);
        return weight;
    }

    public Weight findWeight(String patientNumber) {

        return weightRepository.findByPatientNumber(patientNumber);
    }
}
