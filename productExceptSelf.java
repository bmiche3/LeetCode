class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] everyOtherNumber = new int[nums.length];
        int productSoFar = 1;
        for(int i = 0; i < nums.length; i++){
            everyOtherNumber[i] = productSoFar;
            productSoFar *= nums[i];
        }
        
        productSoFar = 1;
        for(int i = nums.length-1; i >=0; i--){
            everyOtherNumber[i] *= productSoFar;
            productSoFar *= nums[i];
        }
        
        return everyOtherNumber; 
    }
}

