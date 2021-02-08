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
public class practice {
    public static void main (String[]args){
        int[]first={1,1,1,0,0,0};
        int[]second={1,1,0,0};
        int stackLength=0;
        if(first.length>second.length){
            stackLength=first.length+1;
        }else{
            stackLength=second.length+1;
        }
        add(first,second,stackLength);
        
    }
    
   
    
    public static void add(int[] first, int[] second, int stackLength){
        int carry=0;
        int firstlength=first.length;
        int secondlength=second.length;
        Stack<Integer> result=new Stack<>();
        int difflength=0;
        if(firstlength<secondlength){
            difflength=secondlength-firstlength;
        }else{
            difflength=firstlength-secondlength;
        }
//      when both length of first and second are equal
            if(firstlength==secondlength){
                System.out.println("working A");
                for(int index=1;index<stackLength;index++){
                    if(first[firstlength-index]+second[secondlength-index]+carry==1){
                        result.push(1);
                        carry=0;
                    }else if(first[firstlength-index]+second[secondlength-index]+carry==2){
                        result.push(0);
                        carry=1;
                    }else if(first[firstlength-index]+second[secondlength-index]+carry==3){
                        result.push(1);
                        carry=1;
                    }else{
                        result.push(0);
                        carry=0;
                    }
                }
                if(carry==1){
                    result.push(1);
                    carry=0;
                }else{
                    result.push(0);
                }
                
                print(result,first,second);
                
//         when length of first is greater than second                      
            }else if(firstlength>secondlength){
                System.out.println("Working B");
                for(int index=1;index<=secondlength;index++){
                    if(first[firstlength-index]+second[secondlength-index]+carry==1){
                        result.push(1);
                        carry=0;
                    }else if(first[firstlength-index]+second[secondlength-index]+carry==2){
                        result.push(0);
                        carry=1;
                    }else if(first[firstlength-index]+second[secondlength-index]+carry==3){
                        result.push(1);
                        carry=1;
                    }else{
                        result.push(0);
                        carry=0;
                    }
                }
                if(carry==1){
                    for(int index=1;index<=difflength;index++){
                        if(first[difflength-index]+carry==2){
                            result.push(0);
                            carry=1;
                        }else{
                            result.push(1);
                            carry=0;
                        }
                        
                    }
                }else{
                    for(int index=1;index<=difflength;index++){
                        if(first[difflength-index]+carry==1){
                            result.push(1);
                            carry=0;
                        }else{
                            result.push(0);
                            carry=0;
                        }
                    }
                }
                if(carry==1){
                    result.push(1);
                    carry=0;
                }else{
                    result.push(0);
                }
                print(result,first,second);
                
//                when length of second is greater than first
            }else{
                for(int index=1;index<=firstlength;index++){
                    System.out.println("Working C");
                    if(first[firstlength-index]+second[secondlength-index]+carry==1){
                        result.push(1);
                        carry=0;
                    }else if(first[firstlength-index]+second[secondlength-index]+carry==2){
                        result.push(0);
                        carry=1;
                    }else if(first[firstlength-index]+second[secondlength-index]+carry==3){
                        result.push(1);
                        carry=1;
                    }else{
                        result.push(0);
                        carry=0;
                    }
                }
                if(carry==1){
                    for(int index=1;index<=difflength;index++){
                        if(second[difflength-index]+carry==2){
                            result.push(0);
                            carry=1;
                        }else{
                            result.push(1);
                            carry=0;
                        }
                    }
                }else{
                    for(int index=1;index<=difflength;index++){
                        if(second[difflength-index]+carry==1){
                            result.push(1);
                            carry=0;
                        }else{
                            result.push(0);
                            carry=0;
                        }
                    }
                }
                if(carry==1){
                    result.push(1);
                    carry=0;
                }else{
                    result.push(0);
                }
                print(result,first,second);
                
            }

    }
    public static void print(Stack<Integer> result,int[] first, int[]second){
        Object[] actualResult= result.toArray();
        Object[] printResult=new Object[actualResult.length];
        for(int i=0;i<actualResult.length;i++){
            printResult[i]=actualResult[(actualResult.length-1)-i];
        }
        System.out.println("The Output of the two binary numbers "+"\n"+Arrays.toString(first)+" + "+Arrays.toString(second)+" = "+Arrays.toString(printResult));
        
    }
    
    
    
}