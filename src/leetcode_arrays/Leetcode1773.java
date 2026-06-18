package leetcode_arrays;

public class Leetcode1773 {
    static void main() {
        String[][] items = {{"phone", "blue", "pixel"},
                {"computer", "silver", "lenovo"},
                {"phone", "gold", "iphone"}};
        String ruleKey = "type";
        String ruleValue = "phone";
        int count = 0;
        int c=0;

        int colIndex = 0;
        if (ruleKey.equals("type")) {
            colIndex = 0;
        } else if (ruleKey.equals("color")) {
            colIndex = 1;
        } else if (ruleKey.equals("name")) {
            colIndex = 2;
        }
        for (int row = 0; row < items.length; row++) {
            // 4. Use .equals() for text comparison
//            if (items.get(row).getClass(colIndex).equals(ruleValue)) {
            if(items[row][colIndex].equals(ruleValue)){
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
