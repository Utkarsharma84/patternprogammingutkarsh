public class LinkedListImpl {
    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private static class LinkedList{
        private Node head;

//        public LinkedList(){
//            head = null;
//        }

        public int length(){
            int len = 0;
            Node node = head;
            while(node != null){
                node = node.next;
                len++;
            }
            return len;
        }

        public void insert(int data){
            Node temp = head;
            if(temp == null){
                head = new Node(data);
                return;
            }
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(data);
            return;
        }

        public void display(){
            Node temp = head;
            if(temp == null)return;

            while(temp.next != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }

        public void delete(int data){
            Node temp = head;

            if(head == null)return;

            if(head.data == data){
                head = head.next;
                return;
            }

            while(temp.next != null && temp.next.data != data){
                temp = temp.next;
            }

            if(temp.next == null)return;

            temp.next = temp.next.next;
        }

        public void insertFront(int data){
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            return;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(0);
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.display();
//        System.out.println(linkedList.length());
        linkedList.delete(0);
        linkedList.display();
    }
}
