class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length-1;
        int area = 0;
        while(i<j){
            int temp;
            temp = Math.min(heights[i],heights[j])*(j-i);
            if(temp>area) area = temp;
            if(heights[i]<heights[j]) i++;
            else j--;
        }
        return area;
    }
}
