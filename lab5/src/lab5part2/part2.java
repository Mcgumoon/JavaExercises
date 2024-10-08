package lab5part2;


class NODE<E>{	
	//instance variance
	private E element;
	private NODE<E> next;
	private NODE<E> previous;
	 
	//constructors
	public NODE(E element){
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
	
	public NODE<E> getNext() {
		return next;
	}
	
	public void setNext(NODE<E> next) {
		this.next = next;
	}
	
	public NODE<E> getPrevious() {
		return previous;
	}
	
	public void setPrevious(NODE<E> previous) {
		this.previous = previous;
	}
	
	public void display() {
		System.out.println(element + " ");
	}
}

class doubleLinked<E> {
	//instance variable
	private NODE<E> header;
	private NODE<E> trailer;
	private int dataSize;
	
	//constructor
	public doubleLinked() {
		header = new NODE<>(null);
		trailer = new NODE<>(null);
		header.setNext(trailer);
		trailer.setPrevious(header);
		dataSize = 0;
	}
	
	//method
	public int getDataSize() {
		return dataSize;
	}
	
	public boolean isEmpty() {
		return dataSize == 0;
	}
	
	public E first() {
		if(isEmpty()) {
			return null;
		}
		
		return header.getNext().getElement();
	}
	
	public E last() {
		if(isEmpty()) {
			return null;
		}
		
		return trailer.getPrevious().getElement();
	}
	
	public void addFirst(E e) {
		addBetween(e, header, header.getNext());
	}
	
	public void addLast(E e) {
		addBetween(e,trailer.getPrevious(), trailer);
	}
	
	public NODE<E> removeFirst() {
		if(isEmpty()) {
			return null;
		}
		return remove(header.getNext());
	}
	
	public NODE<E> removeLast() {
		if(isEmpty()) {
			return null;
		}
		return remove(trailer.getPrevious());
	}
	
	private void addBetween(E e, NODE<E> predecessor, NODE<E> successor) {
		NODE<E> newNode = new NODE<>(e);
		newNode.setPrevious(predecessor);
		newNode.setNext(successor);
		predecessor.setNext(newNode);
		successor.setPrevious(newNode);
		dataSize++;
	}
	
	public NODE<E> search(E key){
		NODE<E> current = header.getNext();
		while(current != trailer) {
			if(current.getElement().equals(key)) {
				return current;
			}
			current = current.getNext();
		}
		
		return null;
	}
	
	public NODE<E> update(E key, E e){
		NODE<E> updatedNode = search(key);
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
			
			NODE<E> start = header.getNext();
			
			while(start != trailer) {
				start.display();
				start = start.getNext();
			}
			
			System.out.println("The size of the list is: " + dataSize);
		}
	}
	
	public void addAfter(E e, E key) {
		NODE<E> insertNode = search(key);
		if(insertNode != null) {
			addBetween(e, insertNode, insertNode.getNext());
		}
	}
	
	public void addBefore(E e, E key) {
		NODE<E> insertNodeBefore = search(key);
		if(insertNodeBefore != null) {
			addBetween(e, insertNodeBefore.getPrevious(), insertNodeBefore);
		}
	}
	
	public NODE<E> removeAt(E key){
		NODE<E> removeNode = search(key);
		if(removeNode != null) {
			return remove(removeNode);
		}
		
		return null;
	}
	
	private NODE<E> remove(NODE<E> node) {
		NODE<E> predecessor = node.getPrevious();
		NODE<E> successor = node.getNext();
		
		predecessor.setNext(successor);
		successor.setPrevious(predecessor);
		dataSize--;
		
		return node;
	} 
}

public class part2 {
	public static void main(String[] args) {
		doubleLinked<Integer> test1 = new doubleLinked<>();
		
		System.out.println("The list is empty? " + test1.isEmpty());
		System.out.println("What is the size of the list?: " + test1.getDataSize());
		
		test1.addFirst(20);
		test1.addLast(60);
		test1.addAfter(30, 20);
		
		System.out.println("\nIs the list empty?: " + test1.isEmpty());
		System.out.println("What is the size of the list?: " + test1.getDataSize());
		System.out.println("What is the first element of the list?: " + test1.first());
		System.out.println("What is the last element of the list?: " + test1.last());
		System.out.println("\nWhat is the list?: ");
		test1.display();
		
		test1.removeAt(20);
		System.out.println("\nWhat is the updated list?: ");
		test1.display();
		
		
	}
}
