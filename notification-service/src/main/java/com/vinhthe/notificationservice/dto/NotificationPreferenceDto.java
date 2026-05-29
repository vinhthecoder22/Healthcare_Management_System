package com.vinhthe.notificationservice.dto;

import com.vinhthe.notificationservice.enums.PreferenceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationPreferenceDto {
    private Long notificationPreferenceId;
    private Long userId;
    private PreferenceType prefType;
    private boolean enabled;
}
