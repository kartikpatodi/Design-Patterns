package com.kartikpatodi.patterns.proxy.proxyClasses;

import com.kartikpatodi.patterns.proxy.orignalClasses.ConcreteSubject;
import com.kartikpatodi.patterns.proxy.orignalClasses.Subject;

public class ProxySubject extends Subject {

    ConcreteSubject cs;

    @Override
    public void doSomeWork() {
        System.out.println("Proxy call happening now");

        //Lazy Initialization
        if(cs==null) cs = new ConcreteSubject();
        cs.doSomeWork();
    }
}
