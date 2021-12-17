package input.screen;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {
	private JFrame mainFrame;
	private JPanel textFieldPanel, checkBoxPanel, radioPanel;
	private GridBagConstraints gbc;
	
	
	public MainFrame() {
		initialize();		
	}
	
	private void initialize() {
		mainFrame = new JFrame();
//		mainFrame.setLayout(new BorderLayout(10,5));
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
		
		checkBoxPanel = new JPanel();
		checkBoxPanel.setBorder(BorderFactory.createTitledBorder("JCheckBox Panel"));
		checkBoxPanel.setBackground(Color.GREEN);
		checkBoxPanel.setPreferredSize(new Dimension(200,100));
		
		radioPanel = new JPanel();
		radioPanel.setBorder(BorderFactory.createTitledBorder("JRadioButton Panel"));
		radioPanel.setBackground(Color.CYAN);
		radioPanel.setPreferredSize(new Dimension(200,100));
		
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
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
}
