package day001_day050.day006;

import java.util.ArrayList;
import java.util.List;

/**
 * 119. Pascal's Triangle II
 *
 * @author created by sunjy on 1/6/24
 */
public class PascalTriangleTwo {

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        result.add(list);
        if (rowIndex == 0) {
            return result.get(rowIndex);
        }
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> arr = new ArrayList<>();
            List<Integer> lastArr = result.get(i - 1);
            arr.add(0, 1);
            for (int j = 1; j < i; j++) {
                arr.add(j, lastArr.get(j - 1) + lastArr.get(j));
            }
            arr.add(i, 1);
            result.add(arr);
        }
        return result.get(rowIndex);
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

}
