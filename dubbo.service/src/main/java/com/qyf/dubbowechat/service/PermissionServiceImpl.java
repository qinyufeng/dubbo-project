package com.qyf.dubbowechat.service;

import com.qyf.dubbowechat.entity.Permission;
import com.qyf.dubbowechat.mapper.PermissionMapper;
import com.qyf.dubbowechat.api.PermissionService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色权限表 服务实现类
 * </p>
 *
 * @author qyf
 * @since 2018-05-31
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {
	
}
