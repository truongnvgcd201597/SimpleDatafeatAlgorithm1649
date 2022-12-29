package src;

class Queue{
    private Node <String> head, tail;

    private class Node<String>{
        String data;
        Node next = null;

        public Node(String data) {
            this.data = data;
        }
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void EnQueue(String data){
        Node<String> newNode = new Node<>(data);

        if(data == null || data == "") throw new Error("Empty value");
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public String DeQueue(){
        if(isEmpty()) throw new NullPointerException();
        String data = head.data;
        head = head.next;
        return data;
    }
    public int size(){
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    public void Print(){
        Node<String> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Queue q = new Queue();
        q.EnQueue("BABA");
        q.EnQueue("BEBE");
        q.EnQueue("DEDE");
        q.Print();
        q.DeQueue();
        q.Print();
        System.out.println(q.size());
    }
}