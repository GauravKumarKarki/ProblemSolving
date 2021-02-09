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
public class CheckingPattern {
    public static void main(String[]args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the input pattern");
        String input=sn.nextLine();
        pattern(input);
    }

    public static void pattern(String input){
        System.out.println("Enter the pattern to be searched");
        Scanner sn= new Scanner(System.in);
        String pattern=sn.nextLine();
        int asterikPosition=0;
        int dotPosition=0;
        int charIndex=0;
        String changedPattern=null;
        
        if(pattern.equals(input)){
            System.out.println("The pattern "+pattern+" is correct");
        }else{
            if(pattern.contains("*") || pattern.contains(".")){
                
                if(pattern.contains("*")){
                    asterikPosition=pattern.indexOf("*");
                    changedPattern=pattern.replace("*","a");
                    
                    if(changedPattern.equals(input)){
                        System.out.println("The pattern "+pattern+" is correct");
                    }else{
                        System.out.println("The pattern is incorrect");
                    }
                    
                }else{
                    dotPosition=pattern.indexOf(".");
                    pattern.replace('.',pattern.charAt(dotPosition-1));
                    
                    if(changedPattern.equals(input)){
                        System.out.println("The pattern "+pattern+" is correct");
                    }else{
                      System.out.println("The pattern is incorrect");  
                    }
                }
            }else{
                System.out.println("The pattern doesnt exist");
            }
        }
    }
}

