package com.vinhthe.notificationservice.service;

import com.vinhthe.notificationservice.dto.NotificationPreferenceDto;
import com.vinhthe.notificationservice.exception.CustomException;

import java.util.List;

public interface NotificationPreferenceService {
    void createNotificationPreference(NotificationPreferenceDto notificationPreferenceDto) throws CustomException;

    NotificationPreferenceDto getNotificationPreferenceByPreferenceType(Long userId, String preferenceType)
            throws CustomException;

    List<NotificationPreferenceDto> getAllNotificationPreferencesByUserId(Long userId) throws CustomException;

    void updateNotificationPreference(NotificationPreferenceDto notificationPreferenceDto) throws CustomException;

    void deleteNotificationPreference(Long notificationPreferenceId) throws CustomException;
}
