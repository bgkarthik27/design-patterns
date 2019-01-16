package ch.karthi;

public class EagerSingleton {
	
	private int memberVariable;
	
	private static final EagerSingleton INSTANCE = new EagerSingleton();
	
	private EagerSingleton() {}
	
	public static EagerSingleton getInstance() {
		return INSTANCE;
	}

	public int getMemberVariable() {
		return memberVariable;
	}

	public void setMemberVariable(int memberVariable) {
		this.memberVariable = memberVariable;
	}

}
