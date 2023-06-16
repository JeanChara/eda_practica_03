
import java.util.*;
// import exception

public class Heap <T> {
    ArrayList<T> heapList;
    public Heap (){
        heapList = new ArrayList<T>();
    }
    public void insert(T item) {
        heap.add(item);
        //
    }
    public T remove() {
        if (isEmpty()) {
            throw new ExceptionNoFound("No hay elementos en heap");
        }

        //

        return null;//
    }
    public boolean isEmpty(){
        return heapList.isEmpty();
    }

}
