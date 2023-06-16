
import java.util.*;
// import exception

public class Heap <T extends Comparable <T>> {
    ArrayList<T> heapList;
    public Heap (){
        heapList = new ArrayList<T>();
    }

    public void insert(T item) {
        heapList.add(item);
        heapUp(heapList.size()-1);
    }
    public T remove() {
        if (isEmpty()) {
            throw new ExceptionNoFound("No hay elementos en heap");
        }

        //

        return null;//
    }
    private void heapUp(int index){
        int indexPadre = (index-1)/2; // formula 

        // recorremos y comparamos los heap siempre y cuando halla mas de 1
        while(index > 0 && heapList.get(index).compareTo(heapList.get(indexPadre)) > 0){ // heap maximo si es mayor, intercambiamos con el padre
            intercambio(index,indexPadre);
            index = indexPadre; // cambiamos de nodo a comparar
            indexPadre = (index-1)/2; // re calculamos el nuevo index del padre
        }

    }
    private void intercambio(int i, int j){
        T aux = heapList.get(i);
        heapList.set(i, heapList.get(j));
        heapList.set(j, aux)
    }

    public boolean isEmpty(){
        return heapList.isEmpty();
    }


}
