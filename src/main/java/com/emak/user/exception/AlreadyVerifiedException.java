package com.emak.user.exception;

import com.emak.exception.BaseWebApplicationException;

/**
 * @version 1.0
 * @author: GyanomTech Studios
 * @since 13/05/2013
 */
public class AlreadyVerifiedException extends BaseWebApplicationException {

    public AlreadyVerifiedException() {
        super(409, "Already verified", "The token has already been verified");
    }
}
