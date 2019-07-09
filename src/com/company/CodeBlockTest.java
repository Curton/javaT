package com.company;

/**
 * @Author CoveyLiu, covey@liukedun.com
 * @Date 2019-07-04 23:52
 */

public class CodeBlockTest {


    {
        System.out.println("普通代码块1");
    }

    CodeBlockTest(){
        System.out.println("构造函数");
    }

    static {
        System.out.println("静态代码块1");
    }

    {
        System.out.println("普通代码块2");
    }

    static {
        System.out.println("静态代码块2");
    }


}
