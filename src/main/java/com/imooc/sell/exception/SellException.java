package com.imooc.sell.exception;

import com.imooc.sell.enums.ResultEnum;
import com.imooc.sell.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String defaultMessage) {
        super(defaultMessage);
        this.code = code;
    }
}
