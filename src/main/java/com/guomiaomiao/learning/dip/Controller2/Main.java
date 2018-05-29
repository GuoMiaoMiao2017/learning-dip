package com.guomiaomiao.learning.dip.Controller2;

import java.util.concurrent.Callable;

/**
 * Created by 15295 on 2018/5/29.
 */
public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.run(new Mouse());
    }


}
