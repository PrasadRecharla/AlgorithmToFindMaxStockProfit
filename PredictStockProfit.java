package com.db.concert;

public class PredictStockProfit {

	public static void main(String[] args) {
		int[] arr=new int[]{7,1,5,3,6,4,10};
		PredictStockProfit.getStockProfitWithBuySell(arr);
	}
	public static void getStockProfitWithBuySell(int[] arr){
		
		int minPriceSoFar=arr[0];
		int calProfitSoFar=0;
		for(int i=1;i<arr.length;i++){
			calProfitSoFar=Math.max(calProfitSoFar, arr[i]-minPriceSoFar);
			minPriceSoFar=Math.min(minPriceSoFar, arr[i]);
		}
		System.out.println("Stock Profit:"+calProfitSoFar);
	}
}
