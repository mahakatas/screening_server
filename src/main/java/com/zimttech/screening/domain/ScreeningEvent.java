package com.zimttech.screening.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScreeningEvent {

        @Id
        @Column(nullable = false, updatable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column
        private String patientNumber;

        @Column
        private LocalDate dateOfVisit;

        @Column
        private String purposeOfVisit;

        @Column
        private String notes;

        @CreatedDate
        @Column(nullable = false, updatable = false)
        private OffsetDateTime dateCreated;

        @LastModifiedDate
        @Column(nullable = false)
        private OffsetDateTime lastUpdated;


}
