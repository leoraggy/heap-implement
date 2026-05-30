
import java.util.ArrayList;
import java.util.List;

/**
 * A min-heap. 
 * 
 * Must contain functionality for the following: (n = # of elements in heap)
 * 
 * Adding a new value to the heap  O(log(n))
 * Popping the front of the heap O(log(n))
 * Peeking at the front of the heap without removing the element O(1)
 * Getting the size of the heap O(1)
 * Checking whether the heap is empty O(1)
 * 
 * 
 * The Heap must hold ints
 * 
 * Use List/ArrayList as a backing array, but DO NOT use the 
 * PriorityQueue class. Do not make Node objects, use array
 * indexing instead.
 * 
 * It is up to you to make design decisions about how to:
 *  - name methods
 *  - determine return value and argument types
 *  - hold private instance variables
 */
public class Heap {
    public static List<Integer> heap;
    
    public Heap(){
        this.heap = new ArrayList<>();
    }

    public void add(int num){
        heap.add(num);
        siftUp(heap.size()-1);
    }

    private static int getParent(int idx) {
        return (idx - 1) / 2;
    }

    private static int getLeftChild(int idx) {
        return idx * 2 + 1;
    }

    private static int getRightChild(int idx) {
        return idx * 2 + 2;
    }

    private static void siftUp(int idx) {
        int parentIndex = getParent(idx);

        while (heap.get(idx) > heap.get(parentIndex)) {
            swap(idx, getParent(idx));
        }        
    }

    private static void swap(int child, int parent) {
        int temp = heap.get(child);
        heap.set(child, heap.get(parent));
        heap.set(parent,temp);
    }

    public int pop(){   
        return 0;
    }

    public int peek(){
        return heap.get(0);
    }

    public int size(){
        return heap.size();
    }

    public boolean isEmpty(){
        return heap.isEmpty();
    }

}