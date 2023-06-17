public class PriorityQueueHeap<T extends Comparable<T>> {
    private Heap<T> heap;

    public PriorityQueueHeap() {
        heap = new Heap<>();
    }

public void enqueue(T item,int prioridad) {
    heap.insert(item);
    //llama al metodo de la clase heap
    
    }
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola de prioridad está vacía.");
        }

        return heap.remove();
    }
    public T front() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola de prioridad está vacía.");
        }
        return heap.getMax();
    }
    public T back() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola de prioridad está vacía.");
        }

        return heap.getMin();
    }
    public boolean isEmpty() {

        return heap.isEmpty();
    }
}
