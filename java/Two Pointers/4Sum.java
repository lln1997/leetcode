class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(len<4)return list;
        
        for(int i=0;i<len-3;i++){
            if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target)break; //first candidate too large, search finished
            if(nums[i]+nums[len-1]+nums[len-2]+nums[len-3]<target)continue; //first candidate too small
            if(i>0&&nums[i]==nums[i-1]) continue;
            int cur = target-nums[i];
            for(int j=i+1;j<len-2;j++){
                if(nums[i]+nums[j]+nums[j+1]+nums[j+2]>target)break; //second candidate too large
                if(nums[i]+nums[j]+nums[len-1]+nums[len-2]<target)continue; //second candidate too small
                if(j>i+1&&nums[j]==nums[j-1]) continue;
                int n = cur-nums[j],m=j+1,k=len-1;
                while(m<k){
                    if(nums[m]+nums[k]==n){
                        List<Integer> l = new ArrayList<Integer>();
                        l.add(nums[m]);
                        l.add(nums[k]);
                        l.add(nums[i]);
                        l.add(nums[j]);
                        list.add(l);
                        m++;k--;
                        while(m<k&&nums[m]==nums[m-1]) m++;
                        while(m<k&&nums[k]==nums[k+1]) k--;
                    }else if(nums[m]+nums[k]<n) m++;
                    else k--;
                }
            }
        }
        return list;
    }
}