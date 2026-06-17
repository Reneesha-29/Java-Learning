package search;

public class FindMin {
    static void main() {
        int arr[] = {3,7,5,2,9,1,-4};
        System.out.println(mini(arr));
    }
    static int mini(int arr[]){
        int a = arr[0];
        for(int i=0; i<arr.length; i++){

            if(arr[i]<a){
                a = arr[i];
            }
        }
        return a;
    }
}
