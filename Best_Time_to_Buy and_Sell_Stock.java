public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(prices.length <=1)
        return 0;
        
        int gmax = Integer.MIN_VALUE;
        int gmin = Integer.MAX_VALUE;
        
        int []profit = new int[prices.length+1];
        for(int i=1;i<prices.length;i++){
            
            if(prices[i-1]<gmin){
                gmin = prices[i-1];
            }
            
            profit[i]= prices[i] - gmin;
            if(profit[i]>gmax){
                gmax = profit[i];
            }
        }
        
        return gmax>0?gmax:0;
        
    }
}
