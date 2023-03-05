class Solution {

    public int minJumps(int[] arr) {
        if(arr.length==1)return 0;
        int n = arr.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(arr[i], v -> new ArrayList<>()).add(i);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int step = 0;

        while (!q.isEmpty()) {
            step++;
            int size = q.size();
            for (int j = 0; j < size; j++) {
                int x = q.poll();
                if (x - 1 >= 0 && map.containsKey(arr[x - 1])) {
                    q.add(x - 1);
                }
                if (x + 1 < n && map.containsKey(arr[x + 1])) {
                    if (x + 1 == n - 1) return step;
                    q.add(x + 1);
                }
                if (map.containsKey(arr[x])) {
                    for (int y : map.get(arr[x])) {
                        if (x != y) {
                            if (y == n - 1) return step;
                            q.add(y);
                        }
                    }
                }
                map.remove(arr[x]);
            }
        }
        return step;
    }
}
