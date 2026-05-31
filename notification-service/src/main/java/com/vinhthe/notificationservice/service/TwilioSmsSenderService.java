package com.vinhthe.notificationservice.service;

import com.vinhthe.notificationservice.exception.CustomException;

public interface TwilioSmsSenderService {
    void sendSms(String phoneNumberTo, String message) throws CustomException;
}
