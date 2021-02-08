/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.*;

/**
 *
 * @author PREDATOR
 */
public class MergeSort {
    public static void main(String[]args){
        int[]a={1,5,2,4,6};
        Merge.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
