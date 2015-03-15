package LoanType;



import Interest.FixedInterestRate;
import Services.LoanService;



/**
 * A LoanType class in an abstract class that constructs a concept of loan class in general.
 * 
 * @author jannarongwadthong
 *
 */
public abstract class LoanType implements LoanService{
	
	
	//Fixed Annual Interest Rate
	protected double interestRate; 
	
	protected double laonPrincipal;
	protected int paybackPeriod;
	
	
	
	protected double monthlyPayment;
	
	
	public LoanType(){}
	
	
	/**
	 * 
	 * @param desiredAmount - desired amount specified by user
	 * @param desiredPayback - desired Payback Time in years specified by user
	 */
	public LoanType(double desiredAmount, int desiredPayback){
		this.laonPrincipal = desiredAmount;
		this.paybackPeriod = desiredPayback;
		
	}
	
	public void setLoanPrincipal(double p) {
		this.laonPrincipal = p;
		
	}

	public void setPaybackPeriod(int p) {
		this.paybackPeriod = p;
		
	}
	
	public double getInterestRate() {
		return this.interestRate;
	} 
	
	public double getMonthlyPaymentAmount() {	
		return FixedInterestRate.pmt(this.interestRate/12.0, this.paybackPeriod*12.0, this.laonPrincipal, 0.0, true);
	}

	


}
