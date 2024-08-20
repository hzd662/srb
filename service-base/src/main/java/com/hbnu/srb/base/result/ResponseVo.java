package com.hbnu.srb.base.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

//响应类
@Data
@ApiModel("统一响应")
public class ResponseVo {
    @ApiModelProperty("状态码")
    private Integer code;
    @ApiModelProperty("描述")
    private String message;
    @ApiModelProperty("响应数据")
    private Map<String,Object> data = new HashMap<>();//避免以后调用data方法时出现空指针
    //成功
    public static ResponseVo ok(){
        ResponseVo responseVo = new ResponseVo();
        responseVo.setCode(ResponseEnum.SUCCESS.getCode());
        responseVo.setMessage(ResponseEnum.SUCCESS.getMessage());
        return responseVo;
    }
    public static ResponseVo ok(Map<String,Object> data){
        ResponseVo responseVo = new ResponseVo();
        responseVo.setCode(ResponseEnum.SUCCESS.getCode());
        responseVo.setMessage(ResponseEnum.SUCCESS.getMessage());
        responseVo.setData(data);
        return responseVo;
    }
    //失败
    public static ResponseVo error(){
        ResponseVo responseVo = new ResponseVo();
        responseVo.setCode(ResponseEnum.ERROR.getCode());
        responseVo.setMessage(ResponseEnum.ERROR.getMessage());
        return responseVo;
    }

    //成功的响应对象一般 可以会向data中新增响应数据
    public ResponseVo data(String key,Object val){
        this.data.put(key,val);
        return this;
    }
    //失败的响应可能要修改message  也可能修改code  也可能根据枚举类对象创建一个响应对象
    public ResponseVo message(String message){
        this.setMessage(message);
        return this;
    }
    public ResponseVo code(Integer code){
        this.setCode(code);
        return this;
    }
    public static ResponseVo setResult(ResponseEnum responseEnum){
        ResponseVo responseVo = new ResponseVo();
        responseVo.setCode(responseEnum.getCode());
        responseVo.setMessage(responseEnum.getMessage());
        return responseVo;
    }
}
