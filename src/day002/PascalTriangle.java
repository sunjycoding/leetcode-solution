package day002;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 *
 * @author created by sunjy on 1/2/24
 */
public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        result.add(list);
        if (numRows == 1) {
            return result;
        }
        for (int i = 1; i < numRows; i++) {
            List<Integer> arr = new ArrayList<>();
            List<Integer> lastArr = result.get(i - 1);
            arr.add(0, 1);
            for (int j = 1; j < i; j++) {
                arr.add(j, lastArr.get(j - 1) + lastArr.get(j));
            }
            arr.add(i, 1);
            result.add(arr);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(6));
    }

}
