import java.util.*;

class processAllocation {
    public static void main(String[] args) {
        // Test Case 1: First example from problem statement
        List<Integer> processSize1 = Arrays.asList(2, 5, 3);
        List<Integer> capacity1 = Arrays.asList(6, 2, 4);
        System.out.println("Test Case 1 Result: " + Result.getMinimumTime(processSize1, capacity1));

        // Test Case 2: Sample input that should return -1
        List<Integer> processSize2 = Arrays.asList(2, 5, 8);
        List<Integer> capacity2 = Arrays.asList(6, 7, 4);
        System.out.println("Test Case 2 Result: " + Result.getMinimumTime(processSize2, capacity2));

        // Test Case 3: Additional scenario
        List<Integer> processSize3 = Arrays.asList(1, 2, 3, 4);
        List<Integer> capacity3 = Arrays.asList(4, 3, 2, 1);
        System.out.println("Test Case 3 Result: " + Result.getMinimumTime(processSize3, capacity3));
    }
}

class Result {
    public static int getMinimumTime(List<Integer> processSize, List<Integer> capacity) {
        Collections.sort(processSize, Collections.reverseOrder());
        
        Collections.sort(capacity, Collections.reverseOrder());
        
        if (processSize.get(0) > capacity.get(0)) {
            return -1;
        }
        
        int[] processorTime = new int[capacity.size()];
        
        for (int process : processSize) {
            boolean allocated = false;
            
            for (int j = 0; j < capacity.size(); j++) {
                if (process <= capacity.get(j)) {
                    processorTime[j] += 1;
                    allocated = true;
                    break;
                }
            }
            
            if (!allocated) {
                return -1;
            }
        }
        
        return Arrays.stream(processorTime).max().getAsInt();
    }
}