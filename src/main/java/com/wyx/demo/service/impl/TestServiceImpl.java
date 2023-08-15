package com.wyx.demo.service.impl;

import com.wyx.demo.dao.SumMapper;
import com.wyx.demo.entity.Sum;
import com.wyx.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author wangyixiong
 * @Date 2023/8/15 下午2:22
 * @PackageName:com.wyx.demo.service.impl
 * @ClassName: TestServiceImpl
 * @Description: TODO
 * @Version 1.0
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private SumMapper sumMapper;

    @Override
    public Integer add(Integer num1, Integer num2) {

        Integer result = num1 + num2;

        Sum sum = new Sum();
        sum.setNum1(num1);
        sum.setNum2(num2);
        sum.setSum(result);
        sumMapper.insert(sum);
        return result;
    }
}
