class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int r  = 0 ; 
        for (int i = 1; i <prices.length ; i++ ){
            if ( prices[i]> buy){
                r = Math.max(r, prices[i]-buy); 
            } else buy = prices[i];
            
        }
        
        return r; 
    }
}