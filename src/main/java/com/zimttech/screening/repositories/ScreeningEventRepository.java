package com.zimttech.screening.repositories;

import com.zimttech.screening.domain.ScreeningEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreeningEventRepository extends JpaRepository<ScreeningEvent, Long> {

}
