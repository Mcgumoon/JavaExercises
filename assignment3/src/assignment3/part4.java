package assignment3;

import java.util.Stack;

public class part4 {
	public static class queueStack{
		private Stack<Integer> stack1;
		private Stack<Integer> stack2;
		
		public queueStack() {
			stack1 = new Stack<>();
			stack2 = new Stack<>();
		}
		
		public void enqueue(int element) {
			stack1.push(element);
		}
		
		public int dequeue() {
			if(isEmpty()) {
				throw new IllegalStateException("The queue is empty");
			}
			
			if(stack2.isEmpty()) {
				while(!stack1.isEmpty()) {
					stack2.push(stack1.pop());
				}
			}
			
			return stack2.pop();
		}
		
		public int first() {
			if(isEmpty()) {
				throw new IllegalStateException("The queue is empty");
			}
			
			if(stack2.isEmpty()) {
				while(!stack1.isEmpty()) {
					stack2.push(stack1.pop());
				}
			}
			
			return stack2.peek();
		}
		
		public boolean isEmpty() {
			return stack1.isEmpty() && stack2.isEmpty();
 		}
		
		public int size() {
			return stack1.size() + stack2.size();
		}
	}
	
	public static void main(String[] args) {
		queueStack queue = new queueStack();
		
		queue.enqueue(0);
		queue.enqueue(1);
		queue.enqueue(2);
		
		System.out.println("First element is: " + queue.first());
		System.out.println("Removed element " + queue.dequeue());
		System.out.println("Is the queue empty?: " + queue.isEmpty());
		System.out.println("What is the size?: " + queue.size());
	}
}
