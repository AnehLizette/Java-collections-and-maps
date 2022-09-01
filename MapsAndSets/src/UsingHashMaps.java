import java.util.HashMap;
import java.util.Map;

public class UsingHashMaps {



	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		map.put("2", 3);
		map.put("4", 1);
		map.put("5", 1);
		
		map.put("Lawrence", 45);
		map.put("Lizzy", 25);
		map.put("Lizzy", 35);
		map.put("Emma", 35);

		System.out.println(map);

		System.out.println("Size of map is:- " + map.size());

		
		//lopping through maps
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
