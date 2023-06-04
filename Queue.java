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

    //Busca el número de orden
    public E search(int position) {
        if (isEmpty() || position < 0 || position > queue.size()) {
            return null;
        }
        return queue.get(position);
    }
    
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        System.out.println(queue.isEmpty()); // Imprime: true

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);

        System.out.println(queue.isEmpty()); // Imprime: false
        System.out.println(queue.top()); // Imprime: 10

        queue.pop();
        System.out.println(queue.top()); // Imprime: 20

        queue.push(50);
        System.out.println(queue.top()); // Imprime: 20

        System.out.println(queue.search(1)); // Imprime: 20
        System.out.println(queue.search(3)); // Imprime: 50
        System.out.println(queue.search(5)); // Imprime: null

        queue.clear();
        System.out.println(queue.isEmpty()); // Imprime: true
    }
}