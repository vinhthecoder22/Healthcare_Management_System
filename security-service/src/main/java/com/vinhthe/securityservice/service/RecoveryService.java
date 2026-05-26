package com.vinhthe.securityservice.service;

import com.vinhthe.securityservice.dto.VerifyCodeDto;
import com.vinhthe.securityservice.exception.CustomException;

public interface RecoveryService {
    String sendMail(String email) throws CustomException;

    String verifyCode(VerifyCodeDto verifyCode) throws CustomException;
}
