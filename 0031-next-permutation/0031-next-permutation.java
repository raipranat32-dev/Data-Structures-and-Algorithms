class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        // 1. Find the first breakpoint from the right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i + 1] > nums[i]) {
                index = i;
                break;
            }
        }

        // 2. If no breakpoint, the array is in descending order; reverse it
        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // 3. Find the smallest number to the right of 'index' that is larger than nums[index]
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        // 4. Reverse the sequence after the 'index' to get the smallest lexicographical order
        reverse(nums, index + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}