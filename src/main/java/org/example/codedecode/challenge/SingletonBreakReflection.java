package org.example.codedecode.challenge;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonBreakReflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        NormalSingleton singleton = NormalSingleton.getSingleton();
        Class<?> singletonClass = singleton.getClass();
        Constructor<?> singletonConstructor = singletonClass.getDeclaredConstructor();
        singletonConstructor.setAccessible(true);
        NormalSingleton singleton1 = (NormalSingleton) singletonConstructor.newInstance();
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}
