public class SequentialDisplay {
    public static int calculateTotalEnergy(int N, int K, String S) {
        int totalEnergy = 0;
        
        for (int i = 0; i < N - K; i++) {
            int stageEnergy = calculateStageSwitchEnergy(S.substring(i, i + K), S.substring(i + 1, i + K + 1));
            totalEnergy += stageEnergy;
        }
        
        return totalEnergy;
    }
    
    private static int calculateStageSwitchEnergy(String currentStage, String nextStage) {
        int energyRequired = 0;
        
        for (int j = 0; j < currentStage.length(); j++) {
            if (currentStage.charAt(j) != nextStage.charAt(j)) {
                energyRequired++;
            }
        }
        
        return energyRequired;
    }
    
    public static void main(String[] args) {
        // Test Case 1
        int N1 = 4;
        int K1 = 3;
        String S1 = "aabb";
        System.out.println(calculateTotalEnergy(N1, K1, S1));
        
        // Test Case 2
        int N2 = 6;
        int K2 = 3;
        String S2 = "abcabc";
        System.out.println(calculateTotalEnergy(N2, K2, S2));
    }
}