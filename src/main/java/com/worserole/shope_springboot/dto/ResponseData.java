package com.worserole.shope_springboot.dto;

import com.worserole.shope_springboot.eunm.ResponseResultEnum;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * Created by liyanyan on 2020/9/6 11:47 下午
 */
@Data
@ToString
@Builder
public class ResponseData<T> {
    private int code;
    private String message;
    private T data;

    public ResponseData(T data) {
        this(ResponseResultEnum.SUCCESS, data);
    }
    public ResponseData(ResponseResultEnum errorEnum) {
        this(errorEnum, null);
    }
    public ResponseData(int code, String message) {
        this(code, message, null);
    }

    public ResponseData(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public ResponseData(ResponseResultEnum resultEnum, T data) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
        this.data = data;
    }


}
