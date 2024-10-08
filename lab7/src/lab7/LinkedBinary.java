package lab7;

import java.util.Collection;

public interface LinkedBinary<E> extends Collection<E>{
	public boolean search(E e);
	public boolean insert(E e);
	public boolean delete(E e);
	public int size();
	public void inOrder();
	public void postOrder();
	public void preOrder();
	public boolean isEmpty();
	public void removeE(E e);
}
