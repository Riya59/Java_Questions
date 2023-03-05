import java.util.*;
public class sortarray01 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int beg = 0, end = n-1, mid = 0, pivot = 1;
        while(mid<=end){
            if(arr[mid] < pivot){
                int temp = arr[beg];
                arr[beg] = arr[mid];
                arr[mid] = temp;
                beg++;
                mid++;
            }
            if(arr[mid] > pivot){
                int temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;
                end--;

            }
            else{
                mid++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
