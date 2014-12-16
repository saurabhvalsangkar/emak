package com.emak.oauth2;


import com.emak.exception.BaseWebApplicationException;

/**
 * @version 1.0
 * @author: GyanomTech Studios
 * @since 25/04/2013
 */
public class AuthorizationException extends BaseWebApplicationException {

    public AuthorizationException(String applicationMessage) {
        super(403, "Not authorized", applicationMessage);
    }

}
