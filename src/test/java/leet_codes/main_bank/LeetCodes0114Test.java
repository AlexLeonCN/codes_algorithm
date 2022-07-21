package leet_codes.main_bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodes0114Test {
    @Test
    void testTreeNode(){
        LeetCodes0114.TreeNode treeNode3 = new LeetCodes0114.TreeNode(3,null,null);
        LeetCodes0114.TreeNode treeNode4 = new LeetCodes0114.TreeNode(4,null,null);
        LeetCodes0114.TreeNode treeNode6 = new LeetCodes0114.TreeNode(6,null,null);
        LeetCodes0114.TreeNode treeNode2 = new LeetCodes0114.TreeNode(2,treeNode3,treeNode4);
        LeetCodes0114.TreeNode treeNode5 = new LeetCodes0114.TreeNode(5,null,treeNode6);
        LeetCodes0114.TreeNode treeNode1 = new LeetCodes0114.TreeNode(1,treeNode2,treeNode5);
        LeetCodes0114 leetCodes0114 = new LeetCodes0114();
//        treeNode1.toStringLog();
        leetCodes0114.flatten(treeNode1);
        treeNode1.toStringLog();
    }
}