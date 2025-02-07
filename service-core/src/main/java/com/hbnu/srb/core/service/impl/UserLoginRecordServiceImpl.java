package com.hbnu.srb.core.service.impl;

import com.hbnu.srb.core.pojo.entity.UserLoginRecord;
import com.hbnu.srb.core.mapper.UserLoginRecordMapper;
import com.hbnu.srb.core.service.UserLoginRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author hbnu
 * @since 2024-08-20
 */
@Service
public class UserLoginRecordServiceImpl extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord> implements UserLoginRecordService {

}
