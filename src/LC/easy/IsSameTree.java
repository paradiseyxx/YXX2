package LC.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by yxx on 2020/5/19.
 *
 * 100. 相同的树
 */
public class IsSameTree {
    public static void main(String args[]){

        IsSameTree isSameTree = new IsSameTree();
        //System.out.println(isSameTree.isSameTree(tree1, tree2));
    }


    //节点
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            left = null;
            right = null;
            val = x;
        }
    }

    int[] array = {1,2,3};
    List<TreeNode> nodeList = null;

    //创建二叉树
    public void createBinTree(){
        nodeList = new LinkedList<>();
        for (int i = 0; i < array.length; i++){
            nodeList.add(new TreeNode(array[i]));
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q){
        if (p == null && q == null){
            return true;
        }
        if (p == null || q == null){
            return false;
        }
        if (p.val != q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }


}
