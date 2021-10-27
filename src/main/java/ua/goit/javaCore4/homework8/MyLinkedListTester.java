package ua.goit.javaCore4.homework8;


import java.util.LinkedList;

public class MyLinkedListTester {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("Ukraine");
        myLinkedList.add("Germany");
        myLinkedList.add("France");
        myLinkedList.add("USA");
        System.out.println(myLinkedList.size());

        System.out.println(myLinkedList.toString());

        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.get(4));

        myLinkedList.remove(3);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.getLastNode().getValue());


        System.out.println(myLinkedList.toString());

        myLinkedList.clear();
        System.out.println(myLinkedList.size());

        System.out.println(myLinkedList.toString());

        myLinkedList.add("USA");
        System.out.println(myLinkedList.size());

        System.out.println(myLinkedList.toString());
    }
}
