class Solution {
    int floorSqrt(int n) {
        // code here
        if(n==0 || n==1)
        {
         return n;
        }
        int start = 1;
        int end = n;
        int ans = 0;
        while (start <= end) {
            
            int mid = start + (end - start) / 2;

            if (mid <= n / mid) {
                ans = mid;       // 'mid' is a valid floor root, store it!
                start = mid + 1; // Try to find a larger valid number in the right half
            } else {
                end = mid - 1;   // mid * mid is too big, look in the lower half
            }
        }
        
        return ans;
        
    }
}