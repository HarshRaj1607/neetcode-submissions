class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int j=i+1,k=nums.length-1;
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            while(j<k){
                
                if(nums[j]+nums[k]==-nums[i]){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    while(j<k && nums[j]==nums[j+1])j++;
                    while (j < k && nums[k] == nums[k - 1])k--;
                    j++;
                    k--;
                }
                
                else if(nums[j]+nums[k]<-nums[i]) j++;
                else k--;
            }
        }
        return ans;
    }
        

}
