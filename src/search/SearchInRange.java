package search;

public class SearchInRange {
    static void main() {
        int arr[] = {1,3,5,7,9,2,4,6,8};
        int target = 7;
        System.out.println(search(arr, target, 1,6));

    }
    static boolean search(int arr[], int target, int a, int b){
        if(arr.length == 0){
            return false;
        }
        for(int i=a; i<=b; i++){
            if(target == arr[i]){
                return true;
            }
        }
        return false;
    }
}
