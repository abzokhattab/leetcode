class Solution {

    // sort
    // start from the end
    // find sum that equals to elements at the end of the array
    // using two pointers
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(a);

        for (int i = a.length - 1; i >= 2; i--) {
            if (i != a.length - 1 && a[i] == a[i + 1]) continue;
            int target = -1 * a[i];
            int l = 0;
            int r = i - 1;

            A:while (r > l) {
                if (r != (i - 1) && a[r] == a[r + 1]) {
                    r--;
                    continue;
                }
                if (l != 0 && a[l] == a[l - 1]) {
                    l++;
                    continue;
                }

                int sum = a[l] + a[r];
                if (sum == target) {
                    ArrayList<Integer> result = new ArrayList<Integer>();
                    result.add(a[l]);
                    result.add(a[r]);
                    result.add(a[i]);
                    res.add(result);
                    l++;
                    r--;
                } else if (sum > target) r--; else l++;
            }
        }

        return res;
    }
}
