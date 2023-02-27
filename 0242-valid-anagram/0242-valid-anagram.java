class Solution {
   // two strings are anagrams if they contain the same characters but in a different order.
    
    public boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) return false ;
        
        int [] firstStringCounts = new int [256]; 
        int [] secondStringCounts = new int [256];  
        
        for (int i = 0;i<s1.length(); i++){
            firstStringCounts[s1.charAt(i)]++;
            secondStringCounts[s2.charAt(i)]++;
        }
        
                
        for (int i = 0;i<256;i++){
            if (firstStringCounts[i] != secondStringCounts[i]) return false ;
        }
        
        return true ; 
    }
}