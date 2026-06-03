package com.vinhthe.communityportalservice.constants;

public class AppConstants {
    private AppConstants() {
        throw new IllegalStateException("Utility class");
    }

    public static final String TOKEN_SECRET = System.getenv("JWT_TOKEN_SECRET");

    static {
        if (TOKEN_SECRET == null || TOKEN_SECRET.isBlank()) {
            throw new IllegalStateException(
                    "JWT_TOKEN_SECRET environment variable is not configured");
        }
    }

    public static final long EXPIRATION_TIME = 864000000L; // 10 days

    public static final String SIGN_IN = "/users/login";
    public static final String SIGN_UP = "/users/register";
    public static final String HEADER_STRING = "Authorization";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String ROLE_ADMIN = "Admin";
    public static final String ROLE_PATIENT = "Patient";
    public static final String ROLE_DOCTOR = "Doctor";
    public static final String USER_UNAUTHORIZED = "You are not authorized to access this!";
    public static final String USER_NOT_FOUND = "User does not exist!";
    public static final String TOKEN_INVALID = "Token is invalid!";
}
