package lab7;

import java.util.Objects;

interface Binary<E>{
	int size();
    boolean isEmpty();
    Node<E> root();
    Node<E> parent(Node<E> v);
    int numChildren(Node<E> v);
    boolean isInternal(Node<E> v);
    boolean isExternal(Node<E> v);
    boolean isRoot(Node<E> v);
    Node<E> left(Node<E> v);
    Node<E> right(Node<E> v);
    Node<E> sibling(Node<E> v);
    boolean hasLeft(Node<E> v);
    boolean hasRight(Node<E> v);
    Node<E> addRoot(E e);
    Node<E> addLeft(Node<E> v, E e);
    Node<E> addRight(Node<E> v, E e);
    E set(Node<E> v, E e);
    E remove(Node<E> v);
    void preOrder(Node<E> root);
    void postOrder(Node<E> root);
    void inOrder(Node<E> root);
    Node<E> search(Node<E> root, E key);
}

class Node<T>{
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

public class BinaryTree {
	public class LinkedBinaryTree<E> implements Binary<E>{
		private Node<E> root;
		private int size;
		
		public LinkedBinaryTree() {
			root = null;
			size = 0;
		}
		
		public int size() {
			return size;
		}
		
		@Override
		public boolean isEmpty() {
			return size == 0;
		}
		
		@Override
		public Node<E> root(){
			if(isEmpty()) {
				throw new IllegalStateException("The Binary Tree is empty");
			}
			return root;
		}

		@Override
		public Node<E> parent(Node<E> v){
			return  v.getParent();
		}
		
		@Override
		public int numChildren(Node<E> v) {
			int count = 0;
			
			if(v.getLeft() != null) {
				count++;
			}
			
			if(v.getRight() != null) {
				count++;
			}
			return count;
		}
		
		@Override
		public boolean isInternal(Node<E> v) {
			return numChildren(v) > 0;
		}
		
		@Override
		public boolean isExternal(Node<E> v) {
			return numChildren(v) == 0;
		}
		
		@Override
		public boolean isRoot(Node<E> v) {
			return v == root;
		}
		
		@Override
		public Node<E> left(Node<E> v){
			return v.getLeft();
		}
		
		@Override
		public Node<E> right(Node<E> v){
			return v.getRight();
		}
		
		@Override
		public Node<E> sibling(Node<E> v){
			Node<E> parent = parent(v);
			if(parent == null) {
				return null;
			}
			
			if(v == left(parent)) {
				return right(parent);
			} else {
				return left(parent);
			}
		}
		
		@Override
		public boolean hasLeft(Node<E> v) {
			return v.getLeft() != null;
		}
		
		@Override
		public boolean hasRight(Node<E> v) {
			return v.getRight() != null;
		}
		
		@Override
		public Node<E> addRoot(E e){
			if(!isEmpty()) {
				throw new IllegalStateException("Tree is not empty");
			}
			root = new Node<>(e, null, null, null);
			size = 1;
			return root;
		}
		
		@Override
		public Node<E> addLeft(Node<E> v, E e){
			if(v.getLeft() != null) {
				throw new IllegalStateException("Node already has a left child");
			}
			Node<E> newLeft = new Node<>(e, v, null, null);
			v.setLeft(newLeft);
			size++;
			return newLeft;
		}
		
		@Override
		public Node<E> addRight(Node<E> v, E e){
			if(v.getRight() != null) {
				throw new IllegalStateException("Node already has a right child");
			}
			Node<E> newRight = new Node<>(e, v, null, null);
			v.setRight(newRight);
			size++;
			return newRight;
		}
		
		@Override
		public E set(Node<E> v, E e) {
			E old = v.getElement();
			v.setElement(e);
			return old;
		}
		
		@Override
		public E remove(Node<E> v) {
			Node<E> parent = parent(v);
			if(numChildren(v) == 2) {
				throw new IllegalArgumentException("Node has two children");
			}
			Node<E> child = (parent.getLeft() != null ? parent.getLeft() : parent.getRight());
			if(child != null) {
				child.setParent(parent);
			}
			if(v == root) {
				root = child;
			} else {
				if(v == left(parent)) {
					parent.setLeft(child);
				} else {
					parent.setRight(child);
				}
			}
			
			size--;
			E old = v.getElement();
			v.setElement(null);
			v.setLeft(null);
			v.setRight(null);
			v.setParent(null);
			return old;
		}
		
		public void preOrder() {
			preOrder(root);
		}
		
		
		public void preOrder(Node<E> n) {
			if(n != null) {
				System.out.print(n.getElement() + " ");
				preOrder(n.getLeft());
				preOrder(n.getRight());
			}
		}
		
		public void postOrder() {
			postOrder(root);
		}
		
		public void postOrder(Node<E> n) {
			if(n != null) {
				postOrder(n.getLeft());
				postOrder(n.getRight());
				System.out.print(n.getElement() + " ");
			}
		}
		
		public void inOrder(Node<E> n) {
			if(n != null) {
				inOrder(n.getLeft());
				System.out.print(n.getElement() + " ");
				inOrder(n.getRight());
			}
		}
		
		public void inOrder() {
			inOrder(root);
		}

		@Override
		public Node<E> search(Node<E> root, E key) {
			if(root == null || Objects.equals(root.getElement(), key)) {
				return root;
			}
			Node<E> leftAns = search(root.getLeft(), key);
			if(leftAns != null) {
				return leftAns;
			}
			return search(root.getRight(), key);
		}
	}
	
}
