package ua.goit.javaCore4.homework8;

public class MyQueueTester {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push("Ukraine");
        myQueue.push("Germany");
        myQueue.push("France");
        myQueue.push("USA");
        System.out.println(myQueue.size());

        System.out.println(myQueue);

        System.out.println(myQueue.get(0));
        System.out.println(myQueue.get(1));
        System.out.println(myQueue.get(2));
        System.out.println(myQueue.get(3));

        System.out.println(myQueue.peek());

        myQueue.remove(3);
        System.out.println(myQueue.size());

        System.out.println(myQueue);

        String pooledValue = (String) myQueue.poll();
        System.out.println(pooledValue);

        System.out.println(myQueue);

        myQueue.clear();
        System.out.println(myQueue.size());

        System.out.println(myQueue);

        myQueue.push("USA");
        System.out.println(myQueue.size());

        System.out.println(myQueue);
    }
}
