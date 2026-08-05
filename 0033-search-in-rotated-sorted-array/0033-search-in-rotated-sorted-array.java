class Solution {
    public int search(int[] nums, int target) {
        int l = 0, u = nums.length - 1;
        
        while (u >= l) {
            int mid = l + (u - l) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] <= nums[u]) {
                if (nums[mid] < target && target <= nums[u]) {
                    l = mid + 1;
                } else {
                    u = mid - 1;
                }
            }
            else {
                if (nums[l] <= target && target < nums[mid]) {
                    u = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }       
        return -1;
    }
}