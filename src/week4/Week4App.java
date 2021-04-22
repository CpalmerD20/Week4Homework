package week4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Week4App {

	public static void main(String[] args) {
//1. Create an instance of an ArrayList of String called employeeNames
		List<String> employeeNames = new ArrayList<String>();
				
//2. Create an instance of a HashSet of Integer called ids
		Set<Integer> ids = new HashSet<Integer>();
		
//3. Create an instance of a HashMap of Integer, String called employeeMap
		Map<Integer,String> employeeMap = new HashMap<Integer,String>();
		
//4. Add at least five entries to the employeeNames and ids 
//(make sure both collections have the same number of entries).
		employeeNames.add("Michael Sterling");
		employeeNames.add("Ian Wright");
		employeeNames.add("Susan Arranda");
		employeeNames.add("Tyler Billings");
		employeeNames.add("Lilly Fuchs");
		employeeNames.add("Alice Ortega");
		
		ids.add(111);
		ids.add(112);
		ids.add(333);
		ids.add(104);
		ids.add(205);
		ids.add(306);
		
//5. Create a variable int i = 0; then iterate over ids using an enhanced for loop.
//Inside the enhanced for loop use employeeMap.put() to add a new entry to the map. 
//The entry should consist of a key that is the id in the enhanced loop’s 
//current iteration, and a value that is the employeeName at position i of the 
//employeeNames ArrayList. Increment i so that each iteration grabs the next element in the ArrayList.
		int i = 0; 
		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i += 1;
		}
		
//6. Once the employeeMap is fully populated, use another enhanced for loop to 
//iterate over the employeeMap.keySet(), and use the key for each current iteration 
//to print to the console both the current key and its associated value in the map.
		for (Integer key : employeeMap.keySet()) {
			System.out.println(key + " : " + employeeMap.get(key));
			
		}
		
//7. Create a StringBuilder called idsBuilder.
		StringBuilder idsBuilder = new StringBuilder();
		
//8. Iterate over the ids HashSet and append each id, followed 
//by a dash “-“ to idsBuilder.
		for (Integer id : ids) {
			idsBuilder.append(id + "-");
		}
		
//9. Print the result of idsBuilder.toString() to the console.
		System.out.println(idsBuilder.toString());
		
//10. Create another StringBuilder called namesBuilder.
		StringBuilder namesBuilder = new StringBuilder();
		
//11. Iterate over the employeeNames ArrayList and append each name, followed
//by a space “ “ to the namesBuilder.
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
		
//12. Print the result of namesBuilder.toString() to the console.
		System.out.println(namesBuilder.toString());

	}

}
