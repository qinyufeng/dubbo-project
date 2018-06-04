package com.qyf.dubbowechat.service;

import com.qyf.dubbowechat.entity.User;
import com.qyf.dubbowechat.mapper.UserMapper;
import com.qyf.dubbowechat.api.UserService;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 用户表  服务实现类
 * </p>
 *
 * @author qyf
 * @since 2018-05-30
 */
@Component
@Service(interfaceClass =UserService.class)
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public Object getUserInfo(Map<String, Object> data) {
		// TODO Auto-generated method stub
		Map<String,Object> resultObj=new HashMap<String,Object>();
		User user2=userMapper.selectById("1");
		System.out.println(user2.toString());
		String name=data.get("name")==null?"":data.get("name").toString();
		System.out.println(name);
		User user=userMapper.getUserInfo(name);
		System.out.println(user.toString());

		resultObj.put("code", 1);
		resultObj.put("user",user);
		return resultObj;
	}
	@Override
	public Object getUserInfoById(Map<String, Object> data) {
		Map<String,Object> resultObj=new HashMap<String,Object>();
		String userid=data.get("userid")==null?"":data.get("userid").toString();
		String password=data.get("password")==null?"":data.get("password").toString();
		User user=userMapper.selectById(userid);
		if(user == null){
			//表示用户名不存在，登录失败,登录失败1，登录成功0 
			resultObj.put("message","用户名不存在!");
			resultObj.put("code", 2);
		}else{
			//比较密码是否相同，如果密码不同表示密码错误也是登录失败
			if(!password.equals(user.getPassword())){
				resultObj.put("message","密码错误!");
				resultObj.put("code",3);
			}else{
				//登录成功
				resultObj.put("message","登录成功!");
				resultObj.put("code", 1);
				resultObj.put("user",user);
			}
		}
		
		return resultObj;
	}
	
}
