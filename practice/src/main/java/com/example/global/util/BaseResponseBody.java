package com.example.global.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResponseBody<T> {
    private String status;
    private String resultMessage = "";
    private T dataBody;
    public static <T> BaseResponseBody<T> of(String successCode, T dataBody) {
        BaseResponseBody<T> body = new BaseResponseBody<>();
        body.status = successCode;
        body.setDataBody(dataBody);
        return body;
    }
    public static BaseResponseBody<Object> error(String status, String resultMessage) {
        BaseResponseBody<Object> body = new BaseResponseBody<>();
        body.status = status;
        body.resultMessage = resultMessage;
        return body;
    }
}
