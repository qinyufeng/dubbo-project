package com.qyf.dubbowechat.mapper;

import com.qyf.dubbowechat.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
  * 用户表  Mapper 接口
 * </p>
 *
 * @author qyf
 * @since 2018-05-30
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
	User getUserInfo(@Param("name") String name);
	List<Map<String,Object>> selectPositionInfo(@Param("password") String password);

}