package org.example.oracle.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTestReflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());

        Class<?> singletonClass = singleton.getClass();
        Constructor<?> singletonConstructor = singletonClass.getDeclaredConstructor();
        singletonConstructor.setAccessible(true);
        Singleton singleton1 = (Singleton) singletonConstructor.newInstance();
        System.out.println(singleton1.hashCode());
    }
}
