class Solution {

    public String reverseVowels(String s) {
        int l = 0;
        int r = s.length() - 1;
        Set<Character> set = new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        char[] a = s.toCharArray();
        while (l <= r) {
            if (set.contains(Character.toLowerCase(a[l])) && set.contains(Character.toLowerCase(a[r]))) {
                char t = a[l];
                a[l] = a[r];
                a[r] = t;
                l++;
                r--;
            } else if (!set.contains(Character.toLowerCase(a[l]))) {
                l++;
            } else {
                r--;
            }
        }
        return String.valueOf(a);
    }
}
