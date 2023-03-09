package Day7;
import java.util.*;
public class maxSumSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int max_sum = 0, current_sum = 0;
        for (int i =0; i<n;i++){
            current_sum+=a[i];
            if(current_sum> max_sum)
                max_sum = current_sum;
            if(current_sum<0)
                current_sum=0;
        }
        System.out.println(max_sum);
        sc.close();
    }

}
