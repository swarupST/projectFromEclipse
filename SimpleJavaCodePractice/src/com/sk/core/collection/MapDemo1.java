package com.sk.core.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("name", "Swarup");
		map.put("country", "India");
		map.put("state", "Odisha");
		
		System.out.println(map);
		
		Set<String> mapKeys = map.keySet();
		
		for(String key : mapKeys) {
			System.out.println(key +" - "+map.get(key));
		}
	}

}
