package CafeSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class CafeSystem extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField jtxtsubtotal;
	private JTextField jtxtTotal;
	private JTextField jtxtChange;
	private JTextField jtxtDisplay;
	private JTextComponent jtxtSubTotal;
	private JTextComponent jtxtTax;
	private JTextField jtxttax;
	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	    EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            try {
	                CafeSystem frame = new CafeSystem();
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
	//=======================================Functions===============================//
	
	//=======================================Functions===============================//
	
	
	
	public CafeSystem() {
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 1397, 882);
	    contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(contentPane);
	    contentPane.setLayout(null);
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(22, 11, 277, 462);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton jbtn7 = new JButton("7");
		jbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber= jtxtDisplay.getName();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(jbtn7.getText());
				}
				else
				{
					Enternumber= jtxtDisplay.getText() + jbtn7.getText();
					jtxtDisplay.setText(Enternumber);
				}
				
			}
		});
		jbtn7.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn7.setBounds(10, 57, 76, 62);
		panel_1.add(jbtn7);
		
		JButton jbtn8 = new JButton("8");
		jbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber= jtxtDisplay.getName();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(jbtn8.getText());
				}
				else
				{
					Enternumber= jtxtDisplay.getText() + jbtn8.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn8.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn8.setBounds(96, 57, 76, 62);
		panel_1.add(jbtn8);
		
		JButton jbtn9 = new JButton("9");
		jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber= jtxtDisplay.getName();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(jbtn9.getText());
				}
				else
				{
					Enternumber= jtxtDisplay.getText() + jbtn9.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn9.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn9.setBounds(182, 57, 76, 62);
		panel_1.add(jbtn9);
		
		JButton jbtn6 = new JButton("6");
		jbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber= jtxtDisplay.getName();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(jbtn6.getText());
				}
				else
				{
					Enternumber= jtxtDisplay.getText() + jbtn6.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn6.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn6.setBounds(182, 141, 76, 62);
		panel_1.add(jbtn6);
		
		JButton jbtn5 = new JButton("5");
		jbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber= jtxtDisplay.getName();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(jbtn5.getText());
				}
				else
				{
					Enternumber= jtxtDisplay.getText() + jbtn5.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn5.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn5.setBounds(96, 141, 76, 62);
		panel_1.add(jbtn5);
		
		JButton jbtn4 = new JButton("4");
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber= jtxtDisplay.getName();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(jbtn4.getText());
				}
				else
				{
					Enternumber= jtxtDisplay.getText() + jbtn4.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn4.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn4.setBounds(10, 141, 76, 62);
		panel_1.add(jbtn4);
		
		JButton jbtn1 = new JButton("1");
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber= jtxtDisplay.getName();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(jbtn1.getText());
				}
				else
				{
					Enternumber= jtxtDisplay.getText() + jbtn1.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn1.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn1.setBounds(10, 221, 76, 62);
		panel_1.add(jbtn1);
		
		JButton jbtn2 = new JButton("2");
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber= jtxtDisplay.getName();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(jbtn2.getText());
				}
				else
				{
					Enternumber= jtxtDisplay.getText() + jbtn2.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn2.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn2.setBounds(96, 223, 76, 62);
		panel_1.add(jbtn2);
		
		JButton jbtn3 = new JButton("3");
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber= jtxtDisplay.getName();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(jbtn3.getText());
				}
				else
				{
					Enternumber= jtxtDisplay.getText() + jbtn3.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn3.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn3.setBounds(182, 223, 76, 62);
		panel_1.add(jbtn3);
		
		JButton jbtn0 = new JButton("0");
		jbtn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber= jtxtDisplay.getName();
				if(Enternumber=="")
				{
					jtxtDisplay.setText(jbtn0.getText());
				}
				else
				{
					Enternumber= jtxtDisplay.getText() + jbtn0.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn0.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn0.setBounds(10, 297, 76, 62);
		panel_1.add(jbtn0);
		
		JButton jbtnDot = new JButton(".");
		jbtnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!jtxtDisplay.getText().contains("."))
				{
					jtxtDisplay.setText(jtxtDisplay.getText()+ jbtnDot.getText());
				}
			}
		});
		jbtnDot.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnDot.setBounds(96, 297, 76, 62);
		panel_1.add(jbtnDot);
		
		JButton jbtnclear = new JButton("C");
		jbtnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtDisplay.setText(null);
				jtxtChange.setText(null);
			}
		});
		jbtnclear.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnclear.setBounds(182, 297, 76, 62);
		panel_1.add(jbtnclear);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1.setBounds(562, 11, 811, 478);
		contentPane.add(panel_1_1);
		
		JButton btnChocolateShake = new JButton("");
		btnChocolateShake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				double PriceOfItem =110;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] { "Chocolate Shake","1",PriceOfItem});
				ItemCost();
			}
		});
		btnChocolateShake.setIcon(new ImageIcon("D:\\semester 6\\SOFTWARE construction LAB  r4 (  maham noor)\\download (1).jfif"));
		btnChocolateShake.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnChocolateShake.setBounds(10, 10, 148, 133);
		panel_1_1.add(btnChocolateShake);
		
		JButton btnColddrinks = new JButton("");
		btnColddrinks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem =1.55;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] { "Cold Drinks","1",PriceOfItem});
				ItemCost();
			}
		});
		btnColddrinks.setIcon(new ImageIcon("D:\\semester 6\\SOFTWARE construction LAB  r4 (  maham noor)\\download (5).jfif"));
		btnColddrinks.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnColddrinks.setBounds(10, 165, 148, 133);
		panel_1_1.add(btnColddrinks);
		
		JButton btnMintMargarita = new JButton("");
		btnMintMargarita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem =122.55;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] { "Mint Margarita","1",PriceOfItem});
				ItemCost();
			}
		});
		btnMintMargarita.setIcon(new ImageIcon("D:\\semester 6\\SOFTWARE construction LAB  r4 (  maham noor)\\download (9).jfif"));
		btnMintMargarita.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnMintMargarita.setBounds(10, 314, 148, 133);
		panel_1_1.add(btnMintMargarita);
		
		JButton btnOrangeJuice = new JButton("");
		btnOrangeJuice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					double PriceOfItem =152.55;
					DefaultTableModel model=(DefaultTableModel) table.getModel();
					model.addRow(new Object[] { "Orange Juice","1",PriceOfItem});
					ItemCost();
				
			}
		});
		btnOrangeJuice.setIcon(new ImageIcon("D:\\semester 6\\SOFTWARE construction LAB  r4 (  maham noor)\\download (2).jfif"));
		btnOrangeJuice.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnOrangeJuice.setBounds(168, 10, 148, 133);
		panel_1_1.add(btnOrangeJuice);
		
		JButton btnTea = new JButton("");
		btnTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem =0.55;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] { "Tea","1",PriceOfItem});
				ItemCost();
			}
		});
		btnTea.setIcon(new ImageIcon("D:\\semester 6\\SOFTWARE construction LAB  r4 (  maham noor)\\download (6).jfif"));
		btnTea.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnTea.setBounds(168, 165, 148, 133);
		panel_1_1.add(btnTea);
		
		JButton btnRainbowCake = new JButton("");
		btnRainbowCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem =1000.55;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] { "Rainbow Cake","1",PriceOfItem});
				ItemCost();
			}
		});
		btnRainbowCake.setIcon(new ImageIcon("D:\\semester 6\\SOFTWARE construction LAB  r4 (  maham noor)\\download (10).jfif"));
		btnRainbowCake.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnRainbowCake.setBounds(168, 314, 148, 133);
		panel_1_1.add(btnRainbowCake);
		
		JButton btnColdcoffee = new JButton("");
		btnColdcoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem =442.55;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] { "Cold coffee","1",PriceOfItem});
				ItemCost();
			}
		});
		btnColdcoffee.setIcon(new ImageIcon("D:\\semester 6\\SOFTWARE construction LAB  r4 (  maham noor)\\download (3).jfif"));
		btnColdcoffee.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnColdcoffee.setBounds(326, 10, 148, 133);
		panel_1_1.add(btnColdcoffee);
		
		JButton btnPineapplePestries = new JButton("");
		btnPineapplePestries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem =192.55;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] { "Pineapple Pestries","1",PriceOfItem});
				ItemCost();

			}

		});
		btnPineapplePestries.setIcon(new ImageIcon("D:\\semester 6\\SOFTWARE construction LAB  r4 (  maham noor)\\images.jfif"));
		btnPineapplePestries.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnPineapplePestries.setBounds(485, 10, 148, 133);
		panel_1_1.add(btnPineapplePestries);
		
		JButton btnGreenTea = new JButton("");
		btnGreenTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem =0.75;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] { "Green Tea","1",PriceOfItem});
				ItemCost();
			}
		});
		btnGreenTea.setIcon(new ImageIcon("D:\\semester 6\\SOFTWARE construction LAB  r4 (  maham noor)\\download (7).jfif"));
		btnGreenTea.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnGreenTea.setBounds(326, 165, 148, 133);
		panel_1_1.add(btnGreenTea);
		
		JButton btnBlackTea = new JButton("");
		btnBlackTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem =221.25;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] { "Black Coffee","1",PriceOfItem});
				ItemCost();
			}
		});
		btnBlackTea.setIcon(new ImageIcon("D:\\semester 6\\SOFTWARE construction LAB  r4 (  maham noor)\\images (1).jfif"));
		btnBlackTea.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnBlackTea.setBounds(485, 159, 148, 133);
		panel_1_1.add(btnBlackTea);
		
		JButton btnIceCream = new JButton("");
		btnIceCream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem =142.55;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] { "Ice Cream","1",PriceOfItem});
				ItemCost();
			}
		});
		btnIceCream.setIcon(new ImageIcon("D:\\semester 6\\SOFTWARE construction LAB  r4 (  maham noor)\\download (11).jfif"));
		btnIceCream.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnIceCream.setBounds(326, 314, 148, 133);
		panel_1_1.add(btnIceCream);
		
		JButton btnStrawBerryShake = new JButton("");
		btnStrawBerryShake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem =162.55;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] { "StrawBerry Shake","1",PriceOfItem});
				ItemCost();
			}
		});
		btnStrawBerryShake.setIcon(new ImageIcon("D:\\semester 6\\SOFTWARE construction LAB  r4 (  maham noor)\\download (12).jfif"));
		btnStrawBerryShake.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnStrawBerryShake.setBounds(485, 297, 148, 160);
		panel_1_1.add(btnStrawBerryShake);
		
		JButton btnChocolatecake = new JButton("");
		btnChocolatecake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem =955.25;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] { "Chocolate Cake","1",PriceOfItem});
				ItemCost();
			}
		});
		btnChocolatecake.setIcon(new ImageIcon("D:\\semester 6\\SOFTWARE construction LAB  r4 (  maham noor)\\download (4).jfif"));
		btnChocolatecake.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnChocolatecake.setBounds(643, 10, 148, 133);
		panel_1_1.add(btnChocolatecake);
		
		JButton btnMangoJuice = new JButton("");
		btnMangoJuice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem =122.45;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] { "Mango Juice","1",PriceOfItem});
				ItemCost();
			}
		});
		btnMangoJuice.setIcon(new ImageIcon("D:\\semester 6\\SOFTWARE construction LAB  r4 (  maham noor)\\download (8).jfif"));
		btnMangoJuice.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnMangoJuice.setBounds(643, 165, 148, 133);
		panel_1_1.add(btnMangoJuice);
		
		JButton btnSmallPiza = new JButton("");
		btnSmallPiza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem =452.55;
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] { "Small Piza","1",PriceOfItem});
				ItemCost();
			}
		});
		btnSmallPiza.setIcon(new ImageIcon("D:\\semester 6\\SOFTWARE construction LAB  r4 (  maham noor)\\download (13).jfif"));
		btnSmallPiza.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnSmallPiza.setBounds(643, 314, 148, 133);
		panel_1_1.add(btnSmallPiza);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_2.setBounds(10, 513, 1349, 282);
		contentPane.add(panel_1_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 48, 375, 199);
		panel_1_2.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tax");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(28, 32, 58, 42);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SubTotal");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(28, 84, 104, 42);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Total");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(28, 139, 104, 42);
		panel.add(lblNewLabel_1_1);
		
		jtxtsubtotal = new JTextField();
		jtxtsubtotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		jtxtsubtotal.setColumns(10);
		jtxtsubtotal.setBounds(178, 95, 151, 26);
		panel.add(jtxtsubtotal);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		jtxtTotal.setColumns(10);
		jtxtTotal.setBounds(178, 144, 151, 26);
		panel.add(jtxtTotal);
		
		jtxttax = new JTextField();
		jtxttax.setFont(new Font("Tahoma", Font.BOLD, 14));
		jtxttax.setBounds(178, 43, 151, 26);
		panel.add(jtxttax);
		jtxttax.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(395, 48, 375, 199);
		panel_1_2.add(panel_2);
		panel_2.setLayout(null);
		
		jtxtChange = new JTextField();
		jtxtChange.setFont(new Font("Tahoma", Font.BOLD, 14));
		jtxtChange.setColumns(10);
		jtxtChange.setBounds(171, 152, 151, 26);
		panel_2.add(jtxtChange);
		
		JLabel Display = new JLabel("Display");
		Display.setFont(new Font("Tahoma", Font.BOLD, 22));
		Display.setBounds(21, 92, 104, 42);
		panel_2.add(Display);
		
		jtxtDisplay = new JTextField();
		jtxtDisplay.setFont(new Font("Tahoma", Font.BOLD, 14));
		jtxtDisplay.setColumns(10);
		jtxtDisplay.setBounds(171, 103, 151, 26);
		panel_2.add(jtxtDisplay);
		
		JLabel lblChange = new JLabel("Change");
		lblChange.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblChange.setBounds(21, 147, 104, 42);
		panel_2.add(lblChange);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("PayMethod");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_2_1.setBounds(21, 32, 134, 42);
		panel_2.add(lblNewLabel_1_2_1);
		
		JComboBox jcboPayment = new JComboBox();
		jcboPayment.setModel(new DefaultComboBoxModel(new String[] {"", "Cash ", "Visa Card", "Master Card", "Online"}));
		jcboPayment.setBounds(171, 48, 151, 21);
		panel_2.add(jcboPayment);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(780, 48, 559, 199);
		panel_1_2.add(panel_3);
		panel_3.setLayout(null);
		
		JButton jbtnpay = new JButton("Pay");
		jbtnpay.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(jcboPayment.getSelectedItem().equals("Cash "))
				{
				Change();
					
				}
				else
				{
					jtxtChange.setText("");
					jtxtDisplay.setText("");
					
				}
			}
		});
		jbtnpay.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnpay.setBounds(29, 10, 156, 93);
		panel_3.add(jbtnpay);
		
		JButton jbtnremoveitem = new JButton("RemoveItem");
		jbtnremoveitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				int RemoveItem= table.getSelectedRow();
				if(RemoveItem>=0)
				{
					model.removeRow(RemoveItem);
				}
				ItemCost();				
				
				if(jcboPayment.getSelectedItem().equals("cash"))
				{
					Change();
					
				}
				else
				{
					jtxtChange.setText("");
					jtxtDisplay.setText("");
					
				}
			}
		});
		jbtnremoveitem.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnremoveitem.setBounds(29, 113, 253, 76);
		panel_3.add(jbtnremoveitem);
		
		JButton jbtn7exit = new JButton("Exit");
		jbtn7exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame= new JFrame("Exit");
			
				if(JOptionPane.showConfirmDialog(frame, "Confirm you want to exit","Point of Sale", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		jbtn7exit.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtn7exit.setBounds(292, 113, 257, 76);
		panel_3.add(jbtn7exit);
		
		JButton jbtnprint = new JButton("Print");
		jbtnprint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MessageFormat header= new MessageFormat("Printing in progress");
				MessageFormat footer =new MessageFormat("Page{0,number,integer}");
				try
				{
					table.print(JTable.PrintMode.NORMAL,header,footer);
				}
				catch(java.awt.print.PrinterException ex)
				{
					System.err.format("No Printer Found",ex.getMessage());
				}
			}
		});
		jbtnprint.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnprint.setBounds(210, 10, 156, 93);
		panel_3.add(jbtnprint);
		
		JButton jbtnreset = new JButton("Reset");
		jbtnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtDisplay.setText(null);
				jtxtChange.setText(null);
				jtxttax.setText(null);
				jtxtsubtotal.setText(null);
				jtxtTotal.setText(null);
				
				
				DefaultTableModel RecordTable=(DefaultTableModel)table.getModel();
				RecordTable.setRowCount(0);
				}
		});
		jbtnreset.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnreset.setBounds(393, 10, 156, 93);
		panel_3.add(jbtnreset);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(303, 10, 239, 423);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Items", "Qty", "Amount"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(88);
		table.getColumnModel().getColumn(1).setPreferredWidth(60);
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(303, 431, 239, 57);
		contentPane.add(textField);
		textField.setColumns(10);
	}
	
	public void ItemCost() {
	    double sum = 0;
	    double tax = 3.9;

	    try {
	        for (int i = 0; i < table.getRowCount(); i++) {
	            sum += Double.parseDouble(table.getValueAt(i, 2).toString());
	        }

	        jtxtsubtotal.setText(Double.toString(sum));
	        double cTotal = Double.parseDouble(jtxtsubtotal.getText());
	        double cTax = (cTotal * tax) / 100;

	        String iTaxTotal = String.format("Rs %.2f", cTax);
	        jtxttax.setText(iTaxTotal);

	        String iSubTotal = String.format("Rs %.2f", cTotal);
	        jtxtsubtotal.setText(iSubTotal);

	        String iTotal = String.format("Rs %.2f", cTotal + cTax);
	        jtxtTotal.setText(iTotal);
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, "Error in number formatting: " + e.getMessage(), "Number Format Error", JOptionPane.ERROR_MESSAGE);
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}

	//=======================================Functions===============================//

	public void Change() {
	    double sum = 0;
	    double tax = 3.9;

	    try {
	        double cash = Double.parseDouble(jtxtDisplay.getText());

	        for (int i = 0; i < table.getRowCount(); i++) {
	            sum += Double.parseDouble(table.getValueAt(i, 2).toString());
	        }

	        double cTax = (tax * sum) / 100;
	        double cChange = cash - (sum + cTax);
	        String changeGiven = String.format("Rs %.2f", cChange);
	        jtxtChange.setText(changeGiven);
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, "Error in number formatting: " + e.getMessage(), "Number Format Error", JOptionPane.ERROR_MESSAGE);
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}

}