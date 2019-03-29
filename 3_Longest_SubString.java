//Given a string, find the length of the longest substring without repeating characters.
//Input: "abcabcbb"
//Output: 3 
//Explanation: The answer is "abc", with the length of 3. 

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result=1;
        char[] sub = s.toCharArray();
        if (sub.length == 1)
            return 1; 
        if (sub.length == 0)
            return 0;
        
        for (int i=0; i<sub.length-1; i++){  
            boolean flag = false;                       
            for (int j=i+1; j<sub.length; j++){
                for (int k=i; k<j; k++){
                    if (sub[k] == sub[j]){   
                        flag = true;
                        break;
                    }
                }                   
                if (flag){
                    break;
                }else if(result<(j-i+1)){
                    
                    result = j-i+1;
                }
            }               
        } 
        return result;
    }
}

//Runtime: 51 ms, faster than 22.98% of Java online submissions for Longest Substring Without Repeating Characters.
//Memory Usage: 40.2 MB, less than 11.69% of Java online submissions for Longest Substring Without Repeating Characters.