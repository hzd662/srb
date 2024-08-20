package com.hbnu.srb.core.controller.api;


import com.hbnu.srb.core.pojo.entity.IntegralGrade;
import com.hbnu.srb.core.service.IntegralGradeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 积分等级表 前端控制器
 * </p>
 *
 * @author hbnu
 * @since 2024-08-20
 */
@RestController
@RequestMapping("/api/core/integralGrade")
@Api(tags = "用户积分前台等级管理")
public class ApiIntegralGradeController {
    @Resource
    private IntegralGradeService integralGradeService;
    @ApiOperation("获取所有积分等级列表")
    @GetMapping
    public List<IntegralGrade> list(){
        return  integralGradeService.list();
    }

    @ApiOperation("根据id获取积分等级信息")
    @GetMapping("{id}")
    public IntegralGrade getById(@PathVariable Long id){
        return  integralGradeService.getById(id);
    }

}

