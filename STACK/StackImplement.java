import java.util.*;

public class StackImplement {

    static final int max = 100;
    int top;
    int stack[] = new int[max];

    StackImplement() {
        top = -1;
    }

    Boolean isEmpty() {
        return top == -1;
    }

    public void push(int x) {
        if (top >= max - 1) {
            System.out.println("stack overflow");
        } else {
            stack[++top] = x;
        }

    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
        }
        return stack[top--];

    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = stack[top];
            return x;
        }
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {

            System.out.print(stack[i] + ", ");
            System.out.println();

        }
    }

    public static void main(String[] args) {

        StackImplement stack = new StackImplement();

        Scanner sc = new Scanner(System.in);

        int choice, element;
        
            System.out.println("Stack operation");
            System.out.println("1:push an element ");
            System.out.println("2:Pop an element");
            System.out.println("3:Peek an element");
            System.out.println("4:Exit");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter element");
                    element = sc.nextInt();
                    stack.push(element);
                    break ;
                case 2:
                    System.out.println("Pop element");
                    int obj = stack.pop();
                    System.out.println("Popped  element : " + obj);
                    break;
                case 3:
                    System.out.println("peek element");
                    // stack.peek();
                    System.out.println(stack.peek());
                    break;
                default:
                    return;
            }
            System.out.println("stack contains: ");
            stack.printStack();
        
    }
}