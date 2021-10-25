package ua.goit.javaCore4.homework8;

public class MyStackTester {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.add("Ukraine");
        myStack.add("Germany");
        myStack.add("France");
        myStack.add("USA");
        System.out.println(myStack.size());

        System.out.println(myStack.toString());

        System.out.println(myStack.get(0));
        System.out.println(myStack.get(1));
        System.out.println(myStack.get(2));
        System.out.println(myStack.get(3));
        System.out.println(myStack.get(4));

        System.out.println(myStack.peek());

        myStack.remove(3);
        System.out.println(myStack.size());

        System.out.println(myStack.toString());

        String pooledValue = (String) myStack.poll();
        System.out.println(pooledValue);

        System.out.println(myStack.toString());

        myStack.clear();
        System.out.println(myStack.size());

        System.out.println(myStack.toString());

        myStack.add("USA");
        System.out.println(myStack.size());

        System.out.println(myStack.toString());
    }
}
