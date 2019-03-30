class Solution {
    public void moveZeroes(int[] nums) {
        int movingZero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[movingZero++] = nums[i];   
            }
        }
        while(movingZero < nums.length){
            nums[movingZero++] = 0;
        }
    }
}