package assignment6;

import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map.Entry;

public class HashMap <A, B>{
	private static final int CAPACITY = 20;
	private static final double LOAD_FACTOR = 0.75;
	
	Entry<A, B>[] table;
	private int size;
	private double loadFactor;
	
	public HashMap() {
		this(CAPACITY, LOAD_FACTOR);
	}
	
	public HashMap(int initialCap, double loadFactor) {
		table = new Entry[initialCap];
		this.loadFactor = loadFactor;
		size = 0;
	}
	
	public void put(A key, B value) {
		if(key == null) {
			return;
		}
		
		int index = hash(key) % table.length;
		
		if(table[index] == null) {
			table[index] = new Entry<>(key, value);
			size++;
		} else {
			Entry<A,B> entry = table[index];
			while(entry.next != null) {
				if(entry.key.equals(key)) {
					entry.value = value;
					return;
				}
				entry = entry.next;
			}
			entry.next = new Entry<>(key, value);
			size++;
		}
		
		if((double) size/table.length > loadFactor) {
			rehash();
		}
	}
	
	public B get(A key) {
		int index = hash(key) % table.length;
		Entry<A, B> entry = table[index];
		while(entry != null) {
			if(entry.key.equals(key)) {
				return entry.value;
			}
			entry = entry.next;
		}
		return null;
	}
	
	public void remove(A key) {
		int index = hash(key) % table.length;
		
		Entry<A, B> entry = table[index];
		Entry<A, B> prev = null;
		
		while(entry != null) {
			if(entry.key.equals(key)) {
				if(prev == null) {
					table[index] = entry.next;
				} else {
					prev.next = entry.next;
				}
				size--;
				return;
			}
			prev = entry;
			entry = entry.next;
		}
	}
	
	private void rehash() {
		Entry<A, B>[] old = table;
		table = new Entry[table.length * 2];
		size = 0;
		
		for(Entry<A, B> entry : old) {
			Entry<A,B> current = entry;
			while(current != null) {
				put(current.key, current.value);
				current = current.next;
			}
		}
	}
	
	
	private int hash(A key) {
		return key == null ? 0 : key.hashCode();
	}
	
	static class Entry<A,B>{
		A key;
		B value;
		Entry<A,B> next;
		
		Entry(A key, B value){
			this.key = key;
			this.value = value;
			next = null;
		}
	}
}
