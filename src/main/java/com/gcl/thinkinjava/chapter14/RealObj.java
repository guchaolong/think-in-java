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
 * @date 2018/12/14 2:04
 */
public class RealObj implements DoThing {
    @Override
    public void doSomeThing() {
        System.out.println("real 1");
    }

    @Override
    public void doAnotherThing() {
        System.out.println("real 2");

    }
}