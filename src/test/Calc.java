package test;

public class Calc {
	private int a,b;
	
	public int getA(){
		return a;
	}
	
	public void setA(int a){
		this.a = a;
	}
	
	public int getB(){
		return b;
	}
	
	public void setB(int b){
		this.b = b;
	}
	
	public int getHap(int a, int b){
		return a+b;
	}
	
	public int getCha(int a, int b){
		return a-b;
	}
	
	@NotMyNo
	public int getMul(int a, int b){
		return a*b;
	}
	
	public int getDiv(int a, int b){
		return a/b;
	}
	
	@Override
	public String toString(){
		return ToCalcHelper.toString(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
		calc.setA(14);
		calc.setB(7);
		System.out.println(calc);
		
		
		
	}

}
