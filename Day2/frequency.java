// import java.util.*;
public class frequency{
    public static void main(String args[]){
        int A[] = {1,2,3,3,3,1,2,5};
        int n = A.length;
        int temp = n, mod = 0;
        while(temp > 0){
            mod = temp%10;
            A[mod]++;
            temp = temp/10;
        }
        System.out.println("number"+" "+"frequency");
        for(int i=0;i<n;i++){
            if(A[i]>0){
                System.out.println(i+"      "+A[i]);
            }
        }

    }
}