package DividenConquer;
import java.util.*;
public class arrays{
    // public static int reverseArray(int arr[]){
    //     int first = 0, last = arr.length-1;
        
    //     while(first<=last){
    //         int temp = arr[first];
    //         arr[first] = arr[last];
    //         arr[last] = temp;
    //         first++;
    //         last--;
    //     }
    //     return -1;
    // }
    public static int binarySearch(int arr[], int key){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void prinPairs(int arr[]){
        int totalPairs = 0;
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs are " + totalPairs);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        prinPairs(arr);
    }
}