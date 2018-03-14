class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0||strs==null) return "";
        //以第一个为匹配项
        String pre = strs[0];
        for(int i = 1;i<strs.length;i++){
            while(strs[i].indexOf(pre)!=0)
                pre = pre.substring(0,pre.length()-1);
        }
        return pre;
    }
}