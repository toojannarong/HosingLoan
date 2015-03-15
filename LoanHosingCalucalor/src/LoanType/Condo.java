package LoanType;

public class Condo extends LoanType {

	// Fixed Annual Interest Rate
	protected static double INTEREST_RATE = 2.7;//suppose

	// To avoid InstantiationException
	public Condo() {
		this.interestRate = Condo.INTEREST_RATE;
	}

}
