/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: think-in-java
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2018/12/7 1.0          guchaolong          Creation File
 */
package com.gcl.thinkinjava.chapter07;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2018/12/7 23:54
 */
public class Cartoon extends Draw {
    Cartoon(){
        System.out.println("cartoon");
    }
    public static void main(String [] args){
        Cartoon cartoon = new Cartoon();
    }
}