public class test {

    public static void main(String[] args) throws ExceptionNoFound {
        Heap<Integer> maxHeap = new Heap<>();
          maxHeap.insert(4);
          maxHeap.insert(11);
          maxHeap.insert(5);
          maxHeap.insert(1);
          maxHeap.insert(3);
          
          for(int i=0; i < maxHeap.getArray().size(); i++) {
          System.out.println(maxHeap.getArray().get(i));
          }
          System.out.println("Removiendo el mayor :"+maxHeap.remove());
          
          for(int i=0; i < maxHeap.getArray().size(); i++) {
               System.out.println(maxHeap.getArray().get(i));
          }
          System.out.println("El maximo es :"+maxHeap.getMax());
          System.out.println("El minimo es :"+maxHeap.getMin());
          
    }
}

