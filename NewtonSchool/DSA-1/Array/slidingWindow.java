package Arrays;

import java.util.*;

public class slidingWindow {
    public static ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<k;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
        }
        list.add(map.size()); //First window element added to list

        for(int i=k;i<n;i++){
            if(map.get(A[i-k])==1){
                map.remove(A[i-k]);
            }
            else{
                map.put(A[i-k],map.get(A[i-k])-1);
            }
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            list.add(map.size());
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(countDistinct(arr,n,k));
    }
}
