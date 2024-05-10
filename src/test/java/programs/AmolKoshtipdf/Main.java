package programs.AmolKoshtipdf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
	
	

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 111);
		map.put(2, 111);
		System.out.println(map.merge(2,444,(V1,V2) -> V1+V2	));
	}
}
