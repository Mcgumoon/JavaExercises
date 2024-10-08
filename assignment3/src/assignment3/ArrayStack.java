package assignment3;

import java.util.Arrays;

public class ArrayStack {
	public static class arrayStack implements Stack{
		private static final int INITIAL = 5;
		private int[] array;
		private int size;
		
		public arrayStack() {
			array = new int[INITIAL];
			size = 0;
		}
		
		@Override
		public void push(int e) {
			unlimitedCapacity();
			array[size++] = e;
		}
		
		@Override
		public int pop() {
			if(isEmpty()) {
				throw new IllegalStateException("The stack is empty");
			}
			return array[--size];
		}
		
		@Override
		public int top() {
			if(isEmpty()) {
				throw new IllegalStateException("The stack is empty");
			}
			return array[size-1];
		}
		
		@Override
		public boolean isEmpty() {
			return size == 0;
		}
		
		public void unlimitedCapacity() {
			if(size == array.length) {
				int newCapacity = array.length * 2;
				array = Arrays.copyOf(array, newCapacity);
			}
		}

		@Override
		public int size() {
			return size;
		}
	}
	
	//
	public static void main(String[] args) {
		arrayStack array = new arrayStack();
		
		for(int index = 1; index <= 6; index++) {
			array.push(index);
		}
			
		System.out.println("The popped element: " + array.pop());
		
		System.out.println("The top element: " + array.top());
			
		System.out.println("Is the array empty?: " + array.isEmpty());
		
		System.out.println("The size of the array is: " + array.size());
	}
	//
}
