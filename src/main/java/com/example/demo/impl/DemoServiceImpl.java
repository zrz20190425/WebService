package com.example.demo.impl;

import javax.jws.WebService;
import com.example.demo.service.DemoService;

@WebService(serviceName = "demoService", // 与接口中指定的name一致
        targetNamespace = "http://demo.example.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.example.demo.service.DemoService"// 接口地址
)
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        String said = name + ",Hello~~";
        System.out.println(said);
        return said;
    }
}
