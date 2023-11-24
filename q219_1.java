class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 1) return false;

        // loop through nums using i
        // if nums[i] is not in hMap, add it (nums[i], i)
        // if hMap contains Key nums[i]:
        // if Math.abs(hMap.get(nums[i]) - i) <= k return true
        // else hMap.put(nums[i], i)
        // return false

        Map<Integer, Integer> hMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (!hMap.containsKey(nums[i])) hMap.put(nums[i], i);
            else {
                if (Math.abs(hMap.get(nums[i]) - i) <= k) return true;
                else hMap.put(nums[i], i);
            }
        }

        return false;
    }
}
