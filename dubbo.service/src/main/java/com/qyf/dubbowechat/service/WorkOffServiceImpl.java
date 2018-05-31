package com.qyf.dubbowechat.service;

import com.qyf.dubbowechat.entity.WorkOff;
import com.qyf.dubbowechat.mapper.WorkOffMapper;
import com.qyf.dubbowechat.api.WorkOffService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 调休申请表  服务实现类
 * </p>
 *
 * @author qyf
 * @since 2018-05-31
 */
@Service
public class WorkOffServiceImpl extends ServiceImpl<WorkOffMapper, WorkOff> implements WorkOffService {
	
}
