package com.jeysin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Jeysin
 * @Date: 2019/2/1 20:35
 * @Desc:
 */

@Configuration
public class Config {
    @Bean
    public Student student(){
        return new Student();
    }

    @Bean
    public Service service(){
        return new Service(student());
    }
}
