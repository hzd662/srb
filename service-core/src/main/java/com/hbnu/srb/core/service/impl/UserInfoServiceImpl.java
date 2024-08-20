package com.hbnu.srb.core.service.impl;

import com.hbnu.srb.core.pojo.entity.UserInfo;
import com.hbnu.srb.core.mapper.UserInfoMapper;
import com.hbnu.srb.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author hbnu
 * @since 2024-08-20
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
