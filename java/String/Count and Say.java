i<c.length-1;i++){
        //     if(c[i]==c[i+1]) count++;
        //     else{
        //         str = str+count+c[i];
        //         count=1;
        //     }
        // }
        // return str;
        
        //·ÇµÝ¹é
        StringBuilder cur=new StringBuilder("1");
	    StringBuilder pre=new StringBuilder("");
        for(int i=1;i<n;i++){
            int count=1;
            for(int j = 0;j<cur.length()-1;j++){
                if(cur.charAt(j)==cur.charAt(j+1)) count++;
                else{
                    pre = pre.append(count).append(cur.charAt(j));
                    count=1;
                }
            }
            pre = pre.append(count).append(cur.charAt(cur.length()-1));
        	cur = pre;
            pre = new StringBuilder("");
        }
        return cur.toString();
    }
}