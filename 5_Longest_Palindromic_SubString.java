//Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//Example:
//Input: "babad"
//Output: "bab"
//Note: "aba" is also a valid answer.

class Solution {
    public String longestPalindrome(String s) {
        if (s.equals("")){            
            return s;
            }
        
        String result = String.valueOf(s.charAt(0));
        char[] input = s.toCharArray();
        
        if (s.length() == 1)
            return result;
                
        for (int i=0; i<input.length-1; i++){
            for (int j=input.length-1; j>i; j--){
                char[] tmp = new char[j-i+1];
                System.arraycopy(input, i, tmp, 0, j-i+1);
                if (check(tmp)){
                  if (result.length() < j-i+1){
                      result = new String(tmp);                      
                  }                    
                }               
            }            
        }        
        return result;
    }    
    
    public boolean check(char[] input){
        if (input.length < 2)
            return true;
        int a=0;
        int b=input.length-1;
        while (true){            
            if (a>b)
                return true;            
            if (input[a] == input[b]){
                a++;
                b--;                
            }else{
                return false;
            }            
        }       
    }    
}

//Runtime: 1012 ms, faster than 7.83% of Java online submissions for Longest Palindromic Substring.
//Memory Usage: 38.5 MB, less than 47.19% of Java online submissions for Longest Palindromic Substring.