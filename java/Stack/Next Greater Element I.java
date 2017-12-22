class Solution {
   public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length,n2 = nums2.length;
        int nums3[] = new int[n1];
        for(int k = 0;k<n1;k++){
            nums3[k] = -1;
        }
        boolean b = false;
        int j;
        for(int h = 0;h<n1;h++){
            Stack<Integer> s = new Stack<Integer>();
            for(int i = n2-1;i>=0;i--) s.push(nums2[i]);
            for(j = 0;j<n2;j++){
                int a = s.pop();
                if(a==nums1[h]&&!s.isEmpty()){
                    b = true;
                    break;
                }
            }
            if(b){  
                for(;j<n2-1;j++){
                    int c = s.pop();
                    if(c>nums1[h]){
                        nums3[h] = c;
                        break;
                    }
                }
            }
        }
        return nums3;
        // Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        // Stack<Integer> stack = new Stack<>();
        // for (int num : nums2) {
        //     while (!stack.isEmpty() && stack.peek() < num)
        //         map.put(stack.pop(), num);
        //     stack.push(num);
        // }   
        // for (int i = 0; i < nums1.length; i++)
        //     nums1[i] = map.getOrDefault(nums1[i], -1);
        // return nums1;
    }
}