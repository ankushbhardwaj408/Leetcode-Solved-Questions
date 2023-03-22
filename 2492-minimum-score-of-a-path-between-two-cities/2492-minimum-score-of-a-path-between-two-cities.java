class Solution {

    class Pair {
        int node;
        int dis;

        public Pair(int node, int dis) {
            this.node = node;
            this.dis = dis;
        }
    }

    public int minScore(int n, int[][] roads) {
        List<List<Pair>> lis = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            List<Pair> p = new ArrayList<>();
            lis.add(p);
        }
        for (int j = 0; j < roads.length; j++) {
            lis.get(roads[j][0]).add(new Pair(roads[j][1], roads[j][2]));
            lis.get(roads[j][1]).add(new Pair(roads[j][0], roads[j][2]));
        }
        Queue<Pair> q = new LinkedList<>();
        int ans = Integer.MAX_VALUE;
        q.add(new Pair(1, Integer.MAX_VALUE));
        boolean[] vis = new boolean[n + 1];
        while (!q.isEmpty()) {
            Pair no = q.poll();

            vis[no.node] = true;
            ans = Math.min(ans, no.dis);
            for (Pair qw : lis.get(no.node)) {
                if (!vis[qw.node]) {
                    q.add(qw);
                }
            }
        }
        return ans;
    }
}
