class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int val : nums) set.add(val);
        return set.size() < nums.length;
    }
}