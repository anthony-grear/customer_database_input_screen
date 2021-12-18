package input.screen;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class MainFrame {
	private JFrame mainFrame;
	private JPanel textFieldPanel, checkBoxPanel, radioPanel, comboBoxPanel, radioPanel2;
	private GridBagConstraints gbc;
	private JTextField tfName, tfAge;
	private JComboBox<String> cityCb;
	private JRadioButton rbMale, rbFemale;
	private ButtonGroup myGroup;
	private JCheckBox jCb1, jCb2, jCb3, jCb4, jCb5, jCb6;
	
	
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
		
		radioPanel2 = new JPanel();
		radioPanel2.setBorder(BorderFactory.createTitledBorder("JRadioButton Panel 2"));
		radioPanel2.setBackground(Color.BLUE);
		radioPanel2.setPreferredSize(new Dimension(200,100));
		
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
		
		rbMale = new JRadioButton();
		rbMale.setText("Male");
		rbMale.setOpaque(false);
		rbFemale = new JRadioButton();
		rbFemale.setText("Female");
		rbFemale.setOpaque(false);
		myGroup = new ButtonGroup();
		myGroup.add(rbMale);
		myGroup.add(rbFemale);
		
		jCb1 = new JCheckBox("Running");
		jCb2 = new JCheckBox("Walking");
		jCb3 = new JCheckBox("Biking");
		jCb4 = new JCheckBox("Swimming");
		jCb5 = new JCheckBox("Skiing");
		jCb6 = new JCheckBox("In-Line Skating");
		
		
		
		
		textFieldPanel.add(tfName);
		textFieldPanel.add(tfAge);
		
		comboBoxPanel.add(cityCb);
		radioPanel.add(rbMale);
		radioPanel.add(rbFemale);
		
		checkBoxPanel.add(jCb1);
		checkBoxPanel.add(jCb2);
		checkBoxPanel.add(jCb3);
		checkBoxPanel.add(jCb4);
		checkBoxPanel.add(jCb5);
		checkBoxPanel.add(jCb6);
		
		
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
		gbc.gridx=1;
		gbc.gridy=0;
		mainFrame.getContentPane().add(radioPanel2,gbc);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
}
