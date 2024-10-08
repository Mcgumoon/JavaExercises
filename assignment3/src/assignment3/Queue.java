package assignment3;

public interface Queue {
	void enqueue(int e);
	boolean isEmpty();
	int size();
	int dequeue();
	int first();
}
