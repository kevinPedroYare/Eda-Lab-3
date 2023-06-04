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

    //Función que revisa si la cola está vacía
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    //Función que limpia todos los elementos
    public void clear() {
        queue.clear();
    }
}