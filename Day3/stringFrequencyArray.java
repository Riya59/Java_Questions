import java.util.*;
public class stringFrequencyArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        // char ch[] = str.toCharArray();
        int freq[] = new int[1000];
        for(int i=0;i<n;i++){
            freq[str.charAt(i) - 'a']++;
        }
        for(int i=0;i<n;i++){
            if(freq[str.charAt(i) - 'a']!=0){
                System.out.println(str.charAt(i)+" -> "+(freq[str.charAt(i)-'a']));
                freq[str.charAt(i) - 'a'] = 0;
            }
        }
        // int count;
        // for(int i=0;i<n;i++){
        //     freq[i] = 1;
        //     for(int j=i+1;j<n;j++){
        //        if(ch[i] == ch[j]){
        //         freq[i]+=1;
        //         ch[j] = '0';
        //        } 
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     if(ch[i]!=' ' && ch[i]!='0'){
        //         System.out.println(ch[i]+"->"+freq[i]);
        //     }
        // }
        sc.close();
    }
}
