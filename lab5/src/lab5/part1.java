package lab5;

public class part1 {
	public static class Node<E>{
		private E element;
		private Node<E> next;
		
		public Node(E element) {
			this.element = element;
			this.next = null;
		}
		
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
		
		public void displayNode() {
			System.out.println(element + " ");
		}
	}
	
	public static class singleLinked<E>{
		private Node<E> head;
		private Node<E> tail;
		private int size;
		
		public singleLinked() {
			head = null;
			tail = null;
			size = 0;
		}
		
		public int getSize() {
			return size;
		}
		
		public boolean isEmpty() {
			return size == 0;
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
		
		public void display(){
			Node<E> current = head;
			while(current != null) {
				current.displayNode();
				current = current.getNext();
			}
			
			System.out.println();
		}
		
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
	}
	
	public static void main(String[] args) {
		singleLinked<Integer> test1 = new singleLinked<>();
		
		System.out.println("The list is empty? " + test1.isEmpty());
		System.out.println("What is the size of the list?: " + test1.getSize());
		
		test1.addFirst(20);
		test1.addLast(60);
		test1.addLast(70);
		System.out.println("\nIs the list empty?: " + test1.isEmpty());
		System.out.println("What is the size of the list?: " + test1.getSize());
		System.out.println("What is the first element of the list?: " + test1.getFirst());
		System.out.println("What is the last element of the list?: " + test1.getLast());
		
		System.out.println("\nWhat is the list?: ");
		test1.display();
		
		Node<Integer> searchResult = test1.search(60);
		System.out.println("Search Result is: " + searchResult.getElement());
		
		Node<Integer> updated = test1.update(60, 30);
		System.out.println("Updated node value is: " + updated.getElement());
		
		System.out.println("\nWhat is the updated list?: ");
		test1.display();
		
		test1.removeFirst();
		System.out.println("\nThe current list after removing an element is: ");
		test1.display();
	}
}
