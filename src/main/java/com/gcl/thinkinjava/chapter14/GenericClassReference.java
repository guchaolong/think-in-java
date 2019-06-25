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

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2018/12/14 1:17
 */
public class GenericClassReference {
    public static void main(String[] args) {
        Class<Integer> c = Integer.class;
        Class<Integer> d = int.class;
        System.out.println(c==d);

        int[] intArr = (int [])Array.newInstance(Integer.TYPE, 3);
        System.out.println(intArr.length);

        Integer[] integerArr = (Integer [])Array.newInstance(Integer.class, 3);
        System.out.println("integerArr.length = " + integerArr.length);


        Class intClass = int.class;
        Class integerClass = Integer.class;
        Class<Integer> genericIntegerClass = Integer.TYPE;
        System.out.print(intClass == genericIntegerClass);
    }
}