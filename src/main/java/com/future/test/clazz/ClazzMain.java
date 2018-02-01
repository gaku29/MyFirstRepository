// Copyright (C) 2017 Meituan
// All rights reserved
package com.future.test.clazz;

import java.lang.reflect.Type;
import java.util.Vector;

/**
 * @author yueyali
 * @version 1.0
 * @created 2017/8/29 下午7:55
 **/
public class ClazzMain {

    public static void main(String[] args) {

        MyGenericClass<String, String>  my = new MyGenericClass<String, String>();
        Class<?>  m = my.getClass();


        Class<?> intclass = int.class;  // 基本类型
        Class<?> intArrayClass = int[].class;  // 数组类型
        Class<?> int2ArrayClass = int[][].class; // 二维数组类型
        Class<?> vClass = Vector.class;  // 参数化类类型
        Class<?> myEnumClass = MyEnum.class; // Enum类型
        Class<?> myAnnotationClass = MyAnnotation.class;  // annotation类型
        Class<?> myClass = MyClass.class;  // 自定义类类型
        Class<?> myClassArray = MyClass[].class;  // 数组
        Class<?>  myClass2Array = MyClass[][].class; // 二维数组
        Class<?> myGenericClass = MyGenericClass.class; // 自定义泛型

        Class<?>[] classArray = {m, intclass, intArrayClass, int2ArrayClass,vClass, myEnumClass, myAnnotationClass, myClass, myClassArray, myClass2Array, myGenericClass};


        for(Class clazz : classArray){
            System.out.println("type name (类型名称)：" + clazz.getTypeName());
            System.out.println("详细信息 begin------------------");
            Class<?> superClass = clazz.getSuperclass();
            System.out.println("父类（getSuperclass）：" + superClass);

            Type genericSuperclass = clazz.getGenericSuperclass();
            System.out.println("父类（getGenericSuperclass）" + genericSuperclass);

            Class<?>[] interfaces = clazz.getInterfaces();
            System.out.print("父接口(getInterfaces):");
            StringBuilder sb = new StringBuilder();
            for (Class<?> cl : interfaces){
                sb.append(cl.getName() + " ");
            }
            System.out.println(sb.toString());


            Type[] genericInterfaces = clazz.getGenericInterfaces();
            System.out.print("父接口(getGenericInterfaces):");
            StringBuilder sb1 = new StringBuilder();
            for (Type t : genericInterfaces){
                sb1.append(t.getTypeName() + "  ");
            }
            System.out.println(sb1.toString());

            System.out.println("详细信息 end------------------");
        }
    }
}
