/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: think-in-java
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2018/12/6 1.0          guchaolong          Creation File
 */
package com.gcl.thinkinjava.chapter05;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2018/12/6 23:16
 */
public class Book {
    boolean checkout;
    Book(boolean checkout){
        this.checkout = checkout;
    }
    protected void checkin(){
        checkout = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if(this.checkout){
            System.out.println("error");
        }
    }
}