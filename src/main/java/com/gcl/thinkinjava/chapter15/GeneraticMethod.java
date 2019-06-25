/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: think-in-java
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2018/12/16 1.0          guchaolong          Creation File
 */
package com.gcl.thinkinjava.chapter15;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2018/12/16 1:32
 */
public class GeneraticMethod {
    public <T> void  f1(T t){
        System.out.println(t.getClass());
    }
}