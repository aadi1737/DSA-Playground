package List;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Mango");
        arrayList.add("Apple");
        arrayList.add("Banana");
        System.err.println(arrayList);



        //ArrayList have initial 10 capacity ,we can give custom capactiy through parameter in Constructor
        // Every time it exceed limit ,it creates new array of 1.5x size of previous one 
        }
}