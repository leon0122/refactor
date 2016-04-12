package refactor.com.learn;

import java.util.Collection;
import java.util.Map;

public class MapOperator {
	
	public Info get(final String key) {
		InfoMap info;
		try {
			info = new InfoMap();
			Map<String, Info> map = info.getMap();
			
			return (Info) map.get(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public  Map<String, Info>  put(final String key, final Info value) {
		InfoMap info;
		try {
			info = new InfoMap();
			Map<String, Info> map = info.getMap();
			
			map.put(key, value);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Collection<Info> getAll() {
	
		InfoMap info;
		try {
			info = new InfoMap();
			Map<String, Info> map = info.getMap();
			
			return map.values();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		MapOperator oper=new MapOperator();
		Info s1=oper.get("jack");
		System.out.println(s1.getAge());
		
		Map<String,Info> map=oper.put("rose", new Info("rose",18));
		System.out.println(map.get("rose").getName());
		
		Collection<Info> list=oper.getAll();
		for (Info info : list) {
			System.out.println("name:"+info.getName());
		}
	}
}
