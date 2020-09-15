package coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment {

	public static void main(String[] args) {
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Tommy");
		employeeNames.add("Willy");
		employeeNames.add("Luc");
		employeeNames.add("Julie");
		employeeNames.add("Taylor");
		employeeNames.add("Sasha");
		
		
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		ids.add(6);
		
		Map<Integer, String> employeeMap = new HashMap<Integer,String>();
		 	
		 	  int i = 0;
		 		for	 (Integer id : ids) {
		 		 employeeMap.put(id, employeeNames.get(i));
		 		 i++;
		 	 }
		 	
		  //employeeMap.keySet()
		 	for (Integer key : employeeMap.keySet()) {
		 		System.out.println(key + "-" + employeeMap.get(key));
		 		
		 	}
		 
		//StringBuilder
		StringBuilder idsBuilder = new StringBuilder();
		HashSet<String> Builder = new HashSet<String>();
		idsBuilder.append(ids);
		System.out.println(idsBuilder.toString());
		
		StringBuilder namesBuilder = new StringBuilder();
		namesBuilder.append(employeeNames);
		System.out.println(namesBuilder.toString());
	}

}
