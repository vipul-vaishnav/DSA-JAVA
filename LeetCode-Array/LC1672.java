public class LC1672 {
    // 1672. Richest Customer Wealth
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maxWealth(accounts));
    }

    public static int maxWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum+=accounts[i][j];
            }
            if (sum > maxWealth) maxWealth = sum;
        }
        return maxWealth;
    }
}
