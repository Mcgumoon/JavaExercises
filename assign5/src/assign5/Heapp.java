package assign5;

import java.util.Comparator;

public class Heapp<E> {
	  java.util.ArrayList<E> list = new java.util.ArrayList<>();
	  private java.util.Comparator<? super E> c;
	  
	  /** Create a default heap using a natural order for comparison */
	  public Heapp() {
	    this.c = (e1, e2) -> ((Comparable<E>)e2).compareTo(e1);
	  }

	  /** Create a heap with a specified comparator */
	  public Heapp(java.util.Comparator<E> c) {
	    this.c = c;
	  }
	  
	  /** Create a heap from an array of objects */
	  public Heapp(E[] objects) {
	    this.c = (e1, e2) -> ((Comparable<E>)e2).compareTo(e1);
	    for (int i = 0; i < objects.length; i++)
	      add(objects[i]);
	  }
	  
	  public static <E> void heapSort(E[] array, Comparator<E> c) {
		  Heapp<E> heap = new Heapp<E>(c);
		  for(E element : array) {
			  heap.add(element);
		  }
		  
		  for(int index = array.length - 1; index >= 0; index--) {
			  array[index] = heap.remove();
		  }
	  }

	  /** Add a new object into the heap 
	 * @return */
	  public boolean add(E newObject) {
	    list.add(newObject); // Append to the heap
	    int currentIndex = list.size() - 1; // The index of the last node

	    while (currentIndex > 0) {
	      int parentIndex = (currentIndex - 1) / 2;
	      // Swap if the current object is greater than its parent
	      if (c.compare(list.get(currentIndex), list.get(parentIndex)) > 0) {
	        E temp = list.get(currentIndex);
	        list.set(currentIndex, list.get(parentIndex));
	        list.set(parentIndex, temp);
	      }
	      else
	        break; // the tree is a heap now

	      currentIndex = parentIndex;
	    }
		return true;
	  }

	  /** Remove the root from the heap */
	  public E remove() {
	    if (list.size() == 0) { 
	    	return null;
	    }

	    E removedObject = list.get(0);
	    list.set(0, list.get(list.size() - 1));
	    list.remove(list.size() - 1);

	    int currentIndex = 0;
	    while (currentIndex < list.size()) {
	      int leftChildIndex = 2 * currentIndex + 1;
	      int rightChildIndex = 2 * currentIndex + 2;

	      // Find the maximum between two children
	      if (leftChildIndex >= list.size()) {
	    	  break; // The tree is a heap
	      }
	      int maxIndex = leftChildIndex;
	      if (rightChildIndex < list.size()) {
	        if (c.compare(list.get(maxIndex), list.get(rightChildIndex)) < 0) {
	          maxIndex = rightChildIndex;
	        }
	      }

	      // Swap if the current node is less than the maximum
	      if (c.compare(list.get(currentIndex), list.get(maxIndex)) < 0) {
	        E temp = list.get(maxIndex);
	        list.set(maxIndex, list.get(currentIndex));
	        list.set(currentIndex, temp);
	        currentIndex = maxIndex;
	      }
	      else
	        break; // The tree is a heap
	    }

	    return removedObject;
	  }

	  /** Get the number of nodes in the tree */
	  public int getSize() {
	    return list.size();
	  }
	  
	  /** Return true if heap is empty */
	  public boolean isEmpty() {
	    return list.size() == 0;
	  }
	  
	  public static void main(String[] args) {
			 Integer[] array1 = {40, 10, 20, 5, 2, 15};
			 System.out.println("The original array is: " + java.util.Arrays.toString(array1));
			 heapSort(array1, java.util.Comparator.reverseOrder());
			 System.out.println("\nThe sorted array is: " + java.util.Arrays.toString(array1));
			 
			 String[] array2 = {"book", "dictionary", "chair", "classroom"};
			 System.out.println("\nThe original array is: " + java.util.Arrays.toString(array2));
			 heapSort(array2, java.util.Comparator.reverseOrder());
			 System.out.println("\nThe sorted array is: " + java.util.Arrays.toString(array2));
		}
}

