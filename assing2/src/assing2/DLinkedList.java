package assing2;

public class DLinkedList {
	public static class Node<A,B,C>{
		private A stuID; 
		private B stuName;
		private C stuScore;
		private Node<A,B,C> next;
		private Node<A,B,C> previous;
		
		public Node(A stuID, B stuName, C stuScore) {
			this.stuID = stuID;
			this.stuName = stuName;
			this.stuScore = stuScore;
			this.next = null;
			this.previous = null;
		}
		
		public A getStuID() {
			return stuID;
		}
		
		public void setStuID(A stuID) {
			this.stuID = stuID;
		}
		
		public B getStuName() {
			return stuName;
		}
		
		public void setStuName(B stuName) {
			this.stuName = stuName;
		}
		
		public C getStuScore() {
			return stuScore;
		}
		
		public void setStuScore(C stuScore) {
			this.stuScore = stuScore;
		}
		
		public Node<A,B,C> getNext(){
			return next;
		}
		
		public void setNext(Node<A,B,C> n) {
			this.next = n;
		}
		
		public Node<A,B,C> getPrevious(){
			return previous;
		}
		
		public void setPrevious(Node<A,B,C> prev) {
			this.previous = prev;
		}
		
		public void displayNode() {
			System.out.println("ID: " + stuID + ", Name: " + stuName + ", Score: " + stuScore);
		}
	}
	
	public static class DLinked<A,B,C>{
		private Node<A,B,C> header;
		private Node<A,B,C> trailer;
		private int size;
		
		public DLinked() {
			header = new Node<>(null, null, null);
			trailer = new Node<>(null,null, null);
			header.setNext(trailer);
			trailer.setPrevious(header);
			this.size = 0;
		}
		
		public int getSize() {
			return size;
		}
		
		public boolean isEmpty() {
			return size == 0;
		}
		
		public A getFirstStuID() {
			if(isEmpty()) {
				return null;
			}
			
			return header.getNext().getStuID();
		}
		
		public A getLastStuID() {
			if(isEmpty()) {
				return null;
			}
			return trailer.getPrevious().getStuID();
		}
		
		public B getFirstStuName() {
			if(isEmpty()) {
				return null;
			}
			return header.getNext().getStuName();
		}
		
		public B getLastStuName() {
			if(isEmpty()) {
				return null;
			}
			return trailer.getPrevious().getStuName();
		}
		
		public C getFirstStuScore() {
			if(isEmpty()) {
				return null;
			}
			return header.getNext().getStuScore();
		}
		
		public C getLastStuScore() {
			if(isEmpty()) {
				return null;
			}
			return trailer.getPrevious().getStuScore();
		}
		
		public void addBetween(A id, B name, C score, Node<A,B,C> predecessor, Node<A,B,C> successor) {
			Node<A,B,C> newNode = new Node<>(id, name, score);
			newNode.setPrevious(predecessor);
			newNode.setNext(successor);
			predecessor.setNext(newNode);
			successor.setPrevious(newNode);
			size++;
		}
		
		public void addFirst(A id, B name, C score) {
			addBetween(id, name, score, header, header.getNext());
		}
		
		public void addLast(A id, B name, C score) {
			addBetween(id, name, score, trailer.getPrevious(), trailer);
		}
		
		public void addAfter(A key, A id, B name, C score) {
			Node<A,B,C> insertKey = search(key);
			if(insertKey != null) {
				addBetween(id, name, score, insertKey, insertKey.getNext());
			}
		}
		
		public void addBefore(A key, A id, B name, C score) {
			Node<A,B,C> insertKey = search(key);
			if(insertKey != null) {
				addBetween(id, name, score, insertKey.getPrevious(), insertKey);
			}
		}
		
		public Node<A,B,C> remove(Node<A,B,C> node){
			Node<A,B,C> predecessor = node.getPrevious();
			Node<A,B,C> successor = node.getNext();
			
			predecessor.setNext(successor);
			successor.setPrevious(predecessor);
			size--;
			
			return node;
		}
		
		public Node<A,B,C> removeAt(A key){
			Node<A,B,C> start = search(key);
			if(start != null) {
				return remove(start);
			}
			return null;
		}
		
		public Node<A,B,C> removeFirst(){
			if(isEmpty()) {
				return null;
			}
			return remove(header.getNext());
		}
		
		public Node<A,B,C> removeLast(){
			if(isEmpty()) {
				return null;
			}
			return remove(trailer.getPrevious());
		}
		
		public void display() {
			if(isEmpty()) {
				System.out.println("The list is empty");
			} else {
				System.out.println("Tranversing the list: ");
				
				Node<A,B,C> start = header.getNext();
				while(start != trailer) {
					start.displayNode();
					start = start.getNext();
				}
				System.out.println("The size of the list is: " + size);
			}
		}
		
		public Node<A,B,C> search(A key){
			Node<A,B,C> current = header.getNext();
			while(current != trailer) {
				if(current.getStuID().equals(key)) {
					return current;
				}
				current = current.getNext();
			}
			return null;
		}
		
		public Node<A,B,C> update(A key, A id, B name, C score){
			Node<A,B,C> updated = search(key);
			if(updated != null) {
				updated.setStuID(id);
				updated.setStuName(name);
				updated.setStuScore(score);
			}
			return updated;
		}
	}
	
	public static void main(String[] args) {
		DLinked<Integer, String, Double> list = new DLinked<>();
		System.out.println("Is the list empty?");
		list.display();
		
		list.addFirst(568209, "Brayan Martinez", 90.7);
		list.addLast(183928, "Max. Martinez", 80.9);
		System.out.println("\nIs the list empty?");
		list.display();
		
		list.addAfter(568209, 349403, "Copito Marti.", 85.5);
		System.out.println("\nWhat is the list now?: ");
		list.display();
		
		list.addBefore(183928, 372910, "Ashley Marti.", 70.3);
		System.out.println("\nWhat is the list now?: ");
		list.display();
		
		Node<Integer, String, Double> remove = list.removeAt(183928);
		System.out.println("\nThe removed node:");
		if(remove != null) {
			remove.displayNode();
		} else {
			System.out.println("Node can not be found");
		}
		
		System.out.println("\nWhat is the list now?: ");
		list.display();
		
		Node<Integer, String, Double> removeL = list.removeLast();
		if(removeL != null) {
			System.out.println();
			removeL.displayNode();
		} else {
			System.out.println("Node can not be found");
		}
		
		System.out.println("\nWhat is the list now?: ");
		list.display();
		
		Node<Integer, String, Double> found = list.search(568209);
		if(found != null) {
			System.out.println();
			found.displayNode();
		} else {
			System.out.println("Node can not be found");
		}
		
		System.out.println("\nWhat is the list now?: ");
		list.display();
		
		System.out.println();
		list.update(568209, 56820, "Brayan Marti.", 100.0);
		System.out.println("\nWhat is the updated list?: ");
		list.display();
	}

	
}
