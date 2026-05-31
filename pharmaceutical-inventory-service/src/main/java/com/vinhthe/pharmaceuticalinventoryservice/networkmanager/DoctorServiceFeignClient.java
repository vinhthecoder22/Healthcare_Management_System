package com.vinhthe.pharmaceuticalinventoryservice.networkmanager;

import com.vinhthe.pharmaceuticalinventoryservice.dto.DoctorDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "doctor-service", configuration = FeignClientConfiguration.class)
public interface DoctorServiceFeignClient {
    @GetMapping("/doctors/profile")
    ResponseEntity<DoctorDto> getCurrentDoctor();
}
