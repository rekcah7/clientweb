package test;

public class My_UserList {
	private String[] users;
	void setUsers(String[] args){
		users=args;
	}
	
	String getUser(int uid){//UID���� ����� �̸��� �˻�
		return users[uid];
	}
	int getUser(String user){//����� �̸����� UID�� ���
		for(int i=0; i<users.length;i++){
			if(user.equals(users[i])){
				return i;
			}
		}
		//���� ���� ���� �� �ʿ䰡 �ֱ� ������,
		//���⿡���� �⺻���� 0���� �ߴ�.
		return 0;
	}
}
