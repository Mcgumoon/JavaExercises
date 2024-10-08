package lab6;

public interface Deque<E> {
	E first();
	E last();
	int size();
	void offerFirst(E element);
	void offerLast(E element);
	E pollFirst();
	E pollLast();
	boolean isEmpty();
	void offerFirst();
}
