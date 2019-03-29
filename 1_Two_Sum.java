class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int a=0; a<(nums.length-1); a++){
            for (int b=a+1; b<nums.length; b++){
                if ((nums[a]+nums[b]) == target)
                    return new int[] {a, b};                                                
            }            
        }  
        throw new IllegalArgumentException("No two sum solution");
    }    
}
//Complexity: O(n^2)