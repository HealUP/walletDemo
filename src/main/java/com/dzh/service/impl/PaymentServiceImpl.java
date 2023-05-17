package com.dzh.service.impl;

.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import .pojo.Payment;
import .service.PaymentService;
import .mapper.PaymentMapper;
import com.dzh.mapper.PaymentMapper;
import com.dzh.pojo.Payment;
import com.dzh.service.PaymentService;
import org.springframework.stereotype.Service;

/**
* @author 不秃头的fofo
* @description 针对表【payment】的数据库操作Service实现
* @createDate 2023-05-17 15:07:17
*/
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment>
    implements PaymentService {

}




