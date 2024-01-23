package day022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 652. Find Duplicate Subtrees
 *
 * @author created by sunjy on 1/22/24
 */
public class FindDuplicateSubtrees {

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, int[]> map = new HashMap<>();
        List<TreeNode> duplicates = new ArrayList<>();
        process(root, map, duplicates);
        return duplicates;
    }

    private String process(TreeNode node, Map<String, int[]> map, List<TreeNode> duplicates) {
        if (node == null) {
            return "";
        }
        String serialized = node.val + "," +
                process(node.left, map, duplicates) + "," +
                process(node.right, map, duplicates);
        map.putIfAbsent(serialized, new int[]{0});
        map.get(serialized)[0]++;
        if (map.get(serialized)[0] == 2) {
            duplicates.add(node);
        }
        return serialized;
    }

}
