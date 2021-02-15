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
public class SudokuGame {
    public static void main(String[]args){
        game();
    }
    
    public static void game(){
        int[][] board= new int[9][9];
        int fIndex=0;
        int sIndex=0;
        Boolean valid= true;
        int singlecell=3;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]=1;
            }
        }
        
        
      main column and row
        for(int main=0;main<board.length;main++){
            
            // for main row
            for(int col=1;col<board.length;col++){
                if(board[main][sIndex]==board[main][col]){
                    System.out.println("It is not valid");
                    
                }else{
                    
                    valid=false;
                }
                sIndex++;
            }
            
            // for main column
            for(int row=1;row<board.length;row++){
                if(board[fIndex][main]==board[main][row]){
                    System.out.println("It is not valid");
                }else{
                    
                    valid=false;
                }
                fIndex++;
            }
            
        }
        fIndex=0;
        sIndex=0;
        int[] boxArray=new int[9];

        // after valid, now smaller 9 3x3 boxes
        if(valid==true){
            // for each box
            for(int box=0;box<board.length;box++){
                // each cell of a box
                for(int cell=0;cell<9;cell++){
                    // for each cell to compare
                    for(singlecell=0;singlecell<3;singlecell++){
                        boxArray[sIndex]=board[fIndex][singlecell];
                        sIndex++;
                    }
                    fIndex++;
                }
                fIndex=0;
                sIndex=0;
                
            
                for(int i=0;i<boxArray.length;i++){  
                    for(int j=0;j<2;j++){
                        if(boxArray[i]==board[box][j]){
                            System.out.println("It is invalid");
                        }
                    }
                }
            }
        }

  
    }
}
