class Solution {
    public int singleNumber(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++){
            if(!hashSet.contains(nums[i])){
                hashSet.add(nums[i]);
            }
            else{
                hashSet.remove(nums[i]);
            }
        }

        for(Integer num : hashSet){
            return num; 
        }
        return 0; 
    }
}
