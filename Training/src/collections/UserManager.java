package collections;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;

public class UserManager {

	private Map<String, String> users;
	public UserManager() {
		// TODO Auto-generated constructor stub
		users=new HashMap<String,String>();
		users.put("majrul","123");
		users.put("Shubham","qwe");
		users.put("ashutosh","234");
		users.put("nikita","565");
	}
	public boolean isValidUser(String username,String password)
	{
		if(users.containsKey(username))
		if(users.get(username).equals(password))
			return true;
		return false;
	}
	public static void main(String[] args) {
		UserManager m=new UserManager();
		System.out.println(m.isValidUser("Shubham", "qwe"));
	}
}
