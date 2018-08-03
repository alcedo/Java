package collections;

import java.util.ArrayList;
import java.util.List;

public class UserService {

		private List<User> users;
		
		public UserService() {
			// TODO Auto-generated constructor stub
			users=new  ArrayList<User>();
			users.add(new User("majrul","123"));
			users.add(new User("Shubham","qwe"));
			users.add(new User("ashutosh","234"));
			users.add(new User("nikita","565"));
			
			
		}
		
		public boolean isValidUser(String username,String password)
		{
			for(User u:users)
			{
				if(u.getUsername().equals(username) && u.getPassword().equals(password))
					return true;
			}
			return false;
		}
		public boolean isValidUsercontains(String username,String password)
		{
			if(users.contains(new User(username,password)))
				return true;
			return false;
		}
		public static void main(String[] args) {
			UserService u=new UserService();
			System.out.println(u.isValidUser("Shubham", "qwe"));
			System.out.println(u.isValidUsercontains("Shubham", "qwe"));
		}
}
