import java.util.*;
public class maxElementWindow {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(max<A[i]){
                max = A[i];
            }
        }
        for(int i=k;i<n;i++){
            System.out.print(max + " ");
            if(max<A[i]){
                max = A[i];
            }
            System.out.print(max);
        }
        
        sc.close();
    }
    
}
