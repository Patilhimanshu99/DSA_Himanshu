package DividenConquer;

public class merge_sort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int si, int ei){
        if(si>=ei){ //base condition
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);//left
        mergeSort(arr, mid+1, ei);//right
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=ei){//sorting left(i) and right(j) in temp array
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){//right leftovers
            temp[k++] = arr[i++];
        }
        while(j<=ei){//left ----<>----
            temp[k++] = arr[j++];
        }
        for(k=0, i=si; k<temp.length; k++, i++){// copying temp array to arr[i](original array)
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,9,2,3,5,7};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}



