package org.example.oracle.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationTest {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat cat = new Cat();
        Class<?> catClass = cat.getClass();
        Method[] methods = catClass.getDeclaredMethods();
        for (Method method : methods){
            if (method.isAnnotationPresent(MethodAnnotation.class)){
                MethodAnnotation methodAnnotation = method.getAnnotation(MethodAnnotation.class);
                int times = methodAnnotation.times();
                while (times > 0){
                    method.invoke(cat);
                    times--;
                }
            }
        }
    }
}
