package lab6;

public class singleListStack {
	//node class
	public static class Node<E>{
		//instance variables
		private E element;
		private Node<E> next;
		
		//constructor
		public Node(E element) {
			this.element = element;
			this.next = null;
		}
		
		//getters and setters
		public E getElement() {
			return element;
		}
		
		public void setElement(E e) {
			this.element = e;
		}
		
		public Node<E> getNext(){
			return next;
		}
		
		public void setNext(Node<E> next) {
			this.next = next;
		}
		
		//method
		public void displayNode() {
			System.out.println(element + " ");
		}
	}

	//stack class that implements the Stack interface
	public static class linkedStack<E> implements Stack<E>{
		//instance variables
		private Node<E> head;
		private Node<E> tail;
		private int size;
		
		//constructor
		public linkedStack() {
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
			
			return head.getElement();
		}
		
		public E getLast() {
			if(isEmpty()) {
				return null;
			}
			
			return tail.getElement();
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
		
		//methods
		public boolean isEmpty() {
			return size == 0;
		}
		
		public void addFirst(E e) {
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
			
			E removeEl = head.getElement();
			head = head.getNext();
			size--;
			
			if(isEmpty()) {
				tail = null;
			}
			
			return removeEl;
		}
		
		
		//update and search methods
		public Node<E> search(E key){
			Node<E> start = head;
			while(start != null) {
				if(start.getElement().equals(key)) {
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
		
		//display method
		public void display(){
			Node<E> current = head;
			while(current != null) {
				current.displayNode();
				current = current.getNext();
			}
			
			System.out.println();
		}
		
		//methods from the interface for the Stack
		@Override
		public void push(E element) {
			addFirst(element);
		}
		
		@Override 
		public E pop() {
			if(isEmpty()) {
				throw new IllegalStateException("Stack is empty");
			}
			return removeFirst();
		}
		
		@Override
		public E top() {
			if(isEmpty()) {
				throw new IllegalStateException("Stack is empty");
			}
			return getFirst();
		}

		@Override
		public int size() {
			return getSize();
		}
	}
	
	
	//main method
	public static void main(String[] args) {
			linkedStack<Integer> list = new linkedStack<>();
			list.push(1);
			list.push(2);
			list.push(3);
			
			System.out.println("The Stack size is: " + list.size());
			System.out.println("The stack list is: ");
			list.display();
			System.out.println("The top element is: " + list.top());
			System.out.println("The popped element is: " + list.pop());
			System.out.println("The popped element is: " + list.pop());
			System.out.println("The stack size after popping is: " + list.size());
			System.out.println("Is the list empty?: " + list.isEmpty());
			
	}

}

