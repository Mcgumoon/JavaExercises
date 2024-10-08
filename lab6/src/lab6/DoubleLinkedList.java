package lab6;

public class DoubleLinkedList {
	//node class
	public static class Node<E>{
		//instance variables
		private E element;
		private Node<E> next;
		private Node<E> previous;
		 
		//constructors
		public Node(E element){
			//this.data = data;
			this.element = element;
			this.next = null;
			this.previous = null;
		}
		
		//methods
		
		public E getElement() {
			return element;
		}
		
		public void setElement(E e) {
			element = e;
		}
		
		public Node<E> getNext() {
			return next;
		}
		
		public void setNext(Node<E> next) {
			this.next = next;
		}
		
		public Node<E> getPrevious() {
			return previous;
		}
		
		public void setPrevious(Node<E> previous) {
			this.previous = previous;
		}
		
		public void display() {
			System.out.println(element + " ");
		}
	}
	
	//linked deque class that implements the Deque interface
	public static class LinkedDeque<E> implements Deque<E>{
		//instance variables
		private Node<E> header;
		private Node<E> trailer;
		private int size;
		
		//constructor
		public LinkedDeque() {
			header = new Node<>(null);
			trailer = new Node<>(null);
			header.setNext(trailer);
			trailer.setPrevious(header);
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
			
			return header.getNext().getElement();
		}
		
		public E getLast() {
			if(isEmpty()) {
				return null;
			}
			
			return trailer.getPrevious().getElement();
		}
		
		//methods
		public boolean isEmpty() {
			return size == 0;
		}
		
		public void addFirst(E e) {
			addBetween(e, header, header.getNext());
		}
		
		public void addLast(E e) {
			addBetween(e,trailer.getPrevious(), trailer);
		}
		
		
		public Node<E> removeFirst() {
			if(isEmpty()) {
				return null;
			}
			return remove(header.getNext());
		}
		
		public Node<E> removeLast() {
			if(isEmpty()) {
				return null;
			}
			return remove(trailer.getPrevious());
		}
		
		private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
			Node<E> newNode = new Node<>(e);
			newNode.setPrevious(predecessor);
			newNode.setNext(successor);
			predecessor.setNext(newNode);
			successor.setPrevious(newNode);
			size++;
		}
		
		public Node<E> search(E key){
			Node<E> current = header.getNext();
			while(current != trailer) {
				if(current.getElement().equals(key)) {
					return current;
				}
				current = current.getNext();
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
		
		public void display() {
			if(isEmpty()) {
				System.out.println("The list is empty");
			} else {
				System.out.println("Traversing the list: ");
				
				Node<E> start = header.getNext();
				
				while(start != trailer) {
					start.display();
					start = start.getNext();
				}
				
				System.out.println("The size of the list is: " + size);
			}
		}
		
		public void addAfter(E e, E key) {
			Node<E> insertNode = search(key);
			if(insertNode != null) {
				addBetween(e, insertNode, insertNode.getNext());
			}
		}
		
		public void addBefore(E e, E key) {
			Node<E> insertNodeBefore = search(key);
			if(insertNodeBefore != null) {
				addBetween(e, insertNodeBefore.getPrevious(), insertNodeBefore);
			}
		}
		
		private Node<E> remove(Node<E> node) {
			Node<E> predecessor = node.getPrevious();
			Node<E> successor = node.getNext();
			
			predecessor.setNext(successor);
			successor.setPrevious(predecessor);
			size--;
			
			return node;
		}
		
		@Override
		public E first(){
			return getFirst();
		}
		
		@Override
		public E last() {
			return getLast();
		}
		
		@Override
		public int size() {
			return getSize();
		}
		
		@Override
		public void offerFirst(E element) {
			addFirst(element);
		}
		
		@Override
		public void offerLast(E element) {
			addLast(element);
		}
		
		@Override
		public E pollFirst() {
			Node<E> removedNode = removeFirst();
			return removedNode != null ? removedNode.getElement() : null;
		}
		
		@Override
		public E pollLast() {
			Node<E> removedNode = removeLast();
			return removedNode != null ? removedNode.getElement() : null;
		}

		@Override
		public void offerFirst() {
			// TODO Auto-generated method stub
			
		}

		
	}
	
	//test class
	public static class Test{
		public static void main(String[] args) {
			LinkedDeque<Integer> deque = new LinkedDeque<>();
			
			System.out.println("Is the deque empty? " + deque.isEmpty());
			deque.offerFirst(1);
			deque.offerLast(2);
			deque.offerFirst(3);
			
			System.out.println("\nThe deque size list is: " + deque.size());
			System.out.println("\nThe deque list is: ");
			deque.display();
			
			System.out.println("\nThe deque first element is: " + deque.first());
			System.out.println("\nThe deque last element is: " + deque.last());
			
			System.out.println("\nRemove first deque: " + deque.pollFirst());
			System.out.println("\nRemove last deque: " + deque.pollLast());
			
			System.out.println("\nDeque size after removal: " + deque.size());
			
		}
	}
}
