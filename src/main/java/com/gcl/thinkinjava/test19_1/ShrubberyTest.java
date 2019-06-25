/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: think-in-java
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2018/12/18 1.0          guchaolong          Creation File
 */
package com.gcl.thinkinjava.test19_1;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2018/12/18 0:39
 */
public class ShrubberyTest {
    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()){
            System.out.println(s+" "+s.ordinal());
            System.out.println(s.compareTo(Shrubbery.CRAWLING));
        }
    }
}