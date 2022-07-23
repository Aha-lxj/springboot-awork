package com.aha.springbootawork.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author Aha
 * @create 2022-07-23  18:42
 */
@Service
public class AsyncService {
    @Async
    public void hello(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
