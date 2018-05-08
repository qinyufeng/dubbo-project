package com.qyf.dubbowechat.web.controller;


import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qyf.dubbowechat.api.IUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author qyf
 * @since 2018-05-07
 */
@RestController
@Api(value = "/", description ="OA数据接口")
public class UserController {
	@Reference(timeout=5000)
	private IUserService userService;
	
	@PostMapping("queryInfo")
	@ApiOperation(value = "获取信息")
	public Object  queryInfo(@RequestBody Map<String, Object> data)
	{
		return userService.queryInfo(data);
	}
}
