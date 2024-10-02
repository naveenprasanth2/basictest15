package org.example.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class DogEval {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Dog dog = new Dog("summa");
        Field[] fields = dog.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(RunAnnotation.class)) {
                RunAnnotation annotation = field.getAnnotation(RunAnnotation.class);
                int times = annotation.count();
                while (times > 0) {
                    System.out.println(field.get(dog));
                    times--;
                }
            }
        }
    }
}
