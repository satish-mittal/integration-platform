package com.practo.integration.sdk.java;

public class SDKException extends Exception {

    private static final long serialVersionUID = 1L;

    public SDKException(String errorMessage, Throwable e) {
        super(errorMessage, e);
    }

}
