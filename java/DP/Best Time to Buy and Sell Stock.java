class Solution {
    public int maxProfit(int[] prices) {
        //1.
        // int len = prices.length;
        // int max=0;
        // for(int i=0;i<len-1;i++){
        //     for(int j=i+1;j<len;j++){
        //         if(prices[j]<=prices[i]){
        //             i=j-1;
        //             break;
        //         }
        //         int cur = prices[j]-prices[i];
        //         if(cur>max){
        //             max = cur;
        //         }
        //     }
        // }
        // return max;
        //2.
		// if (prices.length == 0) {
		// 	return 0 ;
		// }		
		// int max = 0 ;
		// int sofarMin = prices[0] ;
		// for (int i = 0 ; i < prices.length ; ++i) {
		// if (prices[i] > sofarMin) {
		// max = Math.max(max, prices[i] - sofarMin) ;
		// } else{
		// sofarMin = prices[i];  
		// }
		// }	     
		// return  max ;
        //3.
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
}