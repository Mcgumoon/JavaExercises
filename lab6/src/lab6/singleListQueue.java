package lab6;

public class singleListQueue {
	//node class
	public static class Node<E>{
		//instance variables
		E data;
		Node<E> next;
		
		//constructor
		public Node(E data) {
			this.data = data;
			this.next = null;
		}
		
		//getters and setters
		public E getData() {
			return data;
		}
		
		public void setElement(E e) {
			this.data = e;
		}
		
		public Node<E> getNext(){
			return next;
		}
		
		public void setNext(Node<E> next) {
			this.next = next;
		}
		
		//display method
		public void displayNode() {
			System.out.println(data + " ");
		}
	}
	
	//queue class that implements Queue interface
	public static class listQueue<E> implements Queue<E>{
		//instance variable
		private Node<E> head;
		private Node<E> tail;
		private int size;
		
		//constructor
		public listQueue() {
			head = null;
			tail = null;
			size = 0;
		}
		
		//getters and setters
		public int getSize() {
			return size;
		}
		
		public E getFirst() {
			if(isEmpty()) {
				return null;
			}
			
			return head.getData();
		}
		
		public E getLast() {
			if(isEmpty()) {
				return null;
			}
			
			return tail.getData();
		}
		
		public Node<E> getHead(){
			return head;
		}
		
		public void setHead(Node<E> h) {
			this.head = h;
		}
		
		public Node<E> getTail(){
			return tail;
		}
		
		public void setTail(Node<E> t) {
			this.tail = t;
		}
		
		public boolean isEmpty() {
			return size == 0;
		}
		
		//methods
		public void addFirst(E e) {
			//Node<E> node = new Node<E>(e);
			Node<E> node = new Node<E>(e);
			if(isEmpty()) {
				head = node;
				tail = node;
			} else {
				node.setNext(head);
				head = node;
			}
			
			size++;
		}
		
		public void addLast(E e) {
			Node<E> node = new Node<E>(e);
			if(isEmpty()) {
				head = node;
				tail = node;
			} else {
				tail.setNext(node);
				tail = node;
			}
			
			size++;
		}
		
		public E removeFirst() {
			if(isEmpty()) {
				return null;
			}
			
			E removeEl = head.getData();
			head = head.getNext();
			size--;
			
			if(isEmpty()) {
				tail = null;
			}
			
			return removeEl;
		}
		
		public void display(){
			Node<E> current = head;
			while(current != null) {
				current.displayNode();
				current = current.getNext();
			}
			
			System.out.println();
		}
		
		//display method
		public Node<E> search(E key){
			Node<E> start = head;
			while(start != null) {
				if(start.getData().equals(key)) {
					return start;
				}
				start = start.getNext();
			}
			return null;
		}
		
		public Node<E> update(E key, E e){
			Node<E> updatedNode = search(key);
			if(updatedNode != null) {
				updatedNode.setElement(e);
			}
			return updatedNode;
		}
		
		@Override
		public void enqueue(E element) {
			addFirst(element);
		}
		
		@Override
		public E dequeue() {
			if(isEmpty()) {
				throw new IllegalStateException("Queue is empty");
			}
			return removeFirst();
		}
		
		@Override
		public E first() {
			if(isEmpty()) {
				throw new IllegalStateException("Queue is empty");
			}
			return getFirst();
		}
		
		@Override
		public int size() {
			return getSize();
		}
	}
	
	//test class
	public class TestSingleQueue{
		public static void main(String[] args) {
			//listQueue<Integer> queue = new listQueue<>();
			listQueue<Integer> queue = new listQueue<>();
			
			queue.enqueue(1);
			queue.enqueue(2);
			queue.enqueue(3);
			
			System.out.println("What is the size of the queue list?: " + queue.size());
			System.out.println("What is the queue list?: ");
			queue.display();
			System.out.println("What is the first element?: " + queue.first());
			System.out.println("\nDequeue element: " + queue.dequeue());
			System.out.println("\nDequeue element: " + queue.dequeue());
			System.out.println("\nWhat is the current size after dequeue? : " + queue.size());
			System.out.println("\nIs the queue list empty? " + queue.isEmpty());
			
		}
	}
	
}
