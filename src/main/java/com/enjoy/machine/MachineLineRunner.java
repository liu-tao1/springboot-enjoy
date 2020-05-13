package com.enjoy.machine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.statemachine.StateMachine;
import org.springframework.stereotype.Component;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/5/13
 */
@Component

public class MachineLineRunner implements CommandLineRunner {
    @Autowired
    private StateMachine<States, Events> stateMachine;

    @Override
    public void run(String... args) throws Exception {
        stateMachine.start();
        stateMachine.sendEvent(Events.PAY);
        stateMachine.sendEvent(Events.RECEIVE);
    }
}
