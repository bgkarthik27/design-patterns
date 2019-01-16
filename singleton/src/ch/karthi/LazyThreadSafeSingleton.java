package ch.karthi;

public class LazyThreadSafeSingleton {
	
	private int memberVariable;
	
	private static LazyThreadSafeSingleton INSTANCE;
	
	private LazyThreadSafeSingleton() {}
	
	public static synchronized LazyThreadSafeSingleton getInstance() {
		if (INSTANCE == null)
			 INSTANCE = new LazyThreadSafeSingleton();
		
		return INSTANCE;
	}

	public int getMemberVariable() {
		return memberVariable;
	}

	public void setMemberVariable(int memberVariable) {
		this.memberVariable = memberVariable;
	}
	

}
