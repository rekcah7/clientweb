package test;

public class My_UserList {
	private String[] users;
	void setUsers(String[] args){
		users=args;
	}
	
	String getUser(int uid){//UID에서 사용자 이름을 검색
		return users[uid];
	}
	int getUser(String user){//사용자 이름에서 UID를 취득
		for(int i=0; i<users.length;i++){
			if(user.equals(users[i])){
				return i;
			}
		}
		//정수 값을 돌려 줄 필요가 있기 때문에,
		//여기에서는 기본값은 0으로 했다.
		return 0;
	}
}
