package com.qyf.dubbowechat.service;

import com.qyf.dubbowechat.entity.Quit;
import com.qyf.dubbowechat.mapper.QuitMapper;
import com.qyf.dubbowechat.api.QuitService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 离职申请表 服务实现类
 * </p>
 *
 * @author qyf
 * @since 2018-05-31
 */
@Service
public class QuitServiceImpl extends ServiceImpl<QuitMapper, Quit> implements QuitService {
	
}
