class Solution {

    public class TreeNode {
        int val;
        int x;
        int y;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, int x, int y) {
            this.val = val;
            this.x = x;
            this.y = y;
        }
    }

    public int orangesRotting(int[][] nums) {
        int ans = 0;
        if (fun2(nums)) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] == 2) {
                    q.add(new TreeNode(0, i, j));
                }
            }
        }
        if (q.isEmpty()) return -1;
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            int val = node.val;
            ans = val;
            int x = node.x;
            int y = node.y;
            if (x + 1 < nums.length) {
                if (nums[x + 1][y] == 1) {
                    q.add(new TreeNode(val + 1, x + 1, y));
                    nums[x + 1][y] = 2;
                }
            }

            if (x - 1 >= 0) {
                if (nums[x - 1][y] == 1) {
                    q.add(new TreeNode(val + 1, x - 1, y));
                    nums[x - 1][y] = 2;
                }
            }

            if (y + 1 < nums[0].length) {
                if (nums[x][y + 1] == 1) {
                    q.add(new TreeNode(val + 1, x, y + 1));
                    nums[x][y + 1] = 2;
                }
            }

            if (y - 1 >= 0) {
                if (nums[x][y - 1] == 1) {
                    q.add(new TreeNode(val + 1, x, y - 1));
                    nums[x][y - 1] = 2;
                }
            }
        }
        for (int a = 0; a < nums.length; a++) {
            for (int b = 0; b < nums[0].length; b++) {
                if (nums[a][b] == 1) return -1;
            }
        }
        return ans;
    }

    public boolean fun2(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] != 0) return false;
            }
        }
        return true;
    }
}
