package com.example.jooqstarter.event;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EventLogging {

    /**
     * @param test
     * @EventListener에 타입을 지정해서 수신할 클래스를 지정할 수 있다.
     */
    @Async
    @EventListener(String.class)
    public void eventTest(String test) {
        System.out.println("test = " + test);
    }

}
