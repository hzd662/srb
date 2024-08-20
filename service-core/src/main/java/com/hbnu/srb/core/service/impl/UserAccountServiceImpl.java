package com.hbnu.srb.core.service.impl;

import com.hbnu.srb.core.pojo.entity.UserAccount;
import com.hbnu.srb.core.mapper.UserAccountMapper;
import com.hbnu.srb.core.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author hbnu
 * @since 2024-08-20
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
