package ua.goit.javaCore4.homework8;

public class MyStack <V>{
    private int size = 0;
    private Node firstNode = new Node(null, null, null);
    private Node lastNode = new Node(null, null, null);

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getFirstNode() {
        return firstNode;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public void push(V value) {
        if (size == 0) {
            Node newNode = new Node(null, null, value);
            firstNode = newNode;
            firstNode.setIndex(0);
            lastNode = firstNode;
        } else {
            Node newNode = new Node(lastNode, null, value);
            lastNode.setNext(newNode);
            lastNode = newNode;
            lastNode.setIndex(size);
        }
        size++;
    }

    public boolean remove(int index) {
        if (index < 0 | index >= size) {
            return false;
        }
        if (size == 1) {
            firstNode.setValue(null);
            return true;
        }
        Node node = firstNode;
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (node.getIndex() == index) {
                flag = true;
                if (node.getIndex() == 0) {
                    node.getNext().setPrevious(null);
                    firstNode = node.getNext();
                } else if (node.getIndex() == size - 1) {
                    node.getPrevious().setNext(null);
                    lastNode = node.getPrevious();
                } else {
                    node.getPrevious().setNext(node.getNext());
                    node.getNext().setPrevious(node.getPrevious());
                }
                size--;
            }
            if (node.getIndex() > index) {
                node.setIndex(node.getIndex() - 1);
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
        firstNode.setValue(null);
        firstNode.setIndex(0);
        lastNode = firstNode;
        size = 0;
    }

    public int size() {
        return size;
    }

    public V peek() {
        if (size == 0) {
            return null;
        }
        return (V) lastNode.getValue();
    }

    public V poll() {
        if (size == 0) {
            return null;
        }
        V result = (V) lastNode.getValue();
        Node node = lastNode;
        node.getPrevious().setNext(null);
        node = node.getPrevious();
        lastNode = node;
        size = size - 1;

        return result;
    }

    public String toString() {
        Node node = firstNode;
        String result = new String();
        for (int i = 0; i < size; i++) {
            result += node.print() + "\n";
            node = node.getNext();
        }
        return result;
    }
}
