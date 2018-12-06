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
 * @date 2018/12/6 22:48
 */
public class Test {
    public static void main(String [] args){
//        Apple apple = new Apple("dsf");
        new Book(true);
        new Book(true);
        new Book(true);
        new Book(true).checkin();
        System.gc();
    }
}