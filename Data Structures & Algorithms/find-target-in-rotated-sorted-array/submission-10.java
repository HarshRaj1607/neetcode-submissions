class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        if(nums.length==1 && nums[0]==target) return 0;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target) return mid;
            if(target<nums[mid]){
                if(nums[mid]<nums[left]) right = mid-1; 
                else if(target>=nums[left]) right = mid-1;
                else left = mid+1;
            }
            else{
                if(nums[mid]>nums[left]) left = mid+1;
                else if(target>nums[right]) right = mid-1;
                else left = mid+1;
            }
            
        }
        return -1;
    }
}
