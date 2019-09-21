package bank;

import java.util.HashMap;
import java.util.Map;
//import java.util.ArrayList;
//import java.util.List;

public class DBuilt {
	// List<String> list = new ArrayList<String>();
	Map<String, User> map = new HashMap<String, User>();
	Map<String, User> map2 = new HashMap<String, User>();
	Map<String, User> map3 = new HashMap<String, User>();
	Map<String, User> map4 = new HashMap<String, User>();
	public static User[] user = new User[100];
	public static int index = 0;

	public void regist(String cardld, String cardPwd, String userName, String call) {
		User user = new User(cardld, cardPwd, userName, call);
		map.put(cardld, user);
		// list.add(cardld);
		// list.add(cardPwd);
		// list.add(userName);
		// list.add(call);
	}

	void getInformation() {
	}

	void getAllInformation() {
	}

}
