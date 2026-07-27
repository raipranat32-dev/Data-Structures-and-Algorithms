class Solution {
    public boolean isPalindrome(int x) {
      int rev=0,t=x;
      if(x>0)
        {
            while(x!=0)
            {
              rev = rev*10+(x%10);
              x/=10;
    }
}
       if( rev == t)return true;
       else 
       {
        return false;
       }
    }
}