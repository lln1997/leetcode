class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        if(rowIndex<0) return list;
        list.add(0,1);
        if(rowIndex==0) return list;//第一个直接返回
        list.add(1,1);
        
        int cur=1,pre;
        for(int i=0;i<rowIndex-1;i++){//控制需要进行操作几次
            for(int j=1;j<list.size();j++){//控制对应的数值运算
                pre = list.get(j);
                list.set(j,cur+list.get(j));
                cur = pre;//保存前一位数字的值
            }
            list.add(1);//每次操作最后都是1
        }
        return list;
    }
}