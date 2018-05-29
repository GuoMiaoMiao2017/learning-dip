package com.guomiaomiao.learning.dip.Controller2;


/**
 * Created by 15295 on 2018/5/29.
 */
class Computer {
    private String name = "电脑";

    public void run(Usb usb) {
        System.out.println(name + "开机");
        System.out.println(name + "启动");
        System.out.println(name + "进入windows");
        System.out.println("---------------");

        usb.work();

        System.out.println("---------------");
        System.out.println(name + "关机");
    }
}
