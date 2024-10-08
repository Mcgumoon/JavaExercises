package assignment3;

public class ArrayQueue {
	public static class arrayQueue implements Queue{
		private static final int CAPACITY = 5;
		private int[] array; 
		private int size;
		private int head;
		private int tail;
		
		public arrayQueue() {
			array = new int[CAPACITY];
			size = 0;
		}
		
		@Override
		public void enqueue(int element) {
			if(size == array.length) {
				throw new IllegalStateException("The queue is full");
			}
			tail = (tail + 1) % array.length;
			array[tail] = element;
			size++;
		}
		
		@Override
		public int dequeue() {
			if (isEmpty()) {
				throw new IllegalStateException("The queue is empty");
			}
			int removed = array[head];
			head = (head + 1) % CAPACITY;
			size--;
			return removed;
		}
		
		@Override
		public int first() {
			if(isEmpty()) {
				throw new IllegalStateException("The queue is empty");
			}
			return array[head];
		}
		
		@Override
		public boolean isEmpty() {
			return size == 0;
		}
		
		@Override
		public int size() {
			return size;
		}
	}
	
	public static void main(String[] args) {
		arrayQueue queue = new arrayQueue();
		
		for (int index = 0; index < 5; index ++) {
			queue.enqueue(index);
		}
		
		System.out.println("The removed element is: " + queue.dequeue());
		System.out.println("The front element is: " + queue.first());
		System.out.println("Is the queue empty?: " + queue.isEmpty());
		System.out.println("The size is: " + queue.size());
	}
}
