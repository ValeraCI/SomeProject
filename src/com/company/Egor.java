package com.company;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Egor {
    @intValue
    private int age = 11;
    @strValue
    public String name = "Егор";

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age;
    }
}


@Retention(RetentionPolicy.RUNTIME)
@interface intValue{
}

@Retention(RetentionPolicy.RUNTIME)
@interface strValue{
}
