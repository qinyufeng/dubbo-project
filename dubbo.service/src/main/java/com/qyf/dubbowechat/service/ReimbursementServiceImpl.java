package com.qyf.dubbowechat.service;

import com.qyf.dubbowechat.entity.Reimbursement;
import com.qyf.dubbowechat.mapper.ReimbursementMapper;
import com.qyf.dubbowechat.api.ReimbursementService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 差旅报销表 服务实现类
 * </p>
 *
 * @author qyf
 * @since 2018-05-31
 */
@Service
public class ReimbursementServiceImpl extends ServiceImpl<ReimbursementMapper, Reimbursement> implements ReimbursementService {
	
}
