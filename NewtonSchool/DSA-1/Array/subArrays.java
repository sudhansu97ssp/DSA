package Arrays;
import java.util.*;
public class subArrays {
    static ArrayList<Integer> subArraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int j = i+1;
            int currSum = arr[i];
            for(j = i+1; j < n && currSum < s; j++) {
                currSum+=arr[j];

            }
            if (currSum == s) {
                ans.add(i+1);
                ans.add(j);
                return ans;
            }

        }
        ans.add(-1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(subArraySum(arr,n,s));
    }
}
