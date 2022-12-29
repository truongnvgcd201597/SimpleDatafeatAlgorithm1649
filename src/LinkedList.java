package src;

class LinkedList{
    private static class Node<String>{
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
        }
    }
    private Node head;
    public void InsertHead(String data){
        Node newNode = new Node(data);
        if(head != null) newNode.next = head;
        head = newNode;
    }
    public void insertTail(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }
    public void getHead(){
        System.out.println(head.data);
    }
    public void getTail(){
        while (head.next != null){
            head = head.next;
        }
        System.out.println(head.data);
    }
    public int getSize(){
        int count = 0;
        while (head != null){
            head = head.next;
            count++;
        }
        return count;   
    }
    public void insertBeforePosition(String data, int position){
        if(position <= 0 || head == null){
            InsertHead(data);
        }
        Node newNode = new Node(data);
        var prev = head;
        var curr = head;
        int i = 0;
        while (curr != null || i < position){
            if(curr == null) {
                // handle the case where the position is larger than the number of elements in the list
                return;
            }
            prev = curr;
            curr = curr.next;
            i++;
        }
        prev.next = newNode;
        newNode.next = curr;
    }
    public void removeHead(){
        head = head.next;
    }
    public void removeTail(){

    }
    public void printList(){
        Node n = head;
        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[]args){
        LinkedList lk = new LinkedList();
        lk.InsertHead("DDD");
        lk.InsertHead("CCC");
        lk.InsertHead("MMM");
        lk.printList();
        lk.removeHead();
        lk.printList();
    }
}