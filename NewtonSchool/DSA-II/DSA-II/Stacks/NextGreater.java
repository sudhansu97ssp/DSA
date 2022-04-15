package Stacks;

import java.util.*;

public class NextGreater {
    public static int [] nextGreaterEle(int [] arr){
        Stack<Integer> st=new Stack<>();
        st.push(0);
        int ci=1;
        int [] res=new int [arr.length];
        while(ci<arr.length){
            while(!st.isEmpty()&& arr[st.peek()]<arr[ci]){
                res[st.pop()]=arr[ci];
            }
            st.push(ci);
            ci++;
        }
        while(!st.isEmpty()){
            res[st.pop()]=-1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nextGreaterEle(arr)));
    }
}
