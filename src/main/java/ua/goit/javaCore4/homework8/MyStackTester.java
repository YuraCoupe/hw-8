package ua.goit.javaCore4.homework8;

public class MyStackTester {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("Ukraine");
        myStack.push("Germany");
        myStack.push("France");
        myStack.push("USA");
        System.out.println(myStack.size());

        System.out.println(myStack.toString());

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

        myStack.push("USA");
        System.out.println(myStack.size());

        System.out.println(myStack.toString());
    }
}
