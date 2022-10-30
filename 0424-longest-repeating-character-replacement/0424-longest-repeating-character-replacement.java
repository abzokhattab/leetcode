class Solution {

    // ABAB 2  0   0   [000000]
    //

    // l,r  = 0
    // as you go compute the count of occurences of each element in the current subset
    // get the greatest count of the current subset
    // if that count - the size of the window is greater than k then move left to the right
    // until the count is
    //
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = -1;
        int longest = 0;
        int count[] = new int[26];
        int currentMax = 0;
        for (int i = 0; i < s.length(); i++) {
            r++;
            int windowSize = r - l + 1;
            char c = s.charAt(i);
            count[c-'A']++;
            currentMax = getMax(count);

            while (windowSize - currentMax > k) {
                count[s.charAt(l)-'A']--;
                l++;
                currentMax = getMax(count);
                windowSize = r - l + 1;
                
            }
            longest = Math.max(windowSize, longest);
        }

        return longest;
    }

    public int getMax(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) max = Math.max(a[i], max);
        return max;
    }
}
