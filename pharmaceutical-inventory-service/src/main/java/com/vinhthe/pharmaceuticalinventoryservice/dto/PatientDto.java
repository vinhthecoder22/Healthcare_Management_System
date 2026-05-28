package com.vinhthe.pharmaceuticalinventoryservice.dto;

import com.vinhthe.pharmaceuticalinventoryservice.enums.BloodGroup;
import com.vinhthe.pharmaceuticalinventoryservice.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientDto {
    private String patientId;
    private Long userId;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Gender gender;
    private BloodGroup bloodGroup;
    private String phoneNumber;
    private String address;
    private boolean isApproved;
    private boolean isActive;
}