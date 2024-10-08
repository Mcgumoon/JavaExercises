package assing2;

public class ConcatS {
	public static class Node<A>{
		private A data;
		private Node<A> next;
		
		public Node(A data) {
			this.data = data;
			this.next = null;
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
		
		public static <A> Node<A> concatenateList(Node<A> L, Node<A> M){
			if (L == null){
				return M;
			}
			
			Node<A> current = L;
			while(current.next != null) {
				current = current.next;
			}
			
			current.next = M;
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
	
	public static void main(String [] args) {
		Node<Integer> listL = new Node<>(749203);
		Node<Integer> listM = new Node<>(230849);
		
		Node<Integer> concatList = Node.concatenateList(listL, listM);
		System.out.println("The concatenated list is: ");
		concatList.display(concatList);
	}
}
