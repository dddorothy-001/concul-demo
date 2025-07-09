package org.example.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class FeignLogConfig {

    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
