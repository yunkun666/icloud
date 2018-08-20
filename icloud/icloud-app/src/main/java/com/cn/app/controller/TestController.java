package com.cn.app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cn.app.utils.R;
//import com.cn.system.api.service.ISystemService;
import com.cn.system.api.service.ISystemService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * 测试接口
 * @author MAYUNKUN
 *
 */
@RestController
@RequestMapping("/api/test")
@Api(tags="测试接口")
public class TestController {
    @Autowired
    private ISystemService iSystemService;

    @PostMapping("test")
    @ApiOperation("参数测试")
    @ApiResponses(
    		value = {@ApiResponse(code = 0, message = "成功") }
    )
    public R login(@ApiParam(value = "参数测试", required = true) @RequestParam String id){
		return R.ok().put("id", iSystemService.test(id));
    }

}
