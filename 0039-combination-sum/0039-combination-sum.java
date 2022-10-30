class Solution {
    List<List<Integer>> combinations;

    void find(int index, int candidates[], int target, List<Integer> combination) {
        if (target == 0) {
            combinations.add(new ArrayList<>(combination));
            return;
        }
        if (target < 0 || index >= candidates.length) return;
        for (int i = index; i < candidates.length; i++) {
            combination.add(candidates[i]);
            find(i, candidates, target - candidates[i], combination);
            combination.remove(combination.size() - 1);
        }
        return;
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combinations = new ArrayList<>();
        find(0, candidates, target, new ArrayList<>());
        return combinations;
    }
}
