package com.example.toy_trello.domain.user.exception;

import com.example.toy_trello.global.exception.ErrorCode;
import com.example.toy_trello.global.exception.RestApiException;

public class SelfAuthenticationFailedException extends RestApiException {

    public SelfAuthenticationFailedException(ErrorCode errorCode) {
        super(errorCode);
    }
}
