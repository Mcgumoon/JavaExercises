package lab7;
//reusing and extending from lab 7 to lab 8 binary search tree


public class BST<E> implements Binary<E>{
	public class Node<T>{
		private T element;
		private Node<T> parent;
		private Node<T> left;
		private Node<T> right;
		
		public Node(T element,Node<T> parent, Node<T> left, Node<T> right) {
			this.element = element;
			this.parent = parent;
			this.left = left;
			this.right = right;
		}
		
		public T getElement() {
			return element;
		}
		
		public void setElement(T element) {
			this.element = element;
		}
		
		public Node<T> getParent(){
			return parent;
		}
		
		public void setParent(Node<T> parent) {
			this.parent = parent;
		}
		
		public Node<T> getLeft(){
			return left;
		}
		
		public void setLeft(Node<T> left) {
			this.left = left;
		}
		
		public Node<T> getRight(){
			return right;
		}
		
		public void setRight(Node<T> right) {
			this.right = right;
		}
	
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public lab7.Node<E> root() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public lab7.Node<E> parent(lab7.Node<E> v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int numChildren(lab7.Node<E> v) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isInternal(lab7.Node<E> v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isExternal(lab7.Node<E> v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRoot(lab7.Node<E> v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public lab7.Node<E> left(lab7.Node<E> v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public lab7.Node<E> right(lab7.Node<E> v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public lab7.Node<E> sibling(lab7.Node<E> v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasLeft(lab7.Node<E> v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasRight(lab7.Node<E> v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public lab7.Node<E> addRoot(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public lab7.Node<E> addLeft(lab7.Node<E> v, E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public lab7.Node<E> addRight(lab7.Node<E> v, E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(lab7.Node<E> v, E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(lab7.Node<E> v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void preOrder(lab7.Node<E> root) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postOrder(lab7.Node<E> root) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inOrder(lab7.Node<E> root) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public lab7.Node<E> search(lab7.Node<E> root, E key) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
