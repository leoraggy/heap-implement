import static org.junit.Assert.*;
import org.junit.Test;

public class HeapTest {
    @Test
    public void testSizeForThreeElements(){
        Heap minHeap = new Heap();

        minHeap.add(15);
        minHeap.add(5);
        minHeap.add(10);
        
        int expected = 3;
        int actual = minHeap.size();

        assertEquals(expected, actual);
    }


    @Test
    public void testSizeNoElements(){
        Heap minHeap = new Heap();

        int expected = 0;
        int actual = minHeap.size();

        assertEquals(expected, actual);
    }


    @Test
    public void testIsEmptyWithElements(){
        Heap minHeap = new Heap();

        minHeap.add(5);

        boolean expected = false;
        boolean actual = minHeap.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    public void testIsEmptyNoElements(){
        Heap minHeap = new Heap();

        boolean expected = true;
        boolean actual = minHeap.isEmpty();

        assertEquals(expected, actual);
    }

    
}
