class MyStack {
//     public LinkedList<Integer> l1;
//     public LinkedList<Integer> l2;
//     1.
//     /** Initialize your data structure here. */
//     public MyStack() {
//         l1 = new LinkedList<Integer>();
//         l2 = new LinkedList<Integer>();
//     }
    
//     /** Push element x onto stack. */
//     public void push(int x) {
//         if(l2.isEmpty()){
//             l1.add(x);
//         }else{
//             l2.add(x);
//         }
//     }
    
//     /** Removes the element on top of the stack and returns that element. */
//     public int pop() {
//         if(l2.isEmpty()){
//             int size = l1.size();
//             while(size>1){
//                 l2.add(l1.poll());
//                 size--;
//             }
//             return l1.poll();
//         }
//         if(l1.isEmpty()){
//             int size = l2.size();
//             while(size>1){
//                 l1.add(l2.poll());
//                 size--;
//             }
//             return l2.poll();
//         }
//         return 0;
//     }
    
//     /** Get the top element. */
//     public int top() {
//         if(l2.isEmpty()){
//             int size = l1.size();
//             while(size>1){
//                 l2.add(l1.poll());
//                 size--;
//             }
//             l2.add(l1.peek());
//             int top = l1.poll();
//             return top;
//         }
//         if(l1.isEmpty()){
//             int size = l2.size();
//             while(size>1){
//                 l1.add(l2.poll());
//                 size--;
//             }
//             l1.add(l2.peek());
//             int top = l2.poll();
//             return top;
//         }
//         return 0;
//     }
    public Queue<Integer> q;
    //2.
    public MyStack() {
        q = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q.add(x);
        int size = q.size();
        for(int i =0;i<size-1;i++){
            q.add(q.poll());
        }
    }
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return q.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */