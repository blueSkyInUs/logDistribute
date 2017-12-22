package com.lesson.agent;

import com.lesson.agent.transformer.TraceIdRouter;

import java.io.IOException;
import java.lang.instrument.Instrumentation;
import java.util.Objects;

/**
 * @author lesson
 * @date 2017/12/21 16:00
 */
public class HelloWorld {

    public static void premain(String agentArs, Instrumentation inst)
            throws IOException {
        System.out.println("hello");
        System.out.println(Thread.currentThread().getId());
//        inst.addTransformer(new TraceIdRouter());

    }
}
