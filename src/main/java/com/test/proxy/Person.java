package com.test.proxy;

/**
 * 2018/9/27.
 */
public class Person implements CertInterface{
    public String card() {

        System.out.println("做个人认证");

        return "个人认证成功";
    }

    public String enterprise() {
        System.out.println("做企业认证");
        return "企业认证成功";
    }
}
