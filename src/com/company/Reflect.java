package com.company;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Reflect {
    public static <T> void replaceField(Object object, Class annotation, T value) throws IllegalAccessException {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field: fields){
            Annotation annotation1 = field.getAnnotation(annotation);
            if(annotation1 == null) continue;
            if(!field.canAccess(object)){
                field.setAccessible(true);
                field.set(object, value);
                field.setAccessible(false);
            }
            else field.set(object, value);
        }
    }
}
