import java.util.*;
public class sortSmallestWindow {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        int index = 0;
        for(int i=0;i<n-1;i++){
            if(arr[i+1] > arr[i]){
                continue;
                
            }
            else{
                index = i;
                break;
            }
        }
        int eindex = 0;
        for(int j=n-1;j>=1;j--){
            if(arr[j - 1] < arr[ j ]){
               continue;
            }
            else{
                eindex = j;
                break;
            }
        }

        if(arr[n-1] < max ){
            eindex = n-1;
        }
        else if(arr[0] > min){
            index = 0;
        }

        
        System.out.println("Sort array from "+index+" to "+eindex);
       
        sc.close();

        
    }
}
