class Solution {
    static int []memo2; 
    public int coinChange(int[] coins, int amount) {        
        memo2=new int [amount+1];
        Arrays.fill(memo2,amount+1);
        
    
     memo2[0]=0;
        for (int i = 1 ; i<=amount ;i++){
            for (int c : coins){
                if (i-c >= 0){
                    memo2[i]=Math.min(memo2[i],1+memo2[i-c]);
                    
                }
                
                
            }
            
            
        }

        int res = memo2[amount];
        return (res==amount+1)?-1:res;
        
    }
    
//     public int coinChangeHelper(int[] coins, int remaining){
//         if (remaining<0 ) return -1 ;
//         if(remaining == 0) return 0; 
//         if (memo2[remaining] != -2)
//             return memo2[remaining];
//         int min = Integer.MAX_VALUE;
//         for (int i= 0; i<coins.length;i++ ){
//             int curChange=coinChangeHelper(coins,remaining-coins[i] );
//             if (curChange >=0 )
//                 min= Math.min(min,curChange+1);
//         }
//         if (min== Integer.MAX_VALUE ) min=-1;
//         memo2[remaining] = min;
//         return min;
            
//     }
}