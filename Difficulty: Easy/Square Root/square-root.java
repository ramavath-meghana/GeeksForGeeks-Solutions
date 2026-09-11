class Solution {
    int floorSqrt(int n) {
        // code here
        int x = 0;

        while (x * x <= n)
        {
            x++;
        }

        return x - 1;
    }
}