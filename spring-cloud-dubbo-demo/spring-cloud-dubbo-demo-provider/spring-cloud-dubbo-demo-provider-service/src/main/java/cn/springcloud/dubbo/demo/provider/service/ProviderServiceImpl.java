package cn.springcloud.dubbo.demo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Service(group = "testGroup")
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String hello() {
        return "Hello " + System.currentTimeMillis();
    }
}
