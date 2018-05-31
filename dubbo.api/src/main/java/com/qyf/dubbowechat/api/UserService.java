package com.qyf.dubbowechat.api;

import java.util.Map;

/**
 * <p>
 * 用户表  服务类
 * </p>
 *
 * @author qyf
 * @since 2018-05-30
 */
public interface UserService {
	Object getUserInfo(Map<String, Object> data);
	//通过获取用户信息
	Object getUserInfoById(Map<String, Object> data);
	
}
