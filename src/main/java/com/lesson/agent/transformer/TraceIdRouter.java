package com.lesson.agent.transformer;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;
import java.util.Objects;

/**
 * @author lesson
 * @date 2017/12/21 16:53
 */
public class TraceIdRouter implements ClassFileTransformer{

    private static final String NEED_HANDLE_PACKAGE;
    static {
        NEED_HANDLE_PACKAGE=System.getProperty("agent_handle_package");
        Objects.requireNonNull(NEED_HANDLE_PACKAGE,"agent_handle_package  not set");
    }

    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        return new byte[0];
    }
}
