package lab7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.*;
import java.util.Stack;

public class LinkedBinarySearchTree{
	public static class Node<E>{
		private E element;
		private Node<E> parent;
		private Node<E> left;
		private Node<E> right;
		public Node<E> root;
		
		public Node(E element) {
			this.element = element;
			this.left = null;
			this.right = null;
			this.parent = null;
		}
		public Node(E element,Node<E> parent, Node<E> left, Node<E> right) {
			this.element = element;
			this.parent = parent;
			this.left = left;
			this.right = right;
		}
		
		public E getElement() {
			return element;
		}
		
		public void setElement(E element) {
			this.element = element;
		}
		
		public Node<E> getParent(){
			return parent;
		}
		
		public void setParent(Node<E> parent) {
			this.parent = parent;
		}
		
		public Node<E> getLeft(){
			return left;
		}
		
		public void setLeft(Node<E> left) {
			this.left = left;
		}
		
		public Node<E> getRight(){
			return right;
		}
		
		public void setRight(Node<E> right){
			this.right = right;
		}
		
		
	}
	
	public static class LinkedBST<E> implements LinkedBinary<E>{
			private Node<E> root;
			private int size;
			protected java.util.Comparator<E> com;
			
			public LinkedBST() {
				root = null;
				size = 0;
				this.com = (e1,e2) ->((Comparable<E>)e1).compareTo(e2);
			}
			
			public void setComparator(Comparator<E> comparator) {
				this.com = comparator;
			}
			
			public void display() {
				if(isEmpty()) {
					System.out.println("The tree is empty");
				} 
				System.out.println("Binary Search Tree");
				display(root, 0);
			}
			
			private void display(Node<E> node, int level) {
				if(node != null) {
					display(node.right, level + 1);
					for(int i =0; i < level; i++) {
						System.out.print("\t");
					}
					System.out.println(node.element);
					display(node.left, level + 1);
				}
			}
			
			public void printTreeGraph() {
				if(isEmpty()) {
					System.out.println("The tree is empty");
				}
				System.out.println("Binary Search Tree:");
				printTreeGraph(root, 0);
			}
			
			private void printTreeGraph(Node<E> node, int level) {
				if(node != null) {
					printTreeGraph(node.right, level + 1);
					for(int i= 0; i < level; i++) {
						System.out.print("	");
					}
					System.out.println(node.element);
					printTreeGraph(node.left, level + 1);
				}
			}

			@Override
			public int size() {
				return size;
			}
			
			@Override
			public boolean isEmpty() {
				return size == 0;
			}
			
			public Node<E> root(){
				if(isEmpty()) {
					throw new IllegalStateException("The Binary Tree is empty");
				}
				return root;
			}

			
			public Node<E> parent(Node<E> v){
				return  v.getParent();
			}
			
			
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
			
			
			public boolean isInternal(Node<E> v) {
				return numChildren(v) > 0;
			}
			
			
			public boolean isExternal(Node<E> v) {
				return numChildren(v) == 0;
			}
			
			
			public boolean isRoot(Node<E> v) {
				return v == root;
			}
			
			
			public Node<E> left(Node<E> v){
				return v.getLeft();
			}
			
			
			public Node<E> right(Node<E> v){
				return v.getRight();
			}
			
			
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
			
			
			public boolean hasLeft(Node<E> v) {
				return v.getLeft() != null;
			}
			
			
			public boolean hasRight(Node<E> v) {
				return v.getRight() != null;
			}
			
			
			public Node<E> addRoot(E e){
				if(!isEmpty()) {
					throw new IllegalStateException("Tree is not empty");
				}
				root = new Node<>(e, null, null, null);
				size = 1;
				return root;
			}
			
			
			public Node<E> addLeft(Node<E> v, E e){
				if(v.getLeft() != null) {
					throw new IllegalStateException("Node already has a left child");
				}
				Node<E> newLeft = new Node<>(e, v, null, null);
				v.setLeft(newLeft);
				size++;
				return newLeft;
			}
			
			
			public Node<E> addRight(Node<E> v, E e){
				if(v.getRight() != null) {
					throw new IllegalStateException("Node already has a right child");
				}
				Node<E> newRight = new Node<>(e, v, null, null);
				v.setRight(newRight);
				size++;
				return newRight;
			}
			
			
			public E set(Node<E> v, E e) {
				E old = v.getElement();
				v.setElement(e);
				return old;
			}
			
			
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
			
			public boolean search(E key) {
				Node<E> start = root;
				
				while(start != null) {
					if(com.compare(key, start.element) < 0) {
						start = start.left;
					} else if(com.compare(key, start.element) > 0) {
						start = start.right;
					} else {
						return true;
					}
				}
				return false;			
			}
			
