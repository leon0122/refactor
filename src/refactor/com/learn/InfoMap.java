package refactor.com.learn;

import java.util.HashMap;
import java.util.Map;

public class InfoMap {
	public Map<String, Info> getMap(){
		Map<String, Info> map=new HashMap<String, Info>();
		Info s1=new Info();
		s1.setName("jack");
		s1.setAge(23);
		map.put("jack", s1);
		
		Info s2=new Info();
		s2.setName("tom");
		s2.setAge(29);
		map.put("tom", s2);
		
		return map;
		
	}
}
