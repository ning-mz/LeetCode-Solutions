//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
//Example 1: Input: 121	Output: true
//Example 2: Input: -121	Output: false

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x == 0)
            return true;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int input = x;
        
        //split the input integer
        while(true){
            if (input < 10){
                arrayList.add(input);
                break;
            }   
            int num = input % 10;
            arrayList.add(num);
            input = (input-num)/10;            
        }   
        
        //get the reverse result
        int result = 0;
        for (int a = 0; a < arrayList.size(); a++){
            result = result * 10;
            result = result + arrayList.get(a);            
        }
        
        //check whether the input integer is a palindrome
        if (result == x){
            return true;
        }else{
            return false;
        }           
    }
}

//Runtime: 8 ms, faster than 93.52% of Java online submissions for Palindrome Number.
//Memory Usage: 35.5 MB, less than 100.00% of Java online submissions for Palindrome Number.