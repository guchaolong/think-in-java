/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: think-in-java
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2018/12/14 1.0          guchaolong          Creation File
 */
package com.gcl.thinkinjava.chapter14;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2018/12/14 2:06
 */
public class ProxyTest {
    public static void f1(DoThing doThing){
        doThing.doSomeThing();
        doThing.doAnotherThing();
    }

    public static void main(String[] args) {
        f1(new RealObj());
    }
}