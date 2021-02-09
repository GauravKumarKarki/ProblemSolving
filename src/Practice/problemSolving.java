/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;
import java.util.*;


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
        int sequence=1;
//        int index=0;
        int x=0;
        int y=0;
        Stack<Integer> result=new Stack<>();
        for(int index=0;index<array.length-2;index++){
            x=array[index+1];
            y=array[index+2];
            if(x+1==y+1){
                sequence+=1;
            }else{
                result.push(sequence);
                sequence=0;
            }
        }
//        System.out.println(index);
        System.out.println(result);

    }
}    