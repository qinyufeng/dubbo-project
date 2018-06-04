package com.qyf.dubbowechat.web.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qyf.dubbowechat.api.WorkflowService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "/", description ="业务流程基础数据接口")
public class WorkflowController {
	@Reference
	private WorkflowService workflowService;
	@PostMapping("insertLeave")
	@ApiOperation(value = "请假")
	public Object insertLeave(@RequestBody Map<String, Object> data) {
		//return workflowService.insertLeave(data);
		return null;
	}

}
