class Solution {
    public int mySqrt(int x) {
        if(x<=1) {
            return x;  
        }
        int begin = 1;  
        int end   = x/2;  
        while(begin<=end) { 
            int middle = begin + (end - begin)/2;  
            //不要写成middle*middle==x，会溢出  
            if(middle==x/middle) {  
                return middle;  
            } else {  
                if (middle<x/middle) {  
                    begin = middle + 1;  
                } else {  
                    end = middle - 1;  
                }
            }
        }   
        //结束条件end一定<begin，所以返回end  
        return end;
        
        // int left = 0, right = x;
        // while (left < right) {
        //     int mid = left + (right - left) / 2;
        //不要写成middle*middle==x，会溢出  
        //     if (x / mid >= mid) left = mid + 1;
        //     else right = mid;
        // }
        // return right - 1;
    }
}
