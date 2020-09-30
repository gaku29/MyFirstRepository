// Copyright (C) 2017 Meituan
// All rights reserved
package com.future.test.clazz;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yueyali
 * @version 1.0
 * @created 2017/8/30 下午1:50
 **/
public class AnotherMain {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Type[] types = list.getClass().getGenericInterfaces();
        for(Type type : types){
            if (type instanceof ParameterizedType){
                Type[] as = ((ParameterizedType)type).getActualTypeArguments();
                for (Type t : as){
                    System.out.println(t);
                }
            }
        }
    }
}
