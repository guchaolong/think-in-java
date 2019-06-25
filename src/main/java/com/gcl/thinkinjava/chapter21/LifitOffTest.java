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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2018/12/21 0:08
 */
public class LifitOffTest {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0;i<5;i++){
            exec.execute(new LiftOff());
            exec.shutdown();
//            Thread th = new Thread(new LiftOff());
//            th.start();
        }
        System.out.println("start");


    }
}