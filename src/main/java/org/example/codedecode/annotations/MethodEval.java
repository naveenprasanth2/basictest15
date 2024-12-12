package org.example.codedecode.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodEval {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestClass testClass = new TestClass();
        Method[] methods = testClass.getClass().getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MethodAnnotation.class)) {
                MethodAnnotation methodAnnotation = method.getAnnotation(MethodAnnotation.class);
                int count = methodAnnotation.times();
                while (count > 0) {
                    method.invoke(testClass);
                    count--;
                }
            }
        }
    }
}
