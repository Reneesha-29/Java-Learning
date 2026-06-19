package leetcode_search;

public class Leetcode744 {
    static void main(String[] args) {
        char letters[] = {'c','f','j'};
        char target = 'c';
        System.out.println(sol(letters, target));
    }
    static char sol(char letters[], char target){
        int start = 0;
        int end = letters.length - 1;
//        if(target > letters[end]){
//            return letters[0];
//        }
        while(start <= end){
//            int mid = (start+end)/2;
            int mid = start + (end-start) /2;
            if(target < letters[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}

