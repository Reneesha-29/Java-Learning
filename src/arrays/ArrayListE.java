package arrays;

import java.util.ArrayList;
public class ArrayListE {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        row.add(67);
//        list.add(row);
        row.add(2);
//        list.add(row);
        row.add(6);
        list.add(row);
        System.out.println(list);
    }

}
