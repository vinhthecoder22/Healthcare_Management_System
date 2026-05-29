package com.vinhthe.notificationservice.service;

import com.vinhthe.notificationservice.dto.DataMailRequest;
import com.vinhthe.notificationservice.exception.CustomException;
import org.springframework.web.multipart.MultipartFile;

public interface EmailSenderService {
    void sendEmail(String emailTo, String subject, String message) throws CustomException;

    void sendEmailWithAttachment(DataMailRequest dataMailRequest, MultipartFile[] files) throws Exception;

    void sendMailWithTemplate(DataMailRequest dataMailRequest) throws Exception;
}
