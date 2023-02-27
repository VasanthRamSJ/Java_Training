package day3;
import java.util.*;
public class Ex3 {
	public static void main(String args[]) {
		 FixedStack fixed = new FixedStack(6);
	     DynamicStack dynamic = new DynamicStack(6);
	      int i;
	     for (i = 1; i <= 6; i++) {
	         fixed.push(i);
	     }
	     System.out.println("Elements in fixed stack:");
	     for (i = 0; i < 6; i++) {
	         System.out.print(" "+fixed.pop());
	     }

	     System.out.println();
	     
	     for ( i = 1; i <= 10; i++) {
	            dynamic.push(i);
	        }
	        System.out.println("Elements in dynamic stack:");
	        for (i = 0; i < 10; i++) {
	            System.out.print(" "+dynamic.pop());
	        }
	    }
	}
	


interface Stack {
    void push(int data);
    int pop();
}

class FixedStack implements Stack {
    int[] stack;
    int top = -1;
    int size;
    public FixedStack(int size) {
        this.size = size;
        stack = new int[size];
    }

    public void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = data;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top--];
        }
    }
}

class DynamicStack implements Stack {
	int[] stack;
    int top;

    public DynamicStack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == stack.length - 1) {
            int[] newStack = new int[stack.length * 2];
            for (int i = 0; i <= top; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[top--];
    }
	
}
	
	
