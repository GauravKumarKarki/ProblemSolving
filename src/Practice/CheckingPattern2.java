/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author PREDATOR
 */
public class CheckingPattern2 {
  public static void main(String[]args){
    int array[] = { 0,2,3,4,5,6,7,8,9,10,11,13,14,15 };
    int size_of_the_largest_sequence = 1;
    int temp = 1;
    int i;
    for(i = 0; i < array.length-1; i++){
        if(array[i + 1] == array[i] + 1 ){
            temp++;
        }
        else{
            if(temp > size_of_the_largest_sequence){
                size_of_the_largest_sequence = temp;
            }
            temp = 1;
        }
    }
      System.out.println("Longest sequence:  "+size_of_the_largest_sequence);
  }  
}
