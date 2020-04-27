package LiveApr;

import java.util.Map;
import java.util.TreeMap;

public class TreemapQues {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(1, "pandey");
		map.put(5, "ravil");
		map.put(3, "monu");
		map.put(4, "Sudhanshu");
		map.put(2, "Orussa");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.print(m.getKey() + " " + m.getValue()+" ");

		}
	}
}
