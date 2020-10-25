学习笔记
1、深度优先、广度优先
熟记深度优先、广度优先的写法
DFS:
public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> allResults = new ArrayList<>();
        if(root==null){
            return allResults;
        }
        travel(root,0,allResults);
        return allResults;
}
private void travel(TreeNode root, int level, List<List<Integer>> results) {
    if(results.size()==level){
        results.add(new ArrayList<>());
    }
    results.get(level).add(root.val);
    if(root.left!=null){
        travel(root.left,left+1,results);
    }
    if(root.right!=null){
        travel(right.right,level+1,results);
    }
}
BFS:
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> allResults = new ArrayList<>();
    if (root == null) {
        return allResults;
    }
    Queue<TreeNode> nodes = new LinkedList<>();
    nodes.add(root);
    while (!nodes.isEmpty()) {
        int size = nodes.size();
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            TreeNode node = nodes.poll();
            results.add(node.val);
            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        }
        allResults.add(results);
    }
    return allResults;
}
2、贪心算法
贪心算法是每一步都选择当前状态下最好或最优的选择，从而希望导致全局最优的算法
贪心算法和动态规划的最大不同是它对每个子问题都作出选择不能回退，动态规划会保存以前的运算结果，并根据以前的结果对当前选择，并提供回退功能
3、二分查找
首先二分查找适用于有序集合的查找算法，时间复杂度可以达到O(logN)
重点是需要记住二分查找的代码模板：
public int binarySearch(int[] array, int target) {
    int left = 0, right = array.length - 1, mid;
    while (left <= right) {
        mid = (right - left) / 2 + left;
        if(array[mid] == target) {
            return mid;
        } else if(array[mid]>target) {
            right = mid -1;
        } else if(array[mid]<target) {
            left = mid + 1;
        }
     }
     return -1;
        
}