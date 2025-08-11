class Solution {
    static ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        // Map: vertical → list of node values (in BFS order)
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair p = q.poll();
            Node curr = p.node;
            int vertical = p.vertical;

            map.putIfAbsent(vertical, new ArrayList<>());
            map.get(vertical).add(curr.data);

            if (curr.left != null) {
                q.add(new Pair(curr.left, vertical - 1));
            }
            if (curr.right != null) {
                q.add(new Pair(curr.right, vertical + 1));
            }
        }

        ans.addAll(map.values());
        return ans;
    }
}

class Pair {
    Node node;
    int vertical;
    Pair(Node node, int vertical) {
        this.node = node;
        this.vertical = vertical;
    }
}
