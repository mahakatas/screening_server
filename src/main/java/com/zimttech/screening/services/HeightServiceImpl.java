package com.zimttech.screening.services;

import com.zimttech.screening.domain.Height;
import com.zimttech.screening.repositories.HeightRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class HeightServiceImpl implements HeightService {
    HeightRepository heightRepository;
    public Iterable<Height> fetchAllHeights(){
        return heightRepository.findAll();
    }

    public Boolean addHeight(Height Height){
        heightRepository.save(Height);
        return true;
    }

    public Iterable<Height> deleteHeight(String patientNumber){
        heightRepository.deleteByPatientNumber(patientNumber);
        return heightRepository.findAll();
    }

    public Height updateHeight(Height Height){
        heightRepository.save(Height);
        return Height;
    }

    public Height findHeight(String patientNumber) {
        return heightRepository.findByPatientNumber(patientNumber);
    }
}
