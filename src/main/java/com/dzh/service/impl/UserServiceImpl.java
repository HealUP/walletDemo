package com.dzh.service.impl;

.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import .pojo.User;
import .service.UserService;
import .mapper.UserMapper;
import com.dzh.mapper.UserMapper;
import com.dzh.pojo.User;
import com.dzh.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author 不秃头的fofo
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-05-17 15:07:17
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




