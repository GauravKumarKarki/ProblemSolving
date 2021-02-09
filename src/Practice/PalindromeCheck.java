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
public class PalindromeCheck {
    public static void main(String[]args){
    Scanner sn= new Scanner(System.in);
    System.out.println("Enter the number");
    int number=sn.nextInt();
    check(number);
    }
    
    public static void check(int number){
        String check= String.valueOf(number);
        int length=check.length();
        String reverse="";
        for(int index=length-1;index>=0;index--){
            reverse+=check.charAt(index);
        }
        if(reverse.equals(check)){
            System.out.println("The number "+check+" is palindrome ");
        }else{
            System.out.println("The number "+check+" is not palindrome "+"\n"+"As its reverse number is "+reverse);
        }
    }
}
