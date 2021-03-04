package com.example.demo;

import java.lang.reflect.Field;

public class TestUtils {

    public static void injectObject(Object target,String fieldName,Object toInject){

        boolean wasPrivate = false;
        try {
            Field fTarget = target.getClass().getDeclaredField(fieldName);
            if(!fTarget.isAccessible()){
                fTarget.setAccessible(true);
                wasPrivate = true;
            }

            fTarget.set(target,toInject);
            if(wasPrivate){
                fTarget.setAccessible(false);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
