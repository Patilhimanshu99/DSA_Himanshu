import java.util.*;
public class Staircase {
    public static boolean staircaseSearch(int matrix[][], int key){
        int row = matrix.length-1, col = 0;
        while(row>=0 && col<matrix[0].length-1){
            if(key == matrix[row][col]){
                System.out.println("Key found at : (" + row + "," + col + ")");
                return true;
            }
            else if(key > matrix[row][col]){
                col++;
            }
            else{
                row--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int matrix[][]= {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
        int key = 14;
        staircaseSearch(matrix, key);
    }
    
}
