class Solution {
    public int minPartitions(String n) {
        char[] input = n.toCharArray();
        
        
        int c = 0 ;
        boolean isZero = false ;
        while (!isZero){
            
            isZero=true ;
            for(int i = 0; i<input.length;i++){
                if(input[i]!='1' && input[i]!='0')
                {
                    input[i]-=1;
                    isZero=false ;
                }
            }
            c++;
            
        }
    return c ; 
    }
}