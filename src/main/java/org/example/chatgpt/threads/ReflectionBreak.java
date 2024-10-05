package org.example.chatgpt.threads;

import org.example.chatgpt.comparator.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionBreak {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton singleton = Singleton.getInstance();
        Constructor<?> constructor = singleton.getClass().getDeclaredConstructor();
        constructor.setAccessible(true);
        System.out.println(singleton);
        System.out.println(constructor.newInstance());
    }
}
