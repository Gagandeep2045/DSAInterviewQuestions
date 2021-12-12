package geekofgeeks.array;

public class StockBuyAndSell {

	public static void main(String[] args) {
		// int arr[] = { 1, 5, 3, 8 };
		 int arr[] = { 1, 5, 8,100};
		// int arr[] = { 23, 21, 10, 9 };
		//int arr[] = { 1, 5, 3, 8, 12 };

		int profit = maxProfitFromStockBuyAndSellNativeSoln(arr, 0, arr.length - 1);
		int profit1 = maxProfitFromStockBuyAndSellOptimalSoln(arr);

		System.out.println(profit);
		System.out.println(profit1);

	}

	private static int maxProfitFromStockBuyAndSellOptimalSoln(int[] arr) {
		int profit = 0, low = arr[0];

		for (int i = 1; i <= arr.length - 1; i++) {
			if (arr[i] < arr[i - 1]) {
				profit += arr[i - 1] - low;
				low = arr[i];
			}
		}
		if (arr[arr.length - 1] > low) {
			profit += arr[arr.length - 1] - low;
		}

		return profit;
	}

	private static int maxProfitFromStockBuyAndSellNativeSoln(int[] stockPrice, int start, int end) {
		if (start >= end) {
			return 0;
		}

		// profit from start'th day to end'th day
		int profit = 0;
		for (int i = start; i < end; i++) {
			for (int j = start + 1; j <= end; j++) {
				// profit from ith day to jth day //buy at ith day and sell at jth day
				if ((j > i) && stockPrice[j] > stockPrice[i]) {
					int currentProfit = stockPrice[j] - stockPrice[i]
							+ maxProfitFromStockBuyAndSellNativeSoln(stockPrice, start, i - 1)
							+ maxProfitFromStockBuyAndSellNativeSoln(stockPrice, j + 1, end);
					profit = Math.max(currentProfit, profit);
				}
			}
		}

		return profit;
	}

}
