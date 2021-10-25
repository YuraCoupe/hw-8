package ua.goit.javaCore4.homework8;


public class MyArrayListTester {
    public static void main(String[] args) {
        MyArrayList myStringArrayList = new MyArrayList();
        myStringArrayList.add("England");
        myStringArrayList.add("Ukraine");
        myStringArrayList.add("Germany");
        myStringArrayList.add("USA");
        myStringArrayList.add("France");

        System.out.println((myStringArrayList.print()));

        myStringArrayList.remove(10);
        System.out.println((myStringArrayList.print()));

        myStringArrayList.remove(0);
        System.out.println((myStringArrayList.print()));

        myStringArrayList.remove(2);
        System.out.println((myStringArrayList.print()));

        System.out.println(myStringArrayList.size());
        myStringArrayList.clear();
        System.out.println((myStringArrayList.print()));
        System.out.println(myStringArrayList.size());

        MyArrayList myIntArrayList = new MyArrayList();
        myIntArrayList.add(100);
        myIntArrayList.add(500);
        myIntArrayList.add(100500);
        myIntArrayList.add(90);
        myIntArrayList.add(210);

        System.out.println((myIntArrayList.print()));

        myIntArrayList.remove(10);
        System.out.println((myIntArrayList.print()));

        myIntArrayList.remove(0);
        System.out.println((myIntArrayList.print()));

        System.out.println(myIntArrayList.size());
        myIntArrayList.clear();
        System.out.println((myIntArrayList.print()));
        System.out.println(myIntArrayList.size());


    }
}
