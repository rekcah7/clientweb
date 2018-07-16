package test;

public class UsersException extends Exception {
	public UsersException (String str){
		super(str);
	}
}

class UserNotAuthorizedException extends UsersException{
	//UID
	private int id;
	//����� �̸�
	private String name;
	//������
	public UserNotAuthorizedException(){
		super("�� ����ڴ� �������� �ʽ��ϴ�.");
	}
	
	public void setUid(int i){
		id=i;
	}
	
	public void setName(String user){
		name=user;
	}
	
	public String getName(){
		return name;
	}
	
	public int getId(){
		return id;
	}
}

class UidOutOfBoundException extends UsersException {
	//UID�� ����
	private int hid;
	//������(�μ��� UID ����)
	public UidOutOfBoundException (int i){
		super("UID�� ������"+0+"����"+i+"�Դϴ�.");
		hid = i;
	}
	public int getHid(){
		return hid;
	}
}

class NullUsersException extends UsersException{
	//������
	NullUsersException(){
		super("����ڰ� ���ǵǾ� ���� �ʽ��ϴ�.");
	}
}
