class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        if (strs.length ==1 ) return strs[0]; 
        
        A: for (int i = 0;  i<=200 ;i++ ){
            for (int j = 0; j<strs.length-1;j++){
                if (strs[j].length() <= i ||strs[j+1].length() <= i  ) break A; 
                if(strs[j].charAt(i) != strs[j+1].charAt(i) ) break A; 
            }
            if (strs[0].equals("")) return "";
            res+= strs[0].charAt(i);
            
        }
        return res; 
    }
}