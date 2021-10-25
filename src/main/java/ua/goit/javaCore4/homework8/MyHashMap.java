package ua.goit.javaCore4.homework8;

public class MyHashMap <K, V> {
    private int size = 0;
    private MapNode firstNode = new MapNode(null, null, null, null);
    private MapNode lastNode = new MapNode(null, null, null, null);

    public void setFirstNode(MapNode firstNode) {
        this.firstNode = firstNode;
    }

    public void setLastNode(MapNode lastNode) {
        this.lastNode = lastNode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MapNode getFirstNode() {
        return firstNode;
    }

    public MapNode getLastNode() {
        return lastNode;
    }

    public void put(K key, V value) {
        if (size == 0) {
            MapNode newNode = new MapNode(null, null, key, value);
            firstNode = newNode;
            lastNode = firstNode;
        } else {
            MapNode newNode = new MapNode(lastNode, null, key, value);
            lastNode.setNext(newNode);
            lastNode = newNode;
        }
        size++;
    }

    public boolean remove(K key) {
        if (size == 0) {
            return false;
        }
        MapNode node = firstNode;
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (node.getKey().equals(key)) {
                flag = true;
                if (i == 0) {
                    node.getNext().setPrevious(null);
                    firstNode = node.getNext();
                } else if (i == size - 1) {
                    node.getPrevious().setNext(null);
                    lastNode = node.getPrevious();
                } else {
                    node.getPrevious().setNext(node.getNext());
                    node.getNext().setPrevious(node.getPrevious());
                }
                size--;
            }
            node = node.getNext();
        }
        if (flag == true) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        firstNode.setNext(null);
        firstNode.setKey(null);
        firstNode.setValue(null);
        lastNode = firstNode;
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        MapNode node = firstNode;
        for (int i = 0; i < size; i++) {
            if (node.getKey().equals(key)) {
                return (V) node.getValue();
            };
            node = node.getNext();
        }
        return null;
    }

    public String toString() {
        MapNode node = firstNode;
        String result = new String();
        for (int i = 0; i < size; i++) {
            result += node.print() + "\n";
            node = node.getNext();
        }
        return result;
    }
}
