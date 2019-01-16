package ch.karthi;

public class LazyThreadSafeSingletonDoubleCheckedLocking {

	private int memberVariable;

	private static volatile LazyThreadSafeSingletonDoubleCheckedLocking INSTANCE;

	private LazyThreadSafeSingletonDoubleCheckedLocking() {
	}

	public static LazyThreadSafeSingletonDoubleCheckedLocking getInstance() {
		if (INSTANCE == null) {
			synchronized (LazyThreadSafeSingletonDoubleCheckedLocking.class) {
				if (INSTANCE == null)
					INSTANCE = new LazyThreadSafeSingletonDoubleCheckedLocking();
			}
		}
		return INSTANCE;
	}

	public int getMemberVariable() {
		return memberVariable;
	}

	public void setMemberVariable(int memberVariable) {
		this.memberVariable = memberVariable;
	}

}
