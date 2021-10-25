package ua.goit.javaCore4.homework8;

public class MyQueue<V> extends MyLinkedList {
    public V peek() {
        if (super.getSize() == 0) {
            return null;
        }
        return (V) super.getFirstNode().getValue();
    }

    public V poll() {
        if (super.getSize() == 0) {
            return null;
        }
        V result = (V) super.getFirstNode().getValue();
        Node node = super.getFirstNode();
        node.getNext().setPrevious(null);
        node = node.getNext();
        super.setFirstNode(node);
        super.setSize(super.getSize() - 1);
        for (int i = 0; i < super.getSize(); i++) {
            node.setIndex(node.getIndex() - 1);
            node = node.getNext();
        }

        return result;
    }
}
