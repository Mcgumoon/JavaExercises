package assign5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PriorityQueue<E> implements java.util.Queue<E>{
	private Heapp<E> heap;
	
	public PriorityQueue() {
		heap = new Heapp<>();
	}
	
	public PriorityQueue(Comparator<E> comparator) {
		heap = new Heapp<>(comparator);
	}
	
	@Override
	public boolean offer(E e) {
		return heap.add(e);
	}
	
	@Override
	public boolean add(E e) {
		return heap.add(e);
	}
	
	@Override
	public E remove() {
		return heap.remove();
	}
	
	@Override
	public E poll() {
		return heap.isEmpty() ? null : heap.remove();
	}
	
	@Override
	public E element() {
		if(heap.isEmpty()) {
			throw new IllegalStateException("No such element");
		}
		return heap.list.get(0);
	}

	@Override
	public E peek() {
		return heap.isEmpty() ? null : heap.list.get(0);
	}
	
	@Override
	public int size() {
		return heap.getSize();
	}
	
	@Override
	public boolean isEmpty() {
		return heap.isEmpty();
	}
	
	@Override
	public boolean contains(Object e) {
		return heap.list.contains(e);
	}
	
	@Override
	public void clear() {
		heap.list.clear();
	}
	
	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		List<E> element = new ArrayList<>();
		while(!heap.isEmpty()) {
			element.add(heap.remove());
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int index = 0; index < element.size(); index++) {
			sb.append(element.get(index));
			if(index < element.size() - 1) {
				sb.append(", ");
			}
			heap.add(element.get(index));
		}
		
		sb.append("]");
		return sb.toString();
	}
	
	public static void main(String[] args) {
		java.util.Queue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(4);
		priorityQueue.add(1);
		priorityQueue.add(2);
		System.out.println("Priority Queue with natual ordering: " + priorityQueue.toString());
		
		java.util.Queue<Integer> custom = new PriorityQueue<>(java.util.Comparator.<Integer>reverseOrder());
		custom.add(4);
		custom.add(1);
		custom.add(2);
		System.out.println("Priority Queue with custom ordering: " + custom.toString());
	}
}
