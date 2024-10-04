package org.example.chatgpt.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Objects;

public class SerializeClass {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Person person = new Person("naveen", 29, 1111111111, "tiruchengode");
        HashMap<String, Object> test = new HashMap<>();
        Field[] fields = person.getClass().getDeclaredFields();
        for (Field field : fields){
            if(field.isAnnotationPresent(JsonField.class)){
                field.setAccessible(true);
                JsonField jsonField = field.getAnnotation(JsonField.class);
                test.put(!Objects.equals(jsonField.name(), "") ? jsonField.name() :  field.getName(), field.get(person));
            }
        }

        System.out.println(test);
    }
}
