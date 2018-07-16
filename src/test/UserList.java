package test;

public class UserList {
	private String[] users;
	void setUsers(String[] args){
		users = args;
	}
	String[] getUser() throws NullUsersException{
		if(users.equals(null)){
			throw new NullUsersException();
		}
		return users;
	}
	
	String getUser(int uid) throws UsersException{
		if(users.equals(null)){
			throw new NullUsersException();
		}else if(uid<0 || uid >= users.length){
			UidOutOfBoundException excep
			= new UidOutOfBoundException (users.length-1);
			throw excep;
		}
		return users[uid];
	}
	int getUser(String user) throws UsersException{
		int uid=0;
		if(users.length == 0){
			throw new NullUsersException();
		}else{
			for(int i=0; i<users.length;i++){
				if(user.equals(users[i])){
					uid=i;
					break;
				}else if(i==users.length-1){
					UserNotAuthorizedException excep
					= new UserNotAuthorizedException();
					excep.setName(user);
					throw excep;
				}
			}
		}
		return uid;
	}
}
