package assing2;

public class concatD {
	public static class Node<A>{
		private A data;
		private Node<A> next;
		private Node<A> prev;
		
		public Node(A data) {
			this.data = data;
			next = null;
			prev = null;
		}
		
		public A getData() {
			return data;
		}
		
		public void setData(A data) {
			this.data = data;
		}
		
		public Node<A> getNext(){
			return next;
		}
		
		public void setNext(Node<A> next) {
			this.next = next;
		}
		
		public Node<A> getPrev(){
			return prev;
		}
		
		public void setPrev(Node<A> prev) {
			this.prev = prev;
		}
		
		public static <A> Node<A> concatenatedList(Node<A> L, Node<A> M){
			if(L == null) {
				return M;
			}
			
			if(M != null) {
				Node<A> tailL = L;
				while(tailL.next != null) {
					tailL = tailL.next;
				}
				
				tailL.next = M;
				M.setPrev(tailL);
			}
			return L;
		}
		
		public void display(Node<A> head) {
			Node<A> current = head;
			while(current != null) {
				System.out.println(current.data + " ");
				current = current.getNext();
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> listL = new Node<>(475398);
		Node<Integer> listM = new Node<>(123489);
		
		Node<Integer> concatList = Node.concatenatedList(listL, listM);
		System.out.println("The concatenated list is: ");
		concatList.display(concatList);
	}
}
