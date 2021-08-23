// Problem Description

// Given the position of a Bishop (A, B) on an 8 * 8 chessboard.

// Your task is to count the total number of squares that can be visited by the Bishop in one move.

// The position of the Bishop is denoted using row and column number of the chessboard.

public class Solution {
    public int solve(int A, int B) {
      int count=0;
        int x=A,y=B;

        while(x>=1 && y<=8 && x<=8 && y>=1 && x-1!=0 && y-1!=0 ){
            x--;y--;count++;
        }
        x=A;y=B;
        while(x>=1 && y<=8 && x<=8 && y>=1 &&y-1!=0 && x+1!=9){
            x++;y--;count++; 
        }
        x=A;y=B;
        while(x>=1 && y<=8 && x<=8 && y>=1 && x-1!=0 && y+1!=9){
            x--;y++;count++;
        }
        x=A;y=B;
        while(x>=1 && y<=8 && x<=8 && y>=1 && x+1!=9 && y+1!=9){
             x++;y++;count++;
            

        }
return count;
       
    }
}
