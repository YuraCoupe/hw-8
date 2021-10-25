package ua.goit.javaCore4.homework8;

public class Node<V> {
    private int index;
    private Node previous;
    private Node next;
    private V value;

    public Node(Node previous, Node next, V value) {
        this.previous = previous;
        this.next = next;
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public Node getPrevious() {
        return previous;
    }

    public Node getNext() {
        return next;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public String print() {
        if (this == null) {
            return "null";
        }
        String s = "Node{" +
                "index=" + index +
                ", previous=" + previous +
                ", next=" + next +
                ", value=" + value +
                '}';
        return s;
    }
}
