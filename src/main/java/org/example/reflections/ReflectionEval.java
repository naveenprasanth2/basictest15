package org.example.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionEval {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat cat = new Cat("naveen", 20);
        Field[] fields = cat.getClass().getFields();

        for (Field field : fields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(cat, "summa");
            }
        }

        Method[] methods = cat.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.getName().equals("meow")) {
                method.invoke(cat);
            }
        }

        System.out.println(cat.getName());
    }
}
