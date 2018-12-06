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
 * @date 2018/12/6 22:39
 */
public class Apple {
    int weight;
    String name;

    Apple(int a){
        System.out.println(a);
    }

    Apple(String b){
        this(3);
        System.out.println(b);
    }

    Apple(int a, String b){
        System.out.println("a:"+a+"\n"+"b:"+b);
    }
    Apple getPeeled(){
        System.out.println(this.getClass().getName());
        return this;
    }
}