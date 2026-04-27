package List;
import java.util.Vector;

public class VectoDemo {
    public static void main(String[] args) {

        // It is a Thread Safe 
        Vector<Integer> vector = new Vector<>();
        vector.add(2);
        // see
    //     public synchronized boolean add(E e) {
    //          modCount++;
    //          add(e, elementData, elementCount);
    //          return true;
    //      }

    System.out.println(vector);
    }
}