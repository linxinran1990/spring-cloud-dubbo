package cn.springcloud.dubbo.demo.provider.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("provider")
public interface ProviderService {
    @GetMapping("/hello")
    String hello();
}
