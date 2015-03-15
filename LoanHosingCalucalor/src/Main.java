import java.awt.event.ActionEvent;

import Services.LoanService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jannarongwadthong
 */
public class Main extends javax.swing.JFrame {
	
    // Variables declaration                  
    private javax.swing.JButton calculate_button;
    private javax.swing.JTextField interestRate;
    private javax.swing.JLabel interestRate_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField loanPeriod;
    private javax.swing.JLabel loanPeriod_label;
    private javax.swing.JComboBox loanProperty_ComboBox;
    private javax.swing.JLabel loanProperty_label;
    private javax.swing.JLabel monthlyPayAmount_label;
    private javax.swing.JTextField monthlyPaymentAmount;
    private javax.swing.JTextField propertyPrice;
    private javax.swing.JLabel propertyPrice_label;
    
    
    private  String[] propTypeValues = { "House", "Condo" };
    
    private  Calculator  c = new Calculator();
	private  LoanService x;
	private String propertyType;
	private double price;
	private int payback;
    // End of variables declaration     

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form LoanMain
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loanProperty_label = new javax.swing.JLabel();
        propertyPrice_label = new javax.swing.JLabel();
        interestRate_label = new javax.swing.JLabel();
        loanPeriod_label = new javax.swing.JLabel();
        monthlyPayAmount_label = new javax.swing.JLabel();
        loanProperty_ComboBox = new javax.swing.JComboBox();
        propertyPrice = new javax.swing.JTextField();
        interestRate = new javax.swing.JTextField();
        loanPeriod = new javax.swing.JTextField();
        monthlyPaymentAmount = new javax.swing.JTextField();
        calculate_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loan Calculator");
        setResizable(false);

        loanProperty_label.setText("Loan Property:");

        propertyPrice_label.setText("Property Price:");

        interestRate_label.setText("Annual Interest Rate(%):");

        loanPeriod_label.setText("Loan Period(Years or months):");

        monthlyPayAmount_label.setText("Monthly Payment Amount:");

        loanProperty_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(this.propTypeValues));
        loanProperty_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanProperty_ComboBoxActionPerformed(evt);
            }

			
        });

        propertyPrice.setText("0.00");
       
       

        interestRate.setText("3.5");
        interestRate.setEditable(false);

        loanPeriod.setText("0");

        monthlyPaymentAmount.setEditable(false);
        monthlyPaymentAmount.setForeground(new java.awt.Color(255, 0, 51));
        monthlyPaymentAmount.setToolTipText("");
        

        calculate_button.setText("Calculate");
        calculate_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculate_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loanProperty_label)
                    .addComponent(propertyPrice_label)
                    .addComponent(interestRate_label)
                    .addComponent(loanPeriod_label)
                    .addComponent(monthlyPayAmount_label))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(propertyPrice)
                    .addComponent(interestRate)
                    .addComponent(loanPeriod)
                    .addComponent(monthlyPaymentAmount)
                    .addComponent(loanProperty_ComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 131, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calculate_button)
                .addGap(170, 170, 170))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loanProperty_label)
                    .addComponent(loanProperty_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(propertyPrice_label)
                    .addComponent(propertyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(interestRate_label)
                    .addComponent(interestRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(loanPeriod_label)
                        .addGap(12, 12, 12))
                    .addComponent(loanPeriod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculate_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(monthlyPayAmount_label))
                    .addComponent(monthlyPaymentAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Loan Calculalator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(606, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

                             

    

	private void loanProperty_ComboBoxActionPerformed(ActionEvent evt) {
		this.x = c.setService(c.getLoanType(loanProperty_ComboBox, propTypeValues));
		this.interestRate.setText(x.getInterestRate()+"");
		
	}

	private void calculate_buttonMouseClicked(java.awt.event.MouseEvent evt) {  
    	this.propertyType = this.loanProperty_ComboBox.getSelectedItem().toString();
        this.price = Double.parseDouble(this.propertyPrice.getText());
        this.payback = Integer.parseInt(this.loanPeriod.getText());
       
        
       
        this.x = c.setService(c.getLoanType(loanProperty_ComboBox, propTypeValues));
        x.setLoanPrincipal(price);
        x.setPaybackPeriod(payback);
      
        System.out.println("Property Type:"+ propertyType+" Price:"+price+" Interest:"+x.getInterestRate()+"  Payback:"+payback);
        this.monthlyPaymentAmount.setText(x.getMonthlyPaymentAmount()+"");
        
    }  
	

                                                

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    	
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    

              
}
