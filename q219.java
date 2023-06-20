class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> previous = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (!previous.containsKey(nums[i])) {
                previous.put(nums[i], i);
            } else {
                if (Math.abs(previous.get(nums[i]) - i) <= k) {
                    return true;

                } else {
                    previous.put(nums[i], i);
                }
            }
        }

        return false;
    }
}
