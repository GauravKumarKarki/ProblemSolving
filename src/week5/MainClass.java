/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Arrays;
/**
 *
 * @author PREDATOR
 */
public class MainClass {
    public static void main(String[]args){
        int[] randomArray = Array.randomArray(15, 150);
        System.out.println(Arrays.toString(randomArray));
        
        SelectionSort.sort(randomArray);
        System.out.println(Arrays.toString(randomArray));
    }
}
