class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int[] index = new int[2];
        // int len = numbers.length;
        // Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        // for(int i=0;i<len;i++){
        //     if(map.containsKey(target-numbers[i])){
        //         index[1]=i+1;
        //         index[0]=map.get(target-numbers[i])+1;
        //     }
        //     map.put(numbers[i],i);
        // }
        // return index;
        
        //双指针法
        int[] indice = new int[2];
        if (numbers == null || numbers.length < 2) return indice;
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int v = numbers[left] + numbers[right];
            if (v == target) {
                indice[0] = left + 1;
                indice[1] = right + 1;
                break;
            } else if (v > target) {
                right --;
            } else {
                left ++;
            }
        }
        return indice;
    }
}
