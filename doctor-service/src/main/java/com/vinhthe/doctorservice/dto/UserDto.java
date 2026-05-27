package com.vinhthe.doctorservice.dto;

import com.vinhthe.doctorservice.enums.Role;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {
    private Long id;
    private String email;
    private Role role;
}
