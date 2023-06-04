import java.util.ArrayList;
import java.util.List;

public class Queue<E> {
    private List<E> queue;

    //Constructor
    public Queue() {
        queue = new ArrayList<>();
    }

    //Función agregar
    public boolean add(E e) {
        return queue.add(e);
    }
}