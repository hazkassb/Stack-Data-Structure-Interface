package javaStackHamza;

/** Specification of the Java Stack Interface using the ArrayList Class
--> LIFO : First In First Out 
--> A Stack is a Data Structure in which objects are inserted into and removed
	 from the same end (i.e., Last-In, First-Out).
	 @param <E>	The element type
*/
public interface HazStack<E> {
	/** Pushes an item onto the top of the stack and returns the item pushed.
	  	@param obj The object to be inserted
	  	@return The object inserted
	 */
	public E push(E obj);
	
	
	/** Returns the object at the top of the stack and removes it.
	   	@post The stack is one item smaller.
	   	@return The object at the top of the stack
	   	@throws NoSuchElementException if stack is empty
	 */
	public E pop();
	
	
	/** Returns the object at the top of the stack without removing it.
	    @post The stack remains unchanged
	    @return The object at the top of the stack
	    @throws NoSuchElementException if the stack is empty
	 */
	public E peek();
	
	
	/** Returns the number of objects in the stack
	 	@return The number of objects contains inside the stack
	 */
	public int size();
	
	
	/** Returns true if the stack is empty; otherwise, returns false
	 	@return true if the stack is empty; otherwise, return false
	 */
	public boolean isEmpty();
	
	
	/** Returns a string representation of the Stack
		@return The string representation of the stack
	 */
	public String toString();
	
	
	
	
}
