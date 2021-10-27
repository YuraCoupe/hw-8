package ua.goit.javaCore4.homework8;

public class MyHashMapTester {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(50, "Mercedes");
        myHashMap.put(40, "BMW");
        myHashMap.put(30, "Audi");
        myHashMap.put(20, "Porsche");
        myHashMap.put(30, "Lada");
        myHashMap.put(null, "Lada");
        myHashMap.put(10, "Maybach");
        myHashMap.put(null, "Lexus");
        System.out.println(myHashMap);

        System.out.println(myHashMap.get(50));
        System.out.println(myHashMap.get(30));
        System.out.println(myHashMap.get(10));
        System.out.println(myHashMap.get(60));


        myHashMap.remove(60);

        System.out.println(myHashMap);

        myHashMap.remove(20);

        System.out.println(myHashMap);

        myHashMap.clear();

        System.out.println(myHashMap);

        myHashMap.put(10, "Maybach");

        System.out.println(myHashMap);
    }
}
