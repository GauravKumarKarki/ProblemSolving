/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Random;
/**
 *
 * @author PREDATOR
 */
public class Array {
    private static Random generator = new Random();
    
    public static int[] randomArray(int length, int n){
        int a[]=new int[length];
        for(int i = 0;i<a.length;i++){
            a[i]=generator.nextInt(n);
        }
        return a;
    }
}
