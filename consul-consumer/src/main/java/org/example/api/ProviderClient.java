package org.example.api;

import org.example.config.FeignLogConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "provider-service", configuration = FeignLogConfig.class)
@FeignClient(name = "provider-service")
public interface ProviderClient {
    @GetMapping("/hello")
    String sayHello();
}
