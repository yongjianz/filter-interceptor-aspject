package com.example.demo.testAutoWired;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class main {

    public static void main(String[] args) throws Exception{
        Class<User> clazz = User.class;
        Constructor<User> constructor = clazz.getConstructor();
        User user = constructor.newInstance();
        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);
        field.set(user,"张三");
        String FieldName = field.getName();
        System.out.println(FieldName+":"+field.get(user));

    }
}
