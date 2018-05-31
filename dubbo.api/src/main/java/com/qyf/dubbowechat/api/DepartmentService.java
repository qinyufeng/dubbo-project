package com.qyf.dubbowechat.api;

import com.qyf.dubbowechat.entity.Department;

import java.util.Map;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 部门表 服务类
 * </p>
 *
 * @author lesso
 * @since 2018-05-31
 */
public interface DepartmentService extends IService<Department> {
	Object getDepartments();
}
