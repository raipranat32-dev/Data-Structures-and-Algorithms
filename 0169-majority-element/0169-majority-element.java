class Solution {
    static int freqCounter(int[] nums, int cf)
    {
        int freq=0;
        for(int i=0; i<nums.length; i++)
        {
            if(cf == nums[i])
            freq++;
        }
        return freq;
    }
    public int majorityElement(int[] nums) {
     for(int i=0 ; i<nums.length ; i++)
     {
      if(freqCounter(nums,nums[i]) > (nums.length/2))
      return nums[i];
      else
      continue;
     }   
     return 0;
}
}