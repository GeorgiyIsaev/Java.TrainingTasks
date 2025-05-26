package stage03.containers;



public class MiniList<T> {
    private int size;
    public int getSize() {
        return size;
    }
    public MiniList() {
        size = 0;
    }
    Node<T> head;
    Node<T> last;

    public void addLast(T value) {
        if (this.head == null) {
            Node<T> node = new Node<T>(value);
            this.head = node;
            this.last = node;
        } else {
            Node<T> oldLast = last;
            last.setNext(new Node<T>(value));
            this.last = last.getNext();
            this.last.setPrev(oldLast);

        }
        size++;
    }

    public T removeFirst() {
        if (this.head == null) {
            throw new IllegalArgumentException();
        }
        T removeValue = this.head.data();
        size--;
        this.head = this.head.getNext();
        if(head == null){
            this.last = null;
        }
        else {
            this.head.setPrev(null);
        }
        return removeValue;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("[");
        Node<T> temp = head;
        while (temp != null) {
            string.append(temp.data());

            if (temp.getNext() != null) {
                string.append(",");
            }
            temp = temp.getNext();
        }
        string.append("]");
        return string.toString();
    }

    ///  НОДА static так MiniList не нуждается в доступе к экземпляру Node
    ///  Обратные ссылки на класс MiniList ну нужна,
    ///  так как занимает лишнюю память
    private static class Node<T> {
        private T value;
        private Node<T> next;
        private Node<T> prev;

        public Node(T value) {
            this.value = value;
        }

        public T data() {
            return value;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }

        public Node<T> getPrev() {
            return prev;

        }
    }
}

