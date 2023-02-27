/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
};
*/

class Solution {

    public Node construct(int[][] grid) {
        int x=grid.length;
        
        Node ans=fun(grid,0,0,x,x);
        return ans;
    }

    public Node fun(int[][] grid, int rs, int cs, int re, int ce) {
       
        if (gridfun(grid, rs, cs, re, ce)) {
            boolean x;
            if (grid[rs][cs] == 1) {
                x = true;
            } else {
                x = false;
            }
            Node node = new Node(x, true);
            return node;
           
        }
        if((re-rs)==2 && (ce-cs)==2){
            boolean a=(grid[rs][cs]==1);
             boolean b=(grid[rs][ce-1]==1);
             boolean c=(grid[re-1][cs]==1);
             boolean d=(grid[re-1][ce-1]==1);
            Node node1=new Node(a,true);
             Node node2=new Node(b,true);
             Node node3=new Node(c,true);
             Node node4=new Node(d,true);
           Node root=new Node(true,false,node1,node2,node3,node4);
            return root;
        }
        
        Node topleft=fun(grid,rs,cs,rs+(re-rs)/2,cs+(ce-cs)/2);
         Node topright=fun(grid,rs,cs+(ce-cs)/2,rs+(re-rs)/2,ce);
         Node bottomleft=fun(grid,rs+(re-rs)/2,cs,re,cs+(ce-cs)/2);
         Node bottomright=fun(grid,rs+(re-rs)/2,cs+(ce-cs)/2,re,ce);
        Node ans=new Node(true,false,topleft,topright,bottomleft,bottomright);
        return ans;
    }

    public boolean gridfun(int[][] grid, int rs, int cs, int re, int ce) {
        boolean one = false;
        boolean two = false;
        for (int i = rs; i < re; i++) {
            for (int j = cs; j < ce; j++) {
                if (grid[i][j] == 1) {
                    one = true;
                } else {
                    two = true;
                }
                if (one && two) {
                    return false;
                }
            }
        }
        return true;
    }
}
