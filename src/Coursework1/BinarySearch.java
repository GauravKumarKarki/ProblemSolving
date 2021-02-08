/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coursework1;

/**
 *
 * @author PREDATOR
 */
public class BinarySearch {
        public static int call(int[] a,int find){
            
            int low=0;
            int high =a.length-1;
            int index = search(a,low,high,find);
            
            if(index>=0){
                System.out.println("Value found at index");
                return index;
            }
            else{
                System.out.println("Value not found");
                return -1;
            }
            
        } 
        
        public static int search (int[] a,int low, int high, int find){
        if(low<=high){
            int mid = (low+high)/2;
            
            if(a[mid]==find){
                return mid;
            }else if(a[mid]<find){
                return search(a,mid+1,high,find);
            }
            else{
                return search(a,low,mid-1,find);
            }
            
            
        }
        else{
            return -1;
        }
        }
}
