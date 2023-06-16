
import java.util.*;
// import exception

public class Heap <T> {
    ArrayList<T> heapList;
    public Heap (){
        heapList = new ArrayList<T>();
    }
    public void insert(T item) {
        heapList.add(item);
        //heapUp
    }
    public T remove() {
        if (isEmpty()) {
            throw new ExceptionNoFound("No hay elementos en heap");
        }

        //

        return null;//
    }
    public void heapUp(int index){
        int indexPadre = (index-1)/2; // formula 

        // recorremos y comparamos los heap siempre y cuando halla mas de 1
        
        

    }

    public boolean isEmpty(){
        return heapList.isEmpty();
    }


}
