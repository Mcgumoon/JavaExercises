package assignment6;

import assignment6.HashMap.Entry;;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> studentAge = new HashMap<>();
		
		studentAge.put("Brayan", 21);
		studentAge.put("Max", 22);
		studentAge.put("Sofia", 20);
		
		System.out.println("Age of Brayan: " + studentAge.get("Brayan"));
		System.out.println("Age of Sofia: " + studentAge.get("Sofia"));
		
		studentAge.remove("Max");
		System.out.println("Age of Max after removal is: " + studentAge.get("Max"));
		
		studentAge = resize(studentAge);
		
		studentAge.put("Stela", 24);
		System.out.println("Age of Stella: " + studentAge.get("Stela"));
	}
	
	private static <A, B> HashMap<A,B> resize(HashMap<A,B> map){
		if(map == null) {
			return null;
		}
		
		int newSize = map.table.length * 4;
		double newLoad = 0.80;
		HashMap<A,B> resizeMap = new HashMap<>(newSize, newLoad);
		
		for(Entry<A,B> entry : map.table) {
				Entry<A, B> current = entry;
				if(current != null) {
					resizeMap.put(current.key, current.value);
					current = current.next;
				} 
		}
		return resizeMap;
	}
}
