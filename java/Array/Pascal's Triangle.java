class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>(numRows);
        if(numRows==0) return list;
        for(int i=1;i<=numRows;i++){
            List<Integer> l = new ArrayList<Integer>(i);
            if(i==1) l.add(1);
            else{
                l.add(0,1);
                if(i>2){
                    for(int j=1;j<=i-2;j++){
                        int cur = list.get(i-2).get(j-1);
                        int pre = list.get(i-2).get(j);
                        l.add(j,cur+pre);
                    }
                }
                l.add(i-1,1);
            }
            list.add(l);
        }
        return list;
    }
}