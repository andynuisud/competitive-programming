class Solution {
    public boolean canJump(int[] nums) {

        int lastPos = nums.length-1; 

        for(int i = nums.length-1; i >= 0; i--){
            if(nums[i] + i >= lastPos){
                lastPos = i; 
            }
        }

        if(lastPos == 0){
            return true; 
        }
        return false; 
    }
}
