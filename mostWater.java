class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int solution = 0;
        while(left <= right){
            int width = right-left;
            solution = Math.max(solution, (Math.min(height[left], height[right])) * width);
            if(height[left] < height[right]){
                left++;
            } else{
                right--;
            }
        }
        return solution;
    }
}