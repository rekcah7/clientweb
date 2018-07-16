package test;

public class UsersException extends Exception {
	public UsersException (String str){
		super(str);
	}
}

class UserNotAuthorizedException extends UsersException{
	//UID
	private int id;
	//사용자 이름
	private String name;
	//생성자
	public UserNotAuthorizedException(){
		super("이 사용자는 인증되지 않습니다.");
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
	//UID의 상한
	private int hid;
	//생성자(인수는 UID 제한)
	public UidOutOfBoundException (int i){
		super("UID의 범위는"+0+"에서"+i+"입니다.");
		hid = i;
	}
	public int getHid(){
		return hid;
	}
}

class NullUsersException extends UsersException{
	//생성자
	NullUsersException(){
		super("사용자가 정의되어 있지 않습니다.");
	}
}
