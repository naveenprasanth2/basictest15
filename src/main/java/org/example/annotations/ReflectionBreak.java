package org.example.annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionBreak {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Constructor<?> declaredConstructor = singleton.getClass().getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        Singleton singleton1 = (Singleton) declaredConstructor.newInstance();
        System.out.println(singleton1);
    }
}
