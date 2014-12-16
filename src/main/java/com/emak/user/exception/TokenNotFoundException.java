package com.emak.user.exception;

import com.emak.exception.BaseWebApplicationException;

/**
 * @version 1.0
 * @author: GyanomTech Studios
 * @since 13/05/2013
 */
public class TokenNotFoundException extends BaseWebApplicationException {

    public TokenNotFoundException() {
        super(404, "Token Not Found", "No token could be found for that Id");
    }
}
