package task1;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.add(2);
        stack.add(3);

        System.out.println("Елементи стеку:");

        for (int item : stack) {
            System.out.println(item);
        }
    }
}
