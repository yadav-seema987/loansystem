package loansystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Consumerloan extends JFrame {

	private JPanel contentPane;
	private JLabel loanbalancelabel,interestratelabel,monthlabel,paymentlabel,analysislabel;
	private JTextField loanbalancetextfield;
	private JTextField interesttextfield;
	private JTextField monthtextfield;
	private JTextField paymenttextfield;
	private JButton computebutton;
	private JButton newloanbutton;
	private JButton monthbutton;
	private JButton paymentbutton;
	private JTextArea textArea;
	private JButton exitbutton;
	private boolean computepayment;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consumerloan frame = new Consumerloan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Consumerloan() {
		setForeground(new Color(0, 0, 0));
		setFont(new Font("Arial", Font.BOLD, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 670, 250);
		setTitle("Loan Assistant");
		//setBackground(Color.BLUE);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setBackground(SystemColor.scrollbar);
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
	
		loanbalancelabel = new JLabel("Loan Balance");
		loanbalancelabel.setForeground(Color.BLACK);
		loanbalancelabel.setFont(new Font("Arial", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(loanbalancelabel, gbc_lblNewLabel);
		
		loanbalancetextfield = new JTextField();
		loanbalancetextfield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loanbalancetextfield.transferFocus();
			}
		});
		loanbalancetextfield.setPreferredSize(new Dimension(100,25));
		loanbalancetextfield.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		contentPane.add(loanbalancetextfield, gbc_textField);
		loanbalancetextfield.setColumns(10);
		
		analysislabel = new JLabel("Loan Analysis");
		analysislabel.setForeground(Color.BLACK);
		analysislabel.setFont(new Font("Arial", Font.BOLD, 16));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridx = 3;
		gbc_lblNewLabel_3.gridy = 0;
		contentPane.add(analysislabel, gbc_lblNewLabel_3);
		
		interestratelabel = new JLabel("Interest Rate");
		interestratelabel.setForeground(Color.BLACK);
		interestratelabel.setFont(new Font("Arial", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(interestratelabel, gbc_lblNewLabel_1);
		
		interesttextfield = new JTextField();
		interesttextfield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interesttextfield.transferFocus();
			}
		});
		interesttextfield.setPreferredSize(new Dimension(100,25));
		interesttextfield.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		contentPane.add(interesttextfield, gbc_textField_1);
		interesttextfield.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setFocusable(false);
		textArea.setPreferredSize(new Dimension(100,25));
		textArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textArea.setFont(new Font("Courier New", Font.PLAIN, 14));
		textArea.setEditable(false);
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(0, 0, 5, 0);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 3;
		gbc_textArea.gridy = 1;
		gbc_textArea.gridheight=4;
		contentPane.add(textArea, gbc_textArea);
		
		monthlabel= new JLabel("Number of Payment");
		monthlabel.setForeground(Color.BLACK);
		monthlabel.setFont(new Font("Arial", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(monthlabel, gbc_lblNewLabel_2);
		
		monthtextfield = new JTextField();
		monthtextfield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				monthtextfield.transferFocus();
			}
		});
		monthtextfield.setPreferredSize(new Dimension(100,25));
		monthtextfield.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		contentPane.add(monthtextfield, gbc_textField_2);
		monthtextfield.setColumns(10);
		
		monthbutton = new JButton("x");
		monthbutton.setFocusable(false);
		monthbutton.setBackground(new Color(176, 224, 230));
		monthbutton.setFont(new Font("Arial", Font.BOLD, 16));
		monthbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				monthevent();
			}

			private void monthevent() {
				// TODO Auto-generated method stub
				computepayment=false;
				paymentbutton.setVisible(true);
				paymenttextfield.setFocusable(true);
				paymenttextfield.setEditable(true);
				paymenttextfield.setBackground(Color.WHITE);
				monthtextfield.setEditable(false);
				monthtextfield.setText("");
				monthtextfield.setFocusable(false);
				monthtextfield.setBackground(Color.CYAN);
				monthbutton.setVisible(false);
				computebutton.setText("Compute Number Of Payment");
				loanbalancetextfield.requestFocus();
				
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 2;
		gbc_btnNewButton_2.gridy = 2;
		contentPane.add(monthbutton, gbc_btnNewButton_2);
		
		paymentlabel = new JLabel("Monthly Payment");
		paymentlabel.setForeground(Color.BLACK);
		paymentlabel.setFont(new Font("Arial", Font.PLAIN, 16));
		GridBagConstraints gbc_lblMonthlyPayment = new GridBagConstraints();
		gbc_lblMonthlyPayment.anchor = GridBagConstraints.WEST;
		gbc_lblMonthlyPayment.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonthlyPayment.gridx = 0;
		gbc_lblMonthlyPayment.gridy = 3;
		contentPane.add(paymentlabel, gbc_lblMonthlyPayment);
		
		paymenttextfield = new JTextField();
		paymenttextfield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paymenttextfield.transferFocus();
			}
		});
		paymenttextfield.setPreferredSize(new Dimension(100,25));
		paymenttextfield.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 3;
		contentPane.add(paymenttextfield, gbc_textField_3);
		paymenttextfield.setColumns(10);
		
		paymentbutton = new JButton("x");
		paymentbutton.setFocusable(false);
		paymentbutton.setBackground(new Color(176, 224, 230));
		paymentbutton.setFont(new Font("Arial", Font.BOLD, 16));
		paymentbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paymentevent();
			}

			private void paymentevent() {
				// TODO Auto-generated method stub
				computepayment=true;
				paymentbutton.setVisible(false);
				paymenttextfield.setFocusable(false);
				monthbutton.setVisible(true);
				monthtextfield.setEditable(true);
				monthtextfield.setFocusable(true);
				monthtextfield.setBackground(Color.WHITE);
				paymenttextfield.setText("");
				paymenttextfield.setEditable(false);
				paymenttextfield.setBackground(Color.CYAN);
				computebutton.setText("Compute Monthly Payment");
				loanbalancetextfield.requestFocus();
			}
		});
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 2;
		gbc_btnNewButton_3.gridy = 3;
		contentPane.add(paymentbutton, gbc_btnNewButton_3);
		
		computebutton = new JButton("Compute Number of Payment");
		computebutton.setBackground(new Color(176, 224, 230));
		computebutton.setFont(new Font("Arial", Font.BOLD, 16));
		computebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				computeevent();
			}

			private void computeevent() {
				// TODO Auto-generated method stub
				double balance,interest,payment,monthinterest,multiplier,loanbalance,finalpayment;
				int month;
				
				if(validate(loanbalancetextfield))
				{
					balance=Double.valueOf(loanbalancetextfield.getText()).doubleValue();
				}
				else
				{
					JOptionPane.showConfirmDialog(null, "Invalid or empty Loan Balance entry.\n Plaease Correct","Balalne Input Error",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				
				if(validate(interesttextfield))
				{
					interest=Double.valueOf(interesttextfield.getText()).doubleValue();
				}
				else
				{
					JOptionPane.showConfirmDialog(null, "Invalid or empty Interest Rate entry.\n Plaease Correct","Interest Input Error",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				
				monthinterest=interest/1200;
				
				if(computepayment)
				{
					//compute monthly payment
					if(validate(monthtextfield))
					{
						month=Integer.valueOf(monthtextfield.getText()).intValue();
					}
					
					else
					{
						JOptionPane.showConfirmDialog(null, "Invalid or empty Number of Payment entry.\n Plaease Correct","Number of Payment Input Error",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
						return;
					}
					
					if(interest==0)
					{
						payment=balance/month;
					}
					else
					{
						multiplier=Math.pow(1+ monthinterest, month);
						payment=balance*monthinterest*multiplier/(multiplier-1);
					}
					paymenttextfield.setText(new DecimalFormat("0.00").format(payment));
				}
				else
				{
					//compute number of payment
					if(validate(paymenttextfield))
					{
						payment=Double.valueOf(paymenttextfield.getText()).doubleValue();
						if(payment<=(balance*monthinterest+1.0))
						{
							if(JOptionPane.showConfirmDialog(null, "Miniumpayment must be $" +new DecimalFormat("0.00").format((int)(balance*monthinterest+1.0))+"\n"+"Do you want touse the minimum payment?","Input Error",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
							{
								paymenttextfield.setText(new DecimalFormat("0.00").format((int)(balance*monthinterest+1.0)));
								payment=Double.valueOf(paymenttextfield.getText()).doubleValue();
							}
							else
							{
								paymenttextfield.requestFocus();
								return;
							}
						}
						
					}
					else
					{
						JOptionPane.showConfirmDialog(null, "Invalid or empty Monthly Payment entry.\n Plaease Correct","Monthly Payment Error",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
						return;
					}
					
					
					if(interest==0)
					{
						month=(int)(balance/payment);
					}
					else
					{
						month=(int)((Math.log(payment)-Math.log(payment-balance*monthinterest))/Math.log(1+monthinterest));
					}
						monthtextfield.setText(String.valueOf(month));
				}
				
				payment=Double.valueOf(paymenttextfield.getText()).doubleValue();
				
				//showing all detail
				textArea.setText("Loan Balance:$" + new DecimalFormat("0.00").format(balance));
				textArea.append("\n" +"Interest Rate:$" + new DecimalFormat("0.00").format(interest)+"%");
				loanbalance=balance;
				for(int i=1; i<=month-1; i++)
				{
					loanbalance+=loanbalance*monthinterest-payment;
					
				}
				//find total payment
				finalpayment=loanbalance;
				if(finalpayment>payment)
				{
					loanbalance+=loanbalance*monthinterest-payment;
					finalpayment=loanbalance;
					month++;
					monthtextfield.setText(String.valueOf(month));
					
				}
				textArea.append("\n\n"+String.valueOf(month-1)+"Payment of $"+new DecimalFormat("0.00").format(payment));
				textArea.append("\n"+"Final Payment of : $"+new DecimalFormat("0.00").format(finalpayment));
				textArea.append("\n"+"Total Payment of : $"+new DecimalFormat("0.00").format((month-1)*payment+finalpayment));
				textArea.append("\n"+"Interest Paid : $"+new DecimalFormat("0.00").format((month-1)*payment+finalpayment-balance));
				computebutton.setEnabled(false);
				newloanbutton.setEnabled(true);
				newloanbutton.requestFocus();
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 4;
		gbc_btnNewButton.gridwidth=2;
		contentPane.add(computebutton, gbc_btnNewButton);
		
		newloanbutton = new JButton("New Loan Analysis");
		newloanbutton.setBackground(new Color(176, 224, 230));
		newloanbutton.setEnabled(false);
		newloanbutton.setFont(new Font("Arial", Font.BOLD, 16));
		newloanbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newloanevent();
			}

			private void newloanevent() {
				// TODO Auto-generated method stub
				if(computepayment)
				{
					paymenttextfield.setText("");
					
				}
				else
				{
					monthtextfield.setText("");
				}
				textArea.setText("");
				computebutton.setEnabled(true);
				newloanbutton.setEnabled(false);
				loanbalancetextfield.requestFocus();
				
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 5;
		gbc_btnNewButton_1.gridwidth=2;
		contentPane.add(newloanbutton, gbc_btnNewButton_1);
		
		exitbutton = new JButton("Exit");
		exitbutton.setForeground(new Color(255, 255, 255));
		exitbutton.setFocusable(false);
		exitbutton.setBackground(new Color(220, 20, 60));
		exitbutton.setFont(new Font("Arial", Font.BOLD, 16));
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exitevent();
			}

			private void exitevent() {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.gridx = 3;
		gbc_btnNewButton_4.gridy = 5;
		contentPane.add(exitbutton, gbc_btnNewButton_4);
		
		paymentbutton.doClick();
	}
	private boolean validate(JTextField jf)
	{
		String s=jf.getText().trim();
		boolean decimal=false;
		boolean valid=true;
		if(s.length()==0)
		{
			valid=false;
			
		}
		else
		{
			for(int i=0; i<s.length(); i++)
			{
				char c=s.charAt(i);
				if(c>='0'&& c<='9')
				{
					continue;
				}
				else if(c=='.' && !decimal)
				{
					decimal=true;
				}
				else
				{
					valid=false;
				}
			}
			
		}
		jf.setText(s);
		if(!valid)
		{
			jf.requestFocus();
		}
		return(valid);
	}

}