/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PREDATOR
 */
import java.util.*;
public class Login{
    public static String[] returnMethod(String x, String y){
        String[] array = new String[2];
        array[0]=x;
        array[1]=y;
        return array;       
        
      }
    public static void log(){
        System.out.println("Are you a member \nType yes or no");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine().toLowerCase();
        if(user.equals("yes")){
            checking();
        }
        else{
            System.out.println("Do you want to sign up ?");
        }
        
    }
    
    public static void signUp(){
        System.out.println("Register a username");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        System.out.println("Register a password");
        String password = sc.nextLine();
        
    }
    
    
    public static void checking(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username");
        String x = sc.nextLine();
        System.out.println("Enter your password");
        String y = sc.nextLine();
        String[] user=returnMethod(x,y);
        String a = user[0];
        String b = user[1];
        if(a.equals("Gaurav")&& b.equals("abcde")){
            System.out.println("You are a member");
        }
        else{
            System.out.println("incorrect username and password");
        }
    }
    public static void main(String[]args){
        log();
    }
}
