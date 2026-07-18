class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int brr[] = new int [2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]+nums[i] == target)
                {
                    brr[0]=i;
                    brr[1]=j;
                    return brr;
                }
            }
        }
        return brr;
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        int crr[] = new int [5]; twoSum(arr,5);
        System.out.print("indices are : [");
        for(int i=0;i<crr.length;i++)
        {
        System.out.print(crr[i]);
        }
        System.out.print("]");
    }
}