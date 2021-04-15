package com.step_it.state_sharing;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
public class TestSteps2 {
    // The context will be automatically injected in constructor
    // Its state will be shared between other classes using the context
    private final Context context;

    public void changeState() {
        context.setBrowser("Chrome");
    }

    public void getState() {
        log.warn(context.getBrowser());
    }
}
