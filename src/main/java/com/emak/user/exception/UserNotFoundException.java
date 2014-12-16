package com.emak.user.exception;

import com.emak.exception.BaseWebApplicationException;

/**
 * @version 1.0
 * @author: GyanomTech Studios
 * @since 13/05/2013
 */
public class UserNotFoundException extends BaseWebApplicationException {

    public UserNotFoundException() {
        super(404, "User Not Found", "No User could be found for that Id");
    }
}
