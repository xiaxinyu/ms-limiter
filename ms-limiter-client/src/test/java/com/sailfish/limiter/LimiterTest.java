package com.sailfish.limiter;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

/**
 * @author XIAXINYU3
 * @date 2020/10/29
 */
public class LimiterTest {
    @Test
    public void contextLoads() {
        RestTemplate restTemplate = new RestTemplate();
        for (int i = 0; i < 30; i++) {
            String s = restTemplate.getForObject("http://127.0.0.1:8762/hello", String.class);
            System.out.println(s + ":" + new Date());
        }
    }
}
