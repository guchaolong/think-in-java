/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: think-in-java
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2018/12/6 1.0          guchaolong          Creation File
 */
package com.gcl.thinkinjava.chapter05;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2018/12/6 22:40
 */
public class Person {
    public void eat(Apple apple){
        apple.getPeeled();
        System.out.println("OK");
    }

    public static void main(String [] args){
        Person person = new Person();
        person.eat(new Apple(1));
    }
}