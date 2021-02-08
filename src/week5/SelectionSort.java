/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author PREDATOR
 */
public class SelectionSort {
    public static void sort(int[] a){
        for(int i=0; i<a.length-1;i++){
            int minPos = minPosFinder(a, i);
            swap(a, minPos, i);   
        }
    }
    
    public static int minPosFinder(int[] a, int from){
        int minPos = from;
        for(int i=from+1;i<a.length;i++){
            if(a[i]<a[minPos]){
                minPos=1;
            }
        }
        return minPos;
    }
    
    public static void swap(int[] a,int minPos, int from){
        int temp = a[minPos];
        a[minPos] = a[from];
        a[from] = temp;
    }
}
