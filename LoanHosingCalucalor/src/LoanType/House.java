package LoanType;






public class House extends LoanType {
	//Fixed Annual Interest Rate
	protected static double INTEREST_RATE=3.5; 

	// To avoid InstantiationException
	public House(){this.interestRate=House.INTEREST_RATE;}

	


}
