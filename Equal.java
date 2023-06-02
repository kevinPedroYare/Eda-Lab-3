import java.util.Stack;

public class Equal{
    public static void main(String[] args){
        Stack<Integer> pila1 = new Stack<Integer>();
        Stack<Integer> pila2 = new Stack<Integer>();
        Stack<Integer> pila3 = new Stack<Integer>();

        //Agregar elementos a la pila 1
        pila1.add(1);
        pila1.add(2);
        pila1.add(1);
        pila1.add(1);

        //Agregar elementos a la pila 2
        pila2.add(1);
        pila2.add(1);
        pila2.add(2);

        //Agregar elementos a la pila 3
        pila3.add(1);
        pila3.add(1);
    }

    public static int equalStack(Stack<Integer> pila1,Stack<Integer> pila2, Stack<Integer> pila3){
        int sumaPila1 = sumPila(pila1);
        int sumaPila2 = sumPila(pila2);
        int sumaPila3 = sumPila(pila3);

        while (!equals(pila1, pila2, pila3)){
            int maxSum = Math.max(sumaPila1, Math.max(sumaPila2, sumaPila3));

            if(maxSum == sumaPila1){
                sumaPila1 -= pila1.pop();
            }else if(maxSum == sumaPila2){
                sumaPila2 -= pila2.pop();
            }else{
                sumaPila3 -= pila3.pop();
            }
        }

        return sumaPila1; //Todas las pilas son iguales 
    }

    public static int sumPila(Stack<Integer> pila){
        int suma = 0;
        for(int num : pila){
            suma += num;
        }
        return suma;
    }

    public static boolean equals(Stack<Integer> pila1,Stack<Integer> pila2, Stack<Integer> pila3){
        return sumPila(pila1) == sumPila(pila2) && sumPila(pila2) == sumPila(pila3);
    }
}