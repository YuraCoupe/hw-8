package ua.goit.javaCore4.homework8;

public class MapNode<K, V> {
    private MapNode previous;
    private MapNode next;
    private K key;
    private V value;

    public MapNode(MapNode previous, MapNode next, K key, V value) {
        this.previous = previous;
        this.next = next;
        this.key = key;
        this.value = value;
    }

    public MapNode getPrevious() {
        return previous;
    }

    public void setPrevious(MapNode previous) {
        this.previous = previous;
    }

    public MapNode getNext() {
        return next;
    }

    public void setNext(MapNode next) {
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public String print() {
        if (this == null) {
            return "null";
        }
        String s = "Node{" +
                "previous=" + previous +
                ", next=" + next +
                ", key=" + key +
                ", value=" + value +
                '}';
        return s;
    }
}
