import java.util.*;

public class Solution {
    static List<List<Integer>> adj;
    static int[] values;
    
    public static int getAnswer(int n, List<Integer> a, List<Integer> par) {
        // Convert input lists to arrays for easier handling
        values = a.stream().mapToInt(Integer::intValue).toArray();
        
        // Build adjacency list representation
        adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        
        // Create tree edges
        for (int i = 1; i < n; i++) {
            int parent = par.get(i);
            adj.get(parent).add(i);
        }
        
        int count = 0;
        // Check each node if it forms a good subtree
        for (int i = 0; i < n; i++) {
            if (isGoodSubtree(i, n)) {
                count++;
            }
        }
        
        return count;
    }
    
    private static boolean isGoodSubtree(int root, int n) {
        // Get nodes in subtree
        Set<Integer> subtree = new HashSet<>();
        dfs(root, subtree);
        
        // Calculate LCM of subtree
        long subtreeLcm = 0;
        boolean first = true;
        for (int node : subtree) {
            if (first) {
                subtreeLcm = values[node];
                first = false;
            } else {
                subtreeLcm = lcm(subtreeLcm, values[node]);
            }
        }
        
        // Calculate LCM of remaining nodes
        long remainingLcm = 0;
        first = true;
        for (int i = 0; i < n; i++) {
            if (!subtree.contains(i)) {
                if (first) {
                    remainingLcm = values[i];
                    first = false;
                } else {
                    remainingLcm = lcm(remainingLcm, values[i]);
                }
            }
        }
        
        // If remaining tree is empty, LCM should be 0
        if (subtree.size() == n) {
            remainingLcm = 0;
        }
        
        return subtreeLcm == remainingLcm;
    }
    
    private static void dfs(int node, Set<Integer> visited) {
        visited.add(node);
        for (int child : adj.get(node)) {
            if (!visited.contains(child)) {
                dfs(child, visited);
            }
        }
    }
    
    private static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    private static long lcm(long a, long b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a) * (Math.abs(b) / gcd(Math.abs(a), Math.abs(b)));
    }

    public static void main(String[] args) {
        // Test Case 1
        List<Integer> a1 = Arrays.asList(2, 4);
        List<Integer> par1 = Arrays.asList(0, 1);
        System.out.println(getAnswer(2, a1, par1));  // Expected: 1
        
        // Test Case 2
        List<Integer> a2 = Arrays.asList(1);
        List<Integer> par2 = Arrays.asList(0);
        System.out.println(getAnswer(1, a2, par2));  // Expected: 0
        
        // Test Case 3
        List<Integer> a3 = Arrays.asList(2, 2, 3, 3, 3, 3, 3, 2);
        List<Integer> par3 = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7);
        System.out.println(getAnswer(8, a3, par3));  // Expected: 4
    }
}