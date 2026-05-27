package com.vinhthe.doctorservice.dto;

import com.vinhthe.doctorservice.enums.AppointmentStatus;
import com.vinhthe.doctorservice.enums.AppointmentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookAppointmentRequestDto {
    private Long availabilityId;
    private String patientId;
    private AppointmentType appointmentType;
    private AppointmentStatus appointmentStatus;
}
