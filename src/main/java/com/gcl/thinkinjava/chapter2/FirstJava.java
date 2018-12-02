/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: think-in-java
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2018/12/2 1.0          guchaolong          Creation File
 */
package com.gcl.thinkinjava.chapter2;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2018/12/2 10:16
 */
public class FirstJava {
    public static void main(String [] args){

        System.out.println("System.currentTimeMillis()" + System.currentTimeMillis());
        System.getProperties().list(System.out);
        System.out.println(System.getProperties().getProperty("user.name"));
    }
}