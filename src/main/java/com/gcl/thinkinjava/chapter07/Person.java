/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: think-in-java
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2018/12/8 1.0          guchaolong          Creation File
 */
package com.gcl.thinkinjava.chapter07;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2018/12/8 0:39
 */
public class Person {
    public int age;
    protected char sex;
    String county;
    private String name;

    public void change(){
        name = "dfs";
    }

    public void speak(){
        System.out.println(age+" "+sex+" "+name+" "+county);
        System.out.println("当前对象为"+this.getClass());
    }
}