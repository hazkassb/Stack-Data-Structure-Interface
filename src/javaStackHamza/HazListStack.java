package javaStackHamza;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/** Class HazListStack<E> implements the interface HazStack<E> as an adapter to the List.
   	@author HamzaBoubacar
   	@param <E> The type of elements in the stack.
 */
public class HazListStack<E> implements HazStack<E> {
//	The list containing the data
	private List<E> hazStack;
	
	private int size;
	
	
//	Construct an empty stack using an ArrayList as the container
	public HazListStack() {
		hazStack = new ArrayList<>();
	}
	
	
//	Adding: Push an object onto the stack
	@Override
	public E push(E obj) {
		hazStack.add(obj);
		size++;
		return obj;
	}
	
	
//	Removing: Popping the object off the stack
	@Override
	public E pop() {
		if(isEmpty())
			throw new NoSuchElementException();
		
		size--;
		return hazStack.remove(hazStack.size() - 1);
	}
	
	
//	Getting/Retrieving: Peeking the top object on the stack
	@Override
	public E peek() {
		if(isEmpty())
			throw new NoSuchElementException();
		
		return hazStack.get(hazStack.size() - 1);
	}
	
	
//	Size of the stack
	@Override
	public int size() {
		return hazStack.size();
	}
	
	
//	Check whether the stack is empty
	@Override
	public boolean isEmpty() {
		return hazStack.isEmpty();
	}


	@Override
	public String toString() {
		String result = "[" + hazStack.get(0);
		for(int i = 1; i < size; i++) {
			result += ", " + hazStack.get(i);
		}
		result += ")";
		
		return result;
	}	
	
	
}
