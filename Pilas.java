import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pilas<T> {
    private List<T> pilas;

    public Pilas() {
        pilas = new ArrayList<>();
    }

    public boolean isEmpty() {
        return pilas.isEmpty();
    }

    public void push(T element) {
        pilas.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return pilas.remove(pilas.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return pilas.get(pilas.size() - 1);
    }

    public int size() {
        return pilas.size();
    }

    public void clear() {
        pilas.clear();
    }
     public static void main(String[] args) {
        
    
Pilas<Integer> pilas = new Pilas<>();
pilas.push(10);
pilas.push(20);
pilas.push(30);

System.out.println("Size: " + pilas.size()); // Output: Size: 3

System.out.println(pilas.pop()); // Output: 30
System.out.println(pilas.pop()); // Output: 20

System.out.println("Size: " + pilas.size()); // Output: Size: 1

System.out.println(pilas.peek()); // Output: 10

pilas.clear();
System.out.println("Size: " + pilas.size()); // Output: Size: 0
     }
}

