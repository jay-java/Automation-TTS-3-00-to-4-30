package core;

import java.util.HashMap;
import java.util.Map;

public class P026_Map {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "c");
		map.put(2, "C++");
		map.put(3, "java");
		map.put(4, "dart");
//		map.put("kotlin", 5);
		map.put(4, "golang");
		System.out.println(map);
	}
}
