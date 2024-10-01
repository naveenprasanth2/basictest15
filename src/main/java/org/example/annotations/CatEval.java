package org.example.annotations;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CatEval {
    public static void main() throws InvocationTargetException, IllegalAccessException {
        Cat cat = new Cat("naveen");
        Annotation[] annotations = cat.getClass().getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation.annotationType() == VeryImportant.class){
                System.out.println("Yes it is");
            }
        }
        Method[] methods = cat.getClass().getDeclaredMethods();
        for (Method method: methods){
            if (method.isAnnotationPresent(RunImmediately.class)){
                int count = method.getAnnotation(RunImmediately.class).count();
                while (count > 0){
                    method.invoke(cat);
                    count--;
                }
            }
        }
        Field[] fields = cat.getClass().getDeclaredFields();
        for (Field field: fields){
            if (field.isAnnotationPresent(ImportantString.class)){
                Object o = field.get(cat);
                if (o instanceof String s){
                    System.out.println(s.toUpperCase());
                }
            }
        }
    }
}
