	package com.example.demo.service;
    import javax.jws.WebService;

    @WebService(name = "demoService",// 暴露服务名称
             targetNamespace = "http://demo.example.com"// 命名空间,一般是接口的包名倒序
    )
    public interface DemoService {

        String sayHello(String name);
    }
