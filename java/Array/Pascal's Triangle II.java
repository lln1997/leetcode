class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        if(rowIndex<0) return list;
        list.add(0,1);
        if(rowIndex==0) return list;//��һ��ֱ�ӷ���
        list.add(1,1);
        
        int cur=1,pre;
        for(int i=0;i<rowIndex-1;i++){//������Ҫ���в�������
            for(int j=1;j<list.size();j++){//���ƶ�Ӧ����ֵ����
                pre = list.get(j);
                list.set(j,cur+list.get(j));
                cur = pre;//����ǰһλ���ֵ�ֵ
            }
            list.add(1);//ÿ�β��������1
        }
        return list;
    }
}