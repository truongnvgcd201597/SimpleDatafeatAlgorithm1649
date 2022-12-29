package src;

class Stack{
    private static class Node<String>{
        String data;
        Node next = null;

        public Node(String data) {
            this.data = data;
        }
    }
    private Node top;
    public Boolean isEmpty(){
        return top == null;
    }

    public void push(String data){
        Node<String> newNode = new Node<>(data);
        if(isEmpty()){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
    }
    public void pop(){
        top = top.next;
    }
    public void Print(){
        Node<String> temp = top;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Stack s = new Stack();
        s.push("g");
        s.push("j");
        s.push("l");
        s.Print();
        s.pop();
        s.Print();
    }
}