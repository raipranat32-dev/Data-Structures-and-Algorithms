class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, u = nums.length - 1;

        while (l <= u) {
            int mid = l + (u - l) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                u = mid - 1;
            }
        }

        return l;
    }
}