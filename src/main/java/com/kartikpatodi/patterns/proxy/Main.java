package com.kartikpatodi.patterns.proxy;

import com.kartikpatodi.patterns.proxy.proxyClasses.ProxySubject;

public class Main {
    public static void main(String[] args) {
        System.out.println("****Proxy Pattern****\n");

        ProxySubject proxySubject = new ProxySubject();
        proxySubject.doSomeWork();
    }
}
