package test;

public class UserTest {
	public static void main(String[] args) {
		UserList obj = new UserList();
		obj.setUsers(args);
		
		try{
			System.out.println("dominica ->");
			System.out.println(obj.getUser("dominica"));
			System.out.println("10->");
			System.out.println(obj.getUser(10));
		}catch(UsersException e){
			System.out.println(e);
			return;
		}

	}

}
