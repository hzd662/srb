package com.hbnu.srb.core.controller.admin;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hbnu.srb.base.result.ResponseVo;
import com.hbnu.srb.core.pojo.entity.IntegralGrade;
import com.hbnu.srb.core.service.IntegralGradeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/admin/core/integralGrade")
@Api(tags = "积分等级管理")
public class AdminIntegralGradeController {
    @Resource
    private IntegralGradeService integralGradeService;
    @ApiOperation("获取所有积分等级列表")
    @GetMapping
    public  ResponseVo list(){
        List<IntegralGrade> list = integralGradeService.list();


        return  ResponseVo.ok().data("items", list);
    }

    @ApiOperation("根据id获取积分等级信息")
    @GetMapping("{id}")
    public ResponseVo getById(@PathVariable Long id){
        IntegralGrade integralGrade = integralGradeService.getById(id);
        return ResponseVo.ok().data("items", integralGrade);
    }
    @ApiOperation("根据id删除积分等级信息")
    @DeleteMapping("{id}")
    public ResponseVo removeById(@PathVariable Long id){
        boolean result = integralGradeService.removeById(id);
        if (result){
            return ResponseVo.ok();
        }else {
            return ResponseVo.error();
        }
    }
    @ApiOperation("新增积分等级信息")
    @PutMapping
    public ResponseVo save(@RequestBody IntegralGrade integralGrade){
        boolean result = integralGradeService.save(integralGrade);
        if (result){
            return ResponseVo.ok();
        }else {
            return ResponseVo.error();
        }
    }

    @ApiOperation("修改积分等级信息")
    @PostMapping
    public ResponseVo updatebyId(@RequestBody IntegralGrade integralGrade){
        boolean result = integralGradeService.updateById(integralGrade);
        if (result){
            return ResponseVo.ok();
        }else {
            return ResponseVo.error();
        }
    }
    @ApiOperation("分页查询积分等级信息")
    @GetMapping("/list/{pageNum}/{pageSize}")
    public ResponseVo listPage(@PathVariable Long pageNum,
                               @PathVariable Long pageSize){
        List<IntegralGrade> list = integralGradeService.list(Wrappers.lambdaQuery(IntegralGrade.class).last("limit " + ((pageNum - 1) * pageSize) + "," + pageSize));
        return ResponseVo.ok().data("items", list);
    }

}

