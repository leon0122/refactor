package refactor.com.learn;

import java.util.Collection;
import java.util.Map;

public class MapOperatorRefactor {
	
	public Info get(final String key) {
		  return (Info) executeWithMap(new Executable<Info>() {
			@Override
			public Info execute(Map map) throws Exception {
				return (Info) map.get(key);
			}
		  });  
	}
	
	private <T> T executeWithMap(Executable<T> ex)
	{
		InfoMap info;
		try {
			info = new InfoMap();
			Map<String, Info> map = info.getMap();
			return ex.execute(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public  Map<String, Info>  put(final String key, final Info value) {
		return executeWithMap((Map map) -> {
			map.put(key, value);
			return map;
		});
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
		MapOperatorRefactor oper=new MapOperatorRefactor();
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
