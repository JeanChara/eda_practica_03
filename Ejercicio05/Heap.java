
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
    public T peek(){
        return heapList.get(0);
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
        while(index > 0 && heapList.get(index).compareTo(heapList.get(indexPadre)) > 0){ // heap maximo. si es mayor, intercambiamos con el padre
            intercambio(index,indexPadre);
            index = indexPadre; // cambiamos de nodo a comparar
            indexPadre = (index-1)/2; // re calculamos el nuevo index del padre
        }

    }
    private void headDown(int index){
        int indexIzquierdo = 2 * index + 1;
        int indexDerecho = 2 * index + 2;
        int mayorIndex = index;

        // TAD Heap maximo
        if (indexIzquierdo < heapList.size() && heapList.get(indexIzquierdo).compareTo(heapList.get(mayorIndex)) > 0) {// vemos si nuestro nodo izquierdo es mayor a nuestro mayor nodo encontrado
            mayorIndex = indexIzquierdo;// si es asi, reemplazamos el index
        }

        if (rightChildIndex < heapList.size() && heapList.get(indexDerecho).compareTo(heapList.get(mayorIndex)) > 0) {
            mayorIndex = indexDerecho;
        }

        if (mayorIndex != index) {
            swap(index, mayorIndex); // intercambiamos lugares 
            heapifyDown(mayorIndex); // hasta que ninguno sea mayor que el elemento o que sea una hoja
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
