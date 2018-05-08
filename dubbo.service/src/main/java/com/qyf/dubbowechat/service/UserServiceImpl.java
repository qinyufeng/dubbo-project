package com.qyf.dubbowechat.service;


import com.qyf.dubbowechat.api.IUserService;
import com.qyf.dubbowechat.entity.User;
import com.qyf.dubbowechat.mapper.UserMapper;
import com.alibaba.dubbo.config.annotation.Service;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qyf
 * @since 2018-05-07
 */
@Component
@Service(interfaceClass=IUserService.class)
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper mapper;
	@Override
	public Object queryInfo(Map<String, Object> data) {
		User mapdata = new User();
		mapdata=mapper.selectById("1");
		//mapdata.put("test", "666");
		return mapdata;
	}
}
