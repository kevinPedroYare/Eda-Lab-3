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

    //Recupera al encabezado de la cola
    public E element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.get(0);
    }

    //Agrega un nuevo elemento a la cola
    public boolean offer(E e) {
        return queue.add(e);
    }
}