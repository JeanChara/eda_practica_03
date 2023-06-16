public class PriorityQueueHeap<T extends Comparable<T>> {
    private Heap<T> heap;

    public PriorityQueueHeap() {
        heap = new Heap<>();
    }

public void enqueue(T item,int prioridad) {
    }
    public T dequeue() {
    }
    public T front() {
    }
    public T back() {
    }
    public boolean isEmpty() {
        
        return heap.isEmpty();
    }
}
