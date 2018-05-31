package com.qyf.dubbowechat.web.controller;

import com.qyf.dubbowechat.api.UserService;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
/**
 * <p>
 * 用户表  前端控制器
 * </p>
 *
 * @author qyf
 * @since 2018-05-30
 */
@RestController
@Api(value = "/", description ="用户数据接口")
public class UserController {
	@Reference
	private UserService userService;
	
	@PostMapping("getUserInfo")
	@ApiOperation(value = "测试1")
	public Object getUserInfo(@RequestBody Map<String, Object> data) {
		return userService.getUserInfo(data);
	}
	@PostMapping("userLogin")
	@ApiOperation(value = "用户登陆")
	public Object getUserInfoById(@RequestBody Map<String, Object> data) {
		return userService.getUserInfoById(data);
	}
}
