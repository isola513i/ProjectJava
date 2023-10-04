/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.int101w08;

import java.util.Random;

/**
 *
 * @author Student
 */
public class Int101w08 {

    public static void main(String[] args) {
        demoRandom();
    }

    static void demoRandom() {
        System.out.println("Random from Math: " + Math.random()); // pseudorandom number generator
        Random r = new Random();
        System.out.println("Random double(0,1) from Random: " + r.nextDouble());
        System.out.println("Random boolean from Random: " + r.nextBoolean());
        System.out.println("Random int(0,max) from Random: " + r.nextInt());
        System.out.println("Random int (1,10) from Random: " + (1 + r.nextInt(10)));
    }
}
