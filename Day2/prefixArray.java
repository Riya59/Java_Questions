public class prefixArray {
    public static void main(String args[]){
        int A[] = {1,2,3,3,3,1,2,5};
        int n = A.length;
        int prefixArray[] = new int[n];
        // prefixArray[0] = A[0];
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+A[i];
            prefixArray[i] = sum;
            // prefixArray[i] = A[i]+prefixArray[i-1];
        }
        for(int i=0;i<n;i++){
            System.out.println(prefixArray[i]+" ");
        }
    }
}
