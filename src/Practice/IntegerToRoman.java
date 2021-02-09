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
public class IntegerToRoman {
    public static void main(String[]args){
        valid();
    }
    
       
    public static String check(String number){
        String romain=null;
        switch(number){
            case "1": 
                romain="I";            
            case "5":
                romain="V";
            case "10": 
                romain="XI";            
            case "50":
                romain="L";    
            case "100": 
                romain="C";            
            case "500":
                romain="D"; 
            case "1000": 
                romain="M";            
   
        }
        return romain;
    }
    
    public static void valid(){
        System.out.println("Enter the number");
        Scanner sn= new Scanner(System.in);
        String number=sn.nextLine();               
        String hold=null;
        int length=number.length();
        char[] value = new char[length];
        
        for(int index=0;index<length;index++){
            value[index]=number.charAt(index);
 
        }
        
        if(index[i]){
        
        }
        
    }
}
