package com.esafzay.coins;

import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {
        int[] coins = {1, 3, 4, 5 };
        int amount = 7;

        int minChange = minChangeDp(coins, amount);

        System.out.println(minChange);
    }

    private static int minChangeDp(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {

            dp[i] = Integer.MAX_VALUE;

            for (int coin : coins) {

                if (coin <= i) {
                    int remain = i - coin;
                    dp[i] = Math.min(dp[i], 1 + dp[remain]);
                }
            }
        }

        System.out.println("array : " + Arrays.toString(dp));

        return dp[amount] < Integer.MAX_VALUE ? dp[amount] : -1;
    }

    private static String greedyChange(int[] coins, int amount) {

        StringBuilder builder = new StringBuilder();

        int remain = amount;

        for (int i = coins.length - 1; i >= 0; i--) {

            while (remain >= coins[i]) {
                builder.append(coins[i]).append(",");
                remain = remain - coins[i];
            }

            if (remain == 0) {
                break;
            }
        }

        return builder.toString();
    }

}
