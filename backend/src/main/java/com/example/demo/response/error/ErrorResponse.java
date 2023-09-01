package com.example.demo.response.error;

import lombok.Data;

import java.util.HashMap;

@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
public class ErrorResponse {
    private String errorCode;
    private String responseMessage;

    public static final String CODE_0000_NO_ERROR               = "0000";
    public static final String CODE_0001_EMAIL_TAKEN            = "0001";
    public static final String CODE_0002_USER_NOT_FOUND         = "0002";
    public static final String CODE_0003_EMAIL_OR_PW_INVALID    = "0003";


    private static final HashMap<String, String> ResponseErrorMap = new HashMap<String, String>();
    static {
        ResponseErrorMap.put(CODE_0000_NO_ERROR,                "No Error");
        ResponseErrorMap.put(CODE_0001_EMAIL_TAKEN,             "Email Taken");
        ResponseErrorMap.put(CODE_0002_USER_NOT_FOUND,          "Membership cannot be found with the given email");
        ResponseErrorMap.put(CODE_0003_EMAIL_OR_PW_INVALID,     "Invalid email or password");
    }
    public ErrorResponse(String errorCode) {
        this.errorCode = errorCode;
        this.responseMessage = ResponseErrorMap.get(errorCode);

    }
}
