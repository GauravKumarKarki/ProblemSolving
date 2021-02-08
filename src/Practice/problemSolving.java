/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;
import java.util.*;
import java.lang.Math;

/**
 *
 * @author PREDATOR
 */
public class problemSolving {
    public static void main(String[]args){
        int[] array={0,2,3,4,5,7,8,9,10,11};
        cn(array);
    }
    
    public static void cn(int[] array){
        int sequence=0;
        int index=0;
        ArrayList<Integer> result= new ArrayList<>();
        Object[] actual= new Object[result.size()];
        while(index<array.length){
           if(index+1>array.length-1){
               index++;
           }else{ 
                if(array[index]+1==array[index+1]){
                    sequence+=1;
                    index++;
                }else{
                    
                    result.add(sequence);
                    index++;
                }
          }
        }
        actual=result.toArray();
           
//        for(int i=0;i<result.size();i++){
//            actual[i]=result.pop();
//        }
        System.out.println(Arrays.toString(actual));
    }
}    