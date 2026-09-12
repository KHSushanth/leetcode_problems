class Solution {
    public int maxProfit(int[] prices) {

        int max = 0;
        int l = 0;
        int sub;

        for (int r = 1; r < prices.length; r++) {

            sub = prices[r] - prices[l];

            if (sub > 0) {
                max = Math.max(max, sub);
            }

            if (prices[r] < prices[l]) {
                l = r;
            }
        }

        return max;
    }
}
