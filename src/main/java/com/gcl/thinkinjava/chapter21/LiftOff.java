/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: think-in-java
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2018/12/21 1.0          guchaolong          Creation File
 */
package com.gcl.thinkinjava.chapter21;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2018/12/21 0:00
 */
public class LiftOff implements Runnable {
    private static int taskCount = 0;
    private final int id = taskCount++;
    protected int countDown = 10;

    public String status(){
        return "#" + id + "(" + (countDown > 0 ? countDown : "liftoff") + ")  |  ";
    }

    @Override
    public void run() {
        while (countDown-- > 0){
            System.out.print(status());
            Thread.yield();
        }
    }
}