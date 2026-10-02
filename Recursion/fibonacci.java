//Calculate the fibonacci series 
public class fibonacci {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int f1 = fib(n-1);
        int f2 = fib(n-2);
        int f = f1+f2;
        return f;
    }
    //Check whether an array is sorted or not 
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    //First occurence of an element
    public static int firstOccur(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccur(arr, key, i+1);
    }
    //Last occurence
    public static int lastOccur(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccur(arr, key, i+1);
        if(isFound != -1){
            return isFound;
        }
        if(arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]= {1,3,2,5,6,8,4,3,5};
        
        System.out.println(lastOccur(arr, 5, 0));
        //System.out.println(isSorted(arr, 0));
        // int n = 6;
        // System.out.println(fib(n));
    }
}
