package com.test.proxy;

/**
 * 2018/9/27.
 */
public class TestProxy {
    public static void main(String[] args) {
//        CertInterface certInterface = new Person();
//        System.out.println(certInterface.card());
        DesignProxy designProxy = new DesignProxy();
        CertInterface certInterface = new Person();
        CertInterface cert = (CertInterface)designProxy.newProxyInstance(certInterface);
//        System.out.println(certInterface.card());
        System.out.println(cert.card());
    }
}
