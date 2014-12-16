package com.emak.exception;

import com.emak.api.ErrorResponse;

/**
 * Created by GyanomTech Studios on 06/11/2014.
 */
public class BadClientCredentialsException extends ErrorResponse {

    public BadClientCredentialsException(String errorMessage) {
        super("401", "Client Credentials were incorrect", "Client Credentials were incorrect. Useage: Base64Encode(username:password) ");
    }
}
