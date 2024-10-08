package lab6;

public interface Queue<E> {
	 void enqueue(E e);
	 E dequeue();
	 E first();
	 int size();
	 boolean isEmpty();
}
