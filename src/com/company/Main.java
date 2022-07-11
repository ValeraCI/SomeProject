package com.company;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Egor egor = new Egor();
        System.out.println(egor);
        Reflect.replaceField(egor, intValue.class, 12);
        Reflect.replaceField(egor, strValue.class, "Не Егор");
        System.out.println(egor);
    }
}

