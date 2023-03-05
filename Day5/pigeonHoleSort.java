import java.util.*;
public class pigeonHoleSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                 min = arr[i];
            }
        }

        int holes = max - min + 1;
        int pholes[] = new int[holes];

        // Arrays.fill(pholes,0);
        // pholes[0] = min;
        // pholes[holes-1] = max;
        for(int i=0;i<n;i++){
            int pos = arr[i] - min;
            pholes[pos] = arr[i];
        }
        for(int i=0;i<holes;i++){
            if(pholes[i] == 0){
                continue;
            }
            else{
                System.out.print(pholes[i]+" ");
            }
            
        }
        sc.close();
    }
}
