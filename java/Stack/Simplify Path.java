class Solution {
    public String simplifyPath(String path) {
        if(path.equals("/")) return path;
        Deque<String> stack = new LinkedList<String>();
        String result = "";
        for(String str:path.split("/")){
            if(str.equals("..")&&!stack.isEmpty()) stack.pop();
            else if(str.equals(".")) continue;
            else if(!str.equals("")&&!str.equals("..")) stack.push(str);
        }
        for(String ss:stack){
        	if(ss.contains("/")) result = ss+result;
            else result = "/" + ss +result;
        }
        return result.isEmpty()?"/":result;
    }
}