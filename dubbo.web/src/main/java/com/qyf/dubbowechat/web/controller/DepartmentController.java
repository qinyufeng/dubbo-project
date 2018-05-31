package com.qyf.dubbowechat.web.controller;


import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qyf.dubbowechat.api.DepartmentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 * 部门表 前端控制器
 * </p>
 *
 * @author lesso
 * @since 2018-05-31
 */
@RestController
@Api(value = "/", description ="部门数据接口")
public class DepartmentController {
	@Reference(timeout=5000)
	private DepartmentService departmentService;
	@GetMapping("getDepartments")
	@ApiOperation(value = "获取组织架构")
	public Object getDepartments() {
		return departmentService.getDepartments();
	}
}
