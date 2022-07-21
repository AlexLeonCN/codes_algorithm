package leet_codes.main_bank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCodes0114 {
    static final  Logger logger = LoggerFactory.getLogger(LeetCodes0114.class);
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
        public void toStringLog() {
            logger.info(""+val);
            if (left == null && right == null)return;
            if (left == null) {
                logger.info("null");
            }else {
                this.left.toStringLog();
            }
            if (right == null) {
                logger.info("null");
            }else {
                this.right.toStringLog();
            }
        }
    }
    public void flatten(TreeNode root) {
        List<Integer> treeNodeList = new ArrayList<>();
        addTreenodes(root, treeNodeList);
        logger.info(treeNodeList.toString());
        for (int i = 0; i < treeNodeList.size(); i++) {
            root.val = treeNodeList.get(i);
            root.left = null;
            if (root.right == null && i != treeNodeList.size() -1) {
                root.right = new TreeNode();
            }
            if (i != treeNodeList.size()-1) root = root.right;
        }
    }
    private void addTreenodes(TreeNode node, List<Integer> list){
        if (node!=null) {
            list.add(node.val);
            addTreenodes(node.left,list);
            addTreenodes(node.right,list);
        }
    }
}
