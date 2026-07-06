class Solution {
    public boolean isPalindrome(int n) {
        // code here
        
        if (n < 0) {
            n = n * -1;
        }
   

        int reverse = getReverse(n);
        if(reverse == n)
           return true;
       else 
            return false;
    }
            
        public int getReverse(int num)
        {
            int rev=0;
            while(num>0)
            {
            rev = (rev * 10) + (num % 10);
            num = num / 10;
            }
            return rev;
        }
        
    
}
