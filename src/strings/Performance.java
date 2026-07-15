package strings;

public class Performance {
    static void main() {
        String series = "";
        for(int i=0; i<26; i++){
            char ch = (char)('a' + i);
            System.out.println(ch);
            series = series + ch;
        }
        System.out.println(series);
    }
}
