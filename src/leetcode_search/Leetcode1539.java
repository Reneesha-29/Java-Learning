package leetcode_search;

import java.util.ArrayList;

public class Leetcode1539 {
    static void main() {
        int arr[] = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(kth(arr, k));
    }
    static int kth(int arr[], int k){
        int n = arr.length;
        int start = 0;
        int current = 1;
        ArrayList<Integer> list = new ArrayList<>();
        while(list.size() < k){
            if(start<n && arr[start]==current){
                start++;
            }
            else{
                list.add(current);
            }
            current++;
        }
        return list.get(k-1);
    }
}