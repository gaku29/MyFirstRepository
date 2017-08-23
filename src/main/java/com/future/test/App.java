package com.future.test;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class App {


    private static final List<Object> objects = new ArrayList<Object>();


    public static void main(String[] args) throws InterruptedException {

        // 休眠1分钟
        TimeUnit.SECONDS.sleep(10);

        // 打印
        System.out.println("开始申请内存");

        // 以一定频率申请内存-----总共申请512k的内存
        for (int i = 0; i < 512; i++) {
            byte[] a = new byte[1024 * 1024]; // 1k
            objects.add(a);
            System.out.println("第" + i + "次申请内存");
            TimeUnit.SECONDS.sleep(2);
        }

        // 打印
        System.out.println("申请内存结束");

        TimeUnit.SECONDS.sleep(10);

        System.out.println("开始释放内存");

        // 以一定频率释放内存
        for (int i = 0; i < 512; i++) {
            objects.remove(0);
        }


        // 打印
        System.out.println("释放内存结束");
    }
}
