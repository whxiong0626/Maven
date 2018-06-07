package com.whx;

import com.whx.cglib.CglibProxy;
import com.whx.jdk.AnimalProxy;
import org.junit.Test;
import com.whx.Animal;
import com.whx.Dog;

public class Demo {
    @Test
    public void JdkProxy(){
        AnimalProxy proxy=new AnimalProxy();
        Animal animal= (Animal) proxy.createProxy(new Dog());
        animal.eat();
        System.out.println("**********************************************");
        animal.sleep();
    }
    @Test
    public void CglibProxy() {
        CglibProxy proxy=new CglibProxy();
        Animal animal= (Animal) proxy.createProxy(new Dog().getClass());
        animal.eat();
        System.out.println("**********************************************");
        animal.sleep();
    }
}
