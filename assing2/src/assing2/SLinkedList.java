package assing2;

public class SLinkedList {
	public static class Node<A,B,C>{
		private A stuID;
		private B stuName;
		private C stuScore;
		private Node<A,B,C> next;
		
		public Node(A stuID, B stuName, C stuScore) {
			this.stuID = stuID;
			this.stuName = stuName;
			this.stuScore = stuScore;
			this.next = null;
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
		
		public Node<A,B,C> getNext() {
			return next;
		}
		
		public void setNext(Node<A,B,C> next) {
			this.next = next;
		}
		
		public void displayNode() {
			System.out.println("ID: " + stuID + "\nName: " + stuName + "\nScore: " + stuScore);
		}
	}
	
	public static class sLinkedList<A,B,C>{
		private Node<A,B,C> head;
		private Node<A,B,C> tail;
		private int size;
		
		public sLinkedList() {
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
		
		public A getFirstStuID() {
			if(isEmpty()) {
				return null;
			}
			return head.getStuID();
		}
		
		public A getLastStuID() {
			if(isEmpty()) {
				return null;
			}
			return tail.getStuID();
		}
		
		public B getFirstStuName() {
			if(isEmpty()) {
				return null;
			}
			return head.getStuName();
		}
		
		public B getLastStuName() {
			if(isEmpty()) {
				return null;
			}
			return tail.getStuName();
		}
		
		public C getFirstStuScore() {
			if(isEmpty()) {
				return null;
			}
			return head.getStuScore();
		}
		
		public C getLastStuScore() {
			if(isEmpty()) {
				return null;
			}
			return tail.getStuScore();
		}
		
		public Node<A,B,C> getHead(){
			return head;
		}
		
		public void setHead(Node<A,B,C> h) {
			this.head = h;
		}
		
		public Node<A,B,C> getTail(){
			return tail;
		}
		
		public void setTail(Node<A,B,C> t) {
			this.tail = t;
		}
		
		public void addFirst(A id, B name, C score) {
			Node<A,B,C> node = new Node<A,B,C>(id,name,score);
			if(isEmpty()) {
				head = node;
				tail = node;
			} else {
				node.setNext(head);
				head = node;
			}
			
			size++;
		}
		
		public void addLast(A id, B name, C score) {
			Node<A,B,C> node = new Node<A,B,C>(id,name,score);
			if(isEmpty()) {
				head = node;
				tail = node;
			} else {
				tail.setNext(node);
				tail = node;
			}
			size++;
		}
		
		public A removeFirst() {
			if(isEmpty()) {
				return null;
			}
			A removedID = head.stuID;
			head = head.getNext();
			size--;
			
			if(isEmpty()) {
				tail = null;
			}
			return removedID;
		}
		
		public void display() {
			Node<A,B,C> node = head;
			while(node != null) {
				node.displayNode();
				node = node.getNext();
				System.out.println();
			}
			
		}
		
		public Node<A,B,C> search(A id){
			Node<A,B,C> start = head;
			while(start != null) {
				if(start.stuID.equals(id)) {
					return start;
				}
				start = start.getNext();
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
		
		public A removeAt(A id) {
			if(isEmpty()) {
				return null;
			}
			
			if(head.getStuID().equals(id)) {
				A removedID = head.getStuID();
				head = head.getNext();
				size--;
				
				if(isEmpty()) {
					tail = null;
				}
				
				return removedID;
			}
			return null;
		}
	}
	
	public static class TestSLinked{
		public static void main(String[] args) {
			sLinkedList<Integer, String, Double> list = new sLinkedList<>();
			
			list.addFirst(3654928, "Ash Martinez", 80.5);
			list.addLast(2923942, "Brayan Martinez", 80.6);
			list.addLast(4092710, "Copito Martinez", 90.6);
			System.out.print("The list after adding the elements is: ");
			list.display();
			System.out.println("What is the size of the list? " + list.getSize());
			
			int searchID = 3654928;
			Node<Integer, String, Double> found = list.search(searchID);
			if(found != null) {
				System.out.println("The student with id: " + searchID + " was found! Here is their information: ");
				found.displayNode();
			} else if(found == null) {
				System.out.println("The student can not be found.");
			}
			
			list.removeAt(3654928);
			System.out.println("\nThe updated list is: ");
			list.display();
			System.out.println("What is the size of the list? " + list.getSize());
			
			list.removeFirst();
			System.out.println("\nThe updated list is: ");
			list.display();
			
			
			searchID = 4092710;
			list.update(searchID, 4092710, "Copito Martinez", 70.0);
			System.out.println("What is the size of the list? " + list.getSize());
			
			System.out.println("The updated information of the student is: ");
			list.display();
		}
	}
}
