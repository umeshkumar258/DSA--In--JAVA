class Solution {
    public boolean isPalindrome(int x) {
        int orginal = x;
        int rev = 0;

        while(x > 0){
            int rem = x % 10;

            rev  = rem + rev* 10;

            x /= 10;
        }

        if(rev == orginal){
            return true;
        }
        else{
            return false;
        }
    }
}
