//Given a 32-bit signed integer, reverse digits of an integer.
//Example: Input: 123;	Output: 321

class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0){
            int tmp = x%10;
            x = x/10;            
            
            if (result > Integer.MAX_VALUE/10 || ((result == Integer.MAX_VALUE/10) &&  tmp>7))
                return 0;                            
            
            if (result < Integer.MIN_VALUE/10 || ((result == Integer.MIN_VALUE/10) &&  tmp<-8))
                return 0;
                                                                    
            result = result*10 + tmp;            
        }
        return result;
    }
}

//Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Integer.
//Memory Usage: 32.4 MB, less than 100.00% of Java online submissions for Reverse Integer.