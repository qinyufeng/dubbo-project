package com.qyf.dubbowechat.service;

import com.qyf.dubbowechat.entity.Department;
import com.qyf.dubbowechat.entity.User;
import com.qyf.dubbowechat.mapper.DepartmentMapper;
import com.qyf.dubbowechat.mapper.UserMapper;
import com.qyf.dubbowechat.api.DepartmentService;
import com.qyf.dubbowechat.api.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author qyf
 * @since 2018-05-30
 */
@Component
@Service(interfaceClass =DepartmentService.class)
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {
	@Autowired
	private DepartmentMapper departmentMapper;
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public Object getDepartments() {
		// TODO Auto-generated method stub
		Map<String,Object> resultObj=new HashMap<String,Object>();
		List<Map<String,Object>> resultList = new ArrayList<Map<String,Object>>();
		Wrapper<Department> wrapper = new EntityWrapper<Department>();
		List<Department> rs = departmentMapper.selectList(wrapper);
		for(int i=0;i<rs.size();i++) {
			Map<String,Object> depObj=new HashMap<String,Object>();
			depObj.put("dept", rs.get(i).getDept());
			System.out.println(rs.get(i).getDeptId());
			String idid=rs.get(i).getDeptId();
			System.out.println(idid);
			List<User> users = userMapper.selectList(new EntityWrapper<User>().eq("deptid", idid));
			List<String> allemp = new ArrayList<String>();
			for(int j=0;j<users.size();j++) {
				allemp.add(users.get(j).getName().toString());
			}
			//System.out.println(allemp);
			depObj.put("empList", allemp);
			resultList.add(depObj);
		}
		resultObj.put("result", resultList);
		return resultObj;
	}
	
}
