class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] indice = new int[2];
        // int len = nums.length;
        // for(int i = 0;i<len-1;i++){
        //     for(int j = i+1;j<len;j++){
        //         if(nums[i]+nums[j]==target){
        //             indice[0]=i;
        //             indice[1]=j;
        //         }
        //     }
        // }
        // return indice;
        
        //O(n)
        int[] indice = new int[2];
        int len = nums.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<len;i++){
            if(map.containsKey(target-nums[i])){
                indice[1]=i;
                indice[0]=map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }
        return indice;
    }
}