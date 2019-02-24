package com.jeysin;

/**
 * @Author: Jeysin
 * @Date: 2019/2/1 19:52
 * @Desc:
 */

public class Service {

    private Person person;

    public Service(Person person) {
        this.person = person;
    }

    public void helloService(){
        person.sayHello();
    }
}
