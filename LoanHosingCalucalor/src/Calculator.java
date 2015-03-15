import javax.swing.JComboBox;

import LoanType.LoanType;
import Services.LoanService;

public class Calculator {

	private LoanService loan;

	/**
	 * Get a specific instance type of loan by matching the selected item from
	 * JComboBox with a set of "Property Type" values.
	 * 
	 * Note that the name of all concrete classes in the LoanType package must
	 * be exactly the same with the values in the JComboBox; otherwise, catch
	 * ClassNotFoundException
	 * 
	 * @param c
	 *            - JComboBox that contains the selected item from the GUI
	 * @param propTypeValues
	 *            - a set of all property types displayed in the GUI
	 * 
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public LoanType getLoanType(JComboBox c, String[] propTypeValues) {

		String name = c.getModel().getSelectedItem().toString();
		// Need to specify the package path except the default package
		String packagePath = "LoanType.";
		for (String val : propTypeValues) {
			if (val.equals(name))
				try {
					return (LoanType) Class.forName(packagePath + val)
							.newInstance();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}

		}
		return null;

	}

	/**
	 * 
	 * @param sLoan
	 *            - set specific type of loan
	 * @return
	 */
	public LoanService setService(LoanService sLoan) {
		return this.loan = sLoan;

	}

	public LoanService getLoanService() {
		return this.loan;
	}

}
