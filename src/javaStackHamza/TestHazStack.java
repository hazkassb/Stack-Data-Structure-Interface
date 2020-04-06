package javaStackHamza;

public class TestHazStack {

	public static void main(String[] args) {
		HazListStack<Integer> myStack = new HazListStack<>();
		
		myStack.push(12);
		myStack.push(19);
		myStack.push(32);
		myStack.push(8);
		myStack.push(10);
		myStack.push(4);
		myStack.push(11);
		myStack.push(3);
		myStack.push(51);

		System.out.println(myStack);
		System.out.println("Size is: " + myStack.size());
		System.out.println("Topmost item is: " + myStack.peek());
		System.out.println("Is my stack empty? " + myStack.isEmpty()+"\n");
		
		
		myStack.pop();
		myStack.pop();
		System.out.println(myStack);
		System.out.println("Size is: " + myStack.size());
		System.out.println("Topmost item is: " + myStack.peek());
		System.out.println("Is my stack empty? " + myStack.isEmpty()+"\n");
		
		
		myStack.pop();
		myStack.pop();
		myStack.pop();
		System.out.println(myStack);
		System.out.println("Size is: " + myStack.size());
		System.out.println("Topmost item is: " + myStack.peek());
		System.out.println("Is my stack empty? " + myStack.isEmpty()+"\n");
		
		
		myStack.pop();
		myStack.pop();
		myStack.pop();
		System.out.println(myStack);
		System.out.println("Size is: " + myStack.size());
		System.out.println("Topmost item is: " + myStack.peek());
		System.out.println("Is my stack empty? " + myStack.isEmpty()+"\n");
		
		myStack.pop();
		System.out.println("Is my stack empty? " + myStack.isEmpty()+"\n");			
		
	}

}
