import java.util.*;
public class DiagSum{
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        //basic code for Diagonal sum

        
        // for(int i=0; i<matrix.length; i++){
        //   for(int j=0; j<matrix[0].length; j++){
        //     //Left Top diagonal
        //   if(i==j){
        //     sum += matrix[i][j];
        //}
        //Right Top Diagonal
        //   else if(i+j == matrix.length-1)
        //     sum += matrix[i][j];
        //}
        //}
        //}
        //return sum;


        //better code
        for(int i=0; i<matrix.length; i++){
            sum += matrix[i][i];

            if(i != matrix.length-i-1){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }

    public static void main(String args[]){
        int matrix[][]= {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
        System.out.println("Diagonal Sum is :- " + diagonalSum(matrix));
    }
}