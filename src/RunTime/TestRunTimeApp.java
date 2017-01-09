package RunTime;

import Utils.AppTools;
import model.User;

public class TestRunTimeApp {
	public static void main(String[] args) {
		User u = new User();
		System.out.println("调用appTools之前的用户name:"+u.getName());
		AppTools.disposeUser(u);
		System.out.println("调用appTools之后的用户name:"+u.getName());
	}
}
