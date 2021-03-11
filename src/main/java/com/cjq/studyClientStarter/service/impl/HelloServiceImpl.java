/*
 * @projectName study-client-starter
 * @package com.cjq.studyClientStarter.service.impl
 * @className com.cjq.studyClientStarter.service.impl.HelloServiceImpl
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.studyClientStarter.service.impl;

import com.cjq.studyClientStarter.service.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * HelloServiceImpl
 * @description TODO
 * @author chenjunqi
 * @date 2021年02月19日 10:47 上午
 * @version 3.0.0
 */
@Component
public class HelloServiceImpl implements HelloService {

    @Value("cjq.testStr")
    private String testStr;

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    public String sayHello() {
        return "hello!!" + testStr;
    }
}
