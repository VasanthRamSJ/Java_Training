package day3;
import java.util.*;
public class Ex3 {
	public static void main(String args[]) {
		 FixedStack fixed = new FixedStack(6);
	     DynamicStack dynamic = new DynamicStack();
	      int i;
	     for (i = 1; i <= 6; i++) {
	         fixed.push(i);
	     }
	     System.out.println("Elements in fixed stack:");
	     for (i = 0; i < 6; i++) {
	         System.out.print(" "+fixed.pop());
	     }

	     System.out.println();
	     
	   
	     dynamic.push(9);
	     dynamic.push(6);
	     dynamic.push(3);
	     dynamic.push(1);
			System.out.println();
	    
			for(i=0;i<dynamic.elements.size();i++) {
				System.out.print(dynamic.elements.get(i)+" ");
			}
		
			System.out.println("Peek Top Element:"+dynamic.peek());
			System.out.println("After peek:");
			System.out.println();
			for(i=0;i<dynamic.elements.size();i++) {
				System.out.print(dynamic.elements.get(i)+" ");
			}
			System.out.println();

			System.out.println("Pop Top Element:"+dynamic.pop());
			for(i=0;i<dynamic.elements.size();i++) {
				System.out.print(dynamic.elements.get(i)+" ");
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
	
	 ArrayList<Integer> elements = new ArrayList<>();
	public int peek() {
		if (elements.isEmpty()) {
			return 0;
		}
		return elements.get(elements.size() - 1);
	}
	
	public int pop() {
		if (elements.isEmpty()) {
			return 0;
		}
		int top = elements.get(elements.size() - 1);
		elements.remove(elements.size() - 1);
		return top;
	}
	public void push(int element) {
		elements.add(element);
	}
	
	
}