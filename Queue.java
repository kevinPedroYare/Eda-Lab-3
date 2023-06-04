import java.util.ArrayList;
import java.util.List;

public class Queue<E> {
    private List<E> queue;

    //Constructor
    public Queue() {
        queue = new ArrayList<>();
    }

    //Función agregar
    public boolean push(E e) {
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
    public E top() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.get(0);
    }

    //Recupera y elimina el encabezado de esta cola
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.remove(0);
    }

    public E search(int position) {
        if (isEmpty() || position < 0 || position > queue.size()) {
            return null;
        }
        return queue.get(position);
    }
}