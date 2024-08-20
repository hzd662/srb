package com.hbnu.srb.base.handler;

import com.hbnu.srb.base.result.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalException {
    @ExceptionHandler(Exception.class)
    public ResponseVo error(Exception e){
        log.error(ExceptionUtils.getStackTrace(e));
        return new ResponseVo().error();
    }
}
