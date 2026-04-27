package List;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {

        //Normal ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Ajay");
        list.add("Akmal");
        list.add("Akshat");
        for(String item:list){
            System.out.println(item);
            if(item.equals("Akshat")){
                list.add("Arvind");
            }
        }
        System.out.println(list);

        //Error came for upper code cause we can not modify list while Accessing it
        //But we can do this in CopyOnWriteArrayList Cause ..everytime you perform write operation internally it creates new ArrayList
        
        // Reading and modifying on same point
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("Ajay");
        copyOnWriteArrayList.add("Akmal");
        copyOnWriteArrayList.add("Akshat");
        for(String item:copyOnWriteArrayList){
            System.out.println(item);
            if(item.equals("Akshat")){
                copyOnWriteArrayList.add("Arvind");
            }
        }
        System.out.println(copyOnWriteArrayList);
    }
}
