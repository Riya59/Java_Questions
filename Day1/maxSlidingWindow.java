// package Day1;
import java.util.*;
public class maxSlidingWindow {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sum = 0;
        for(int i=0;i<k;i++){
            sum = sum + arr[i];
        }
        int max_sum = sum;
        for(int i=0;i<(n-k);i++){
            sum = sum - arr[i] + arr[i+k];
            if(max_sum < sum){
                max_sum = sum;
            }
        }
        System.out.println(max_sum);
        sc.close();
    }
}
