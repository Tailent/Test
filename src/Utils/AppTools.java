package Utils;

import model.User;

public class AppTools {
	public static void disposeUser(User user){
		user.setAge(23);
		user.setName("Tailent");
		user.setPwd("123");
	}
}
