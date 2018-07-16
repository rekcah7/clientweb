package test;

public class My_UserTest {
	public static void main(String[] args){
	My_UserList obj = new My_UserList();//사용자 배열 세트
	obj.setUsers(args);
	System.out.print("dominica->");
	System.out.println(obj.getUser("dominica"));
	System.out.print("0->");
	System.out.println(obj.getUser(0));
	}
}
