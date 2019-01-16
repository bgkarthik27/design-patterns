package ch.karthi;

public class LazySingleton {
	
	private int memberVariable;
	
	private static LazySingleton INSTANCE;
	
	private LazySingleton() {}
	
	public static LazySingleton getInstance() {
		if (INSTANCE == null)
			 INSTANCE = new LazySingleton();
		
		return INSTANCE;
	}

	public int getMemberVariable() {
		return memberVariable;
	}

	public void setMemberVariable(int memberVariable) {
		this.memberVariable = memberVariable;
	}
	

}
