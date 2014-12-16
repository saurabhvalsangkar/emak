package com.emak.user.api;

import org.junit.Before;

import javax.validation.Validation;
import javax.validation.Validator;

/**
 * @version 1.0
 * @author: GyanomTech Studios
 * @since 24/04/2013
 */
public class BaseApiTest {

    protected Validator validator;

    @Before
    public void setUp() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }
}
