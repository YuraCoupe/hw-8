package ua.goit.javaCore4.homework8;

public class MyStack <V> extends MyLinkedList{
    public V peek() {
        if (super.getSize() == 0) {
            return null;
        }
        return (V) super.getLastNode().getValue();
    }

    public V poll() {
        if (super.getSize() == 0) {
            return null;
        }
        V result = (V) super.getLastNode().getValue();
        Node node = super.getLastNode();
        node.getPrevious().setNext(null);
        node = node.getPrevious();
        super.setLastNode(node);
        super.setSize(super.getSize() - 1);

        return result;
    }
}
