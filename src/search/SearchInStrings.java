package search;

public class SearchInStrings {
    static void main() {
        String name = "Reneesha";
        char target = 'e';
        System.out.println(search2(name, target));
    }
    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
    static boolean search(String str, char tar){
        if(str.length() == 0){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            if(tar == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
