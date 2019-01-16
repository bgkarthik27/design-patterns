package ch.karthi;

public class BillPughSingleton {

	private int memberVariable;

	private BillPughSingleton() {
	}

	public int getMemberVariable() {
		return memberVariable;
	}

	public void setMemberVariable(int memberVariable) {
		this.memberVariable = memberVariable;
	}

	static class InstanceHelper {
		private static BillPughSingleton INSTANCE = new BillPughSingleton();

		static BillPughSingleton getInstance() {
			return INSTANCE;
		}
	}
}
