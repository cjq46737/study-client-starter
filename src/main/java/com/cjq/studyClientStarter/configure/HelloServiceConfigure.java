/*
 * @projectName study-client-starter
 * @package com.cjq.studyClientStarter.configure
 * @className com.cjq.studyClientStarter.configure.HelloServiceConfigure
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.studyClientStarter.configure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * HelloServiceConfigure
 * @description TODO
 * @author chenjunqi
 * @date 2021年02月19日 1:51 下午
 * @version 3.0.0
 */
@Configuration
@ComponentScan({"com.cjq.studyClientStarter.service.impl"})
@ConditionalOnProperty(prefix = "cjq",name = "enable",havingValue = "true")
public class HelloServiceConfigure {
}
