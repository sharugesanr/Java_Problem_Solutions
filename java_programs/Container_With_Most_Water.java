class Solution {
    public int maxArea(int[] height) {
        int val,max=0,area,left=0,right=height.length-1;
        while(left<right){
            int dist=right-left;
            int hei=Math.min(height[left],height[right]);
            area=dist*hei;
            max=Math.max(area,max);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}