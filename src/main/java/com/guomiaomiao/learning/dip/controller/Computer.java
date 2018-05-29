package com.guomiaomiao.learning.dip.controller;

/**
 * Created by 15295 on 2018/5/29.
 */
class Computer {
    private String name = "电脑";
    public void run() {
        System.out.println(name + "开机");
        System.out.println(name + "启动");
        System.out.println(name + "进入windows");
        System.out.println("---------------");

        //new Charger().work();
        new Mouse().work();
        //new KeyBoard().work();

        System.out.println("---------------");
        System.out.println(name + "关机");
    }
}
