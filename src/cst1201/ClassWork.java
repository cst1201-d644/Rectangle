/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cst1201;

import java.util.Random;

/**
 *
 * @author rkhatchadourian
 */
public class ClassWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = rect1;
        
        rect2.setLength(5);
        rect1.setWidth(100);
        
        System.out.println(rect1.getLength()); //should print 5.0.
        System.out.println(rect2.getLength()); //should print 5.0.
        System.out.println(rect1.getWidth()); //should print 100.0.
        
        System.out.println("The rectangle area is as follows:");
        System.out.println(rect1.getArea()); //should print 0.0.
        
        int width = 0;
        System.out.println(width); //printed 500.
        
        Random rand = new Random();
        rand.nextInt();
        Random rand2 = rand;
        
        Rectangle rect3 = new Rectangle();
        System.out.println("This rectangle has a length of: " +
                rect3.getLength() + " and an width of " + rect3.getWidth());
        
        System.out.println("Calling the overloaded add methods:");
        
        String combined = add("Hello", " there");
        System.out.println("The combined string is: " + combined);
        
        int sum = add(5, 2);
        System.out.println("The sum is: " + sum);
    }
    
    private static String add(String s1, String s2) {
        System.out.println("In the string concatenation method");
        return s1 + s2;
    }
    
    private static int add(int i1, int i2) {
        System.out.println("In the integer addition method");
        return i1 + i2;
    }
}
