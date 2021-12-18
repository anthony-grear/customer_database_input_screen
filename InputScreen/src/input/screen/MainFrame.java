package input.screen;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class MainFrame {
	private JFrame mainFrame;
	private JPanel textFieldPanel, checkBoxPanel, radioPanel, comboBoxPanel;
	private GridBagConstraints gbc;
	private JTextField tfName, tfAge;
	private JComboBox<String> cityCb;
	
	
	public MainFrame() {
		initialize();		
	}
	
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setTitle("Customer Database Input Screen");
		mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mainFrame.setSize(900,600);
		mainFrame.setResizable(false);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.getContentPane().setLayout(new GridBagLayout());
		
		textFieldPanel = new JPanel();
		textFieldPanel.setBorder(BorderFactory.createTitledBorder("JTextField Panel"));
		textFieldPanel.setBackground(Color.RED);
		textFieldPanel.setPreferredSize(new Dimension(200,100));
		textFieldPanel.setLayout(new FlowLayout());
		
		checkBoxPanel = new JPanel();
		checkBoxPanel.setBorder(BorderFactory.createTitledBorder("JCheckBox Panel"));
		checkBoxPanel.setBackground(Color.GREEN);
		checkBoxPanel.setPreferredSize(new Dimension(200,100));
		
		radioPanel = new JPanel();
		radioPanel.setBorder(BorderFactory.createTitledBorder("JRadioButton Panel"));
		radioPanel.setBackground(Color.CYAN);
		radioPanel.setPreferredSize(new Dimension(200,100));
		
		comboBoxPanel = new JPanel();
		comboBoxPanel.setBorder(BorderFactory.createTitledBorder("JComboBox Panel"));
		comboBoxPanel.setBackground(Color.YELLOW);
		comboBoxPanel.setPreferredSize(new Dimension(200,100));
		
		tfName = new JTextField(10);
		tfName.setText("Full Name");
		tfAge = new JTextField(10);
		tfAge.setText("Age");
		
		cityCb = new JComboBox<String>();
		cityCb.addItem("Cincinnati");
		cityCb.addItem("Cleveland");
		cityCb.addItem("Columbus");
		cityCb.addItem("Akron");
		cityCb.addItem("Canton");
		cityCb.addItem("Toledo");
		cityCb.addItem("Dayton");
		
		textFieldPanel.add(tfName);
		textFieldPanel.add(tfAge);
		
		comboBoxPanel.add(cityCb);
		
		
		
		gbc = new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		mainFrame.getContentPane().add(textFieldPanel,gbc);
		gbc.gridx=1;
		gbc.gridy=1;
		mainFrame.getContentPane().add(checkBoxPanel,gbc);
		gbc.gridx=2;
		gbc.gridy=2;
		mainFrame.getContentPane().add(radioPanel,gbc);
		gbc.gridx=0;
		gbc.gridy=1;
		mainFrame.getContentPane().add(comboBoxPanel,gbc);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
}
