import java.util.*;
public class reverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        int n =  str.length();
       int l = 0;
       int r = n-1;
       while(l<r){
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        l++;
        r--;
       } 
       System.out.println(arr);
       sc.close();
    }
}