			@Override
			public boolean insert(E e) {
				if(root == null) {
					root = new Node<>(e);
					size++;
					return true;
				} else {
					Node<E> parent = null;
					Node<E> current = root;
					
					while(current != null) {
						if(com.compare(e, current.element) < 0) {
							parent = current;
							current = current.left;
						} else if(com.compare(e, current.element) > 0) {
							parent = current;
							current = current.right;
						} else {
							return false;
						}
					}
					
					if (com.compare(e, parent.element) < 0) {
						parent.left = new Node<>(e);
					} else {
						parent.right = new Node<>(e);
					}
					
					size++;
					return true;
				}
			}
		

			@Override
			public boolean delete(E e) {
				Node<E> parent = null;
				Node<E> initial = root;
				
				while(initial != null) {
					if(com.compare(e, initial.element) < 0) {
						parent = initial;
						initial = initial.left;
					} else if(com.compare(e, initial.element) > 0) {
						parent = initial;
						initial = initial.right;
					} else {
						break;
					}
				}
				
				if(initial == null) {
					return false;
				}
				
				if(initial.left == null) {
					if(parent == null) {
						root = initial.right;
					} else if(com.compare(e, parent.element) < 0) {
						parent.left = initial.right;
					} else {
						parent.right = initial.right;
					}
				} else {
					Node<E> parentRight = initial;
					Node<E> elementRight = initial.left;
					
					while(elementRight.right != null) {
						parentRight = elementRight;
						elementRight = elementRight.right;
					}
					
					initial.element = elementRight.element;
					
					if(parentRight.right == elementRight) {
						parentRight.right = elementRight.left;
					} else {
						parentRight.left = elementRight.left;
					}
				}
				
				size--;
				return true;
				
			}
			
			public E minNode() {
				if(root == null) {
					return null;
				}
				
				Node<E> current = root;
				while(current.left != null) {
					current = current.left;
				}
				return current.element;
			}

			protected Node<E> createNewNode(E e){
				return new Node<>(e);
			}
			
			@Override
			public boolean contains(Object o) {
				return search((E) o);
			}

			@Override
			public Iterator<E> iterator() {
				return new InOrderIterator<>();
			}
			
			public Iterator<E> preIterator(){
				return new preOrderIterator<>();
			}
			
			public Iterator<E> postOrderIterator(){
				return new postOrderIterator<>();
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(Collection<? extends E> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean add(E e) {
				return insert(e);
			}

			@Override
			public void removeE(E e) {
				if(delete(e) != false) {
					delete(e);
					size--;
				} else {
					throw new IllegalStateException();
				}
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
	
			private class InOrderIterator<E> implements Iterator<E>{
				private Node<E> data;
				private Stack<Node<E>> stack;
				
				public InOrderIterator() {
					data = (Node<E>) root;
					stack = new Stack<>();
					pushLeftNode(data);
				}
				
				private void pushLeftNode(Node<E> node) {
					while(node != null) {
						stack.push(node);
						node = node.left;
					}
				}
				
				@Override
				public boolean hasNext() {
					return !stack.isEmpty();
				}
				
				@Override
				public E next() {
					if(!hasNext()) {
						throw new IllegalStateException();
					}
					Node<E> nextNode = stack.pop();
					pushLeftNode(nextNode.right);
					return nextNode.element;
				}
			}
			
			private class preOrderIterator<E> implements Iterator<E>{
				private Stack<Node<E>> stack;
				
				public preOrderIterator() {
					stack = new Stack<>();
					if(root != null) {
						stack.push((Node<E>) root);
					}
				}
				
				@Override
				public boolean hasNext() {
					return !stack.isEmpty();
				}
				
				@Override
				public E next() {
					if(!hasNext()) {
						throw new IllegalStateException();
					}
					
					Node<E> current = stack.pop();
					if(current.right != null) {
						stack.push(current.right);
					}
					
					if(current.left != null) {
						stack.push(current.left);
					}
					
					return current.element;
				}
			}
			
			private class postOrderIterator<E> implements Iterator<E>{
				private Stack<Node<E>> stack;
				private Node<E> data = (Node<E>) root;
				private Node<E> last;
				
				public postOrderIterator() {
					stack = new Stack<>();
					last = null;
					pushLeftNode(data);
				}
				
				private void pushLeftNode(Node<E> node) {
					while(node != null) {
						stack.push(node);
						node = node.left;
					}
				}
				
				@Override
				public boolean hasNext() {
					return !stack.isEmpty();
				}
				
				@Override
				public E next() {
					if(!hasNext()) {
						throw new IllegalStateException();
					}
					while(true) {
						Node<E> peekN = stack.peek();
						if(peekN.right != null && last != peekN.right) {
							pushLeftNode(peekN.right);
						} else {
							last = stack.pop();
							return last.element;
						}
					}
					
				}
			}
	}
	
	
}
