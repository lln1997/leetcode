class Solution {
    public int[] plusOne(int[] digits) {
        // int len = digits.length,pre=0,i=0;
        // int[] n = new int[len];
        // for(i = len-1;i>=0;i--){
        //     int cur;
        //     if(i==len-1) cur = digits[i]+1;
        //     else cur=digits[i]+pre;
        //     if(cur==10){
        //         pre=1;
        //         n[i]=0;
        //     }
        //     else{
        //         n[i]=cur;
        //         break;
        //     }
        // }
        // if(i>0){
        //     for(int h=0;h<i;h++){
        //         n[h]=digits[h];
        //     }
        // }
        // if(i==-1&&digits[0]==9){
        //     int[] o = new int[len+1];
        //     for(int j = 0;j<len;j++){
        //         o[j+1]=n[j];
        //     }
        //     o[0]=1;
        //     return o;
        // }else return n;
        int len = digits.length;
        for(int i=len-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        
        int[] n = new int[len+1];
        n[0]=1;
        return n;
    }
}