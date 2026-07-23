class Solution {
    static void reverse(int arr[], int l, int u)
{
    while(l<u)
    {
        int temp = arr[l];
        arr[l] = arr[u];
        arr[u] = temp;
        l++;
        u--;
    }
}
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        if (k == 0 ) return;
        reverse(nums,0,nums.length-k-1);
   reverse(nums, nums.length-k, nums.length-1);
   reverse(nums,0,nums.length-1);
}
    }
