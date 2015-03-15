package Services;





public interface LoanService {

	/**
	 * 
	 * @param p
	 */
	void setLoanPrincipal(double p);
	
	
	
	
	/**
	 * 
	 */
	void setPaybackPeriod(int p);



	
	
	/**
	 * 
	 * @return
	 */
	double getMonthlyPaymentAmount();
	
	
	
	/**
	 * 
	 * @return
	 */
	double getInterestRate();
}
