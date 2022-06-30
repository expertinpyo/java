package exceptionHandling;

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that) throws Exception {

		if (!this.currency.equals(that.currency)) {
//			throw new Exception("Currencies Don't Match!"); // 에러를 던지는 것!
			// 여기서 checked Exception을 날리는 경우 표시해줘야함
			throw new CustomsException("Currencies Don't Match!");

		}
	}

}

class CustomsException extends Exception {
	public CustomsException(String msg) {
		super(msg);
	}
}

public class ThrowingPractice {

	public static void main(String[] args) throws Exception {
		// Exception이 uncatched(Runtime)Error가 아닌 경우 throws 해줘야 함
		// TODO Auto-generated method stub
		Amount cur1 = new Amount("USD", 10);
		Amount cur2 = new Amount("WON", 13);

		cur1.add(cur2);
	}

}
