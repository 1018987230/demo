package com.wyx.demo.controller;

import com.wyx.demo.controller.param.AddParam;
import com.wyx.demo.service.TestService;
import com.wyx.demo.utils.Result;
import com.wyx.demo.utils.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wangyixiong
 * @Date 2023/8/15 下午2:06
 * @PackageName:com.wyx.demo.controller
 * @ClassName: TestController
 * @Description: TODO
 * @Version 1.0
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping("/add")
    public Result add(@RequestBody AddParam param){

        Integer result = testService.add(param.getNum1(), param.getNum2());

        return ResultGenerator.genSuccessResult(result);
    }
}
