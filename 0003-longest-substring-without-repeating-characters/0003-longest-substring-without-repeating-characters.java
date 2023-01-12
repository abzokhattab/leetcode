class Solution {

    public int lengthOfLongestSubstring(String s) {
        // count array to count occurences of chars in inside the window
        // l, r = 0 ;
        // if the curreent is not in the window then r ++
        // else l = the index of the first occurence of the curr char +1 r++

        int l = 0;
        int r = 0;

        int windowLength = 0;
        int[] count = new int[256];
        Arrays.fill(count, -1);
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (count[cur] != -1) {
                for (int j = l; j < count[cur]; j++) {
                    count[s.charAt(j)] = -1;
                }
                l = count[cur] + 1;
            }
            r++;
            count[cur] = i;
            windowLength = Math.max(windowLength, r - l);
        }
        return windowLength;
    }
}
