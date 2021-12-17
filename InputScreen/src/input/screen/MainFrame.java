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
	private JPanel textBoxPanel;
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
		
		textBoxPanel = new JPanel();
		textBoxPanel.setBorder(BorderFactory.createTitledBorder("JTextBox Panel"));
		textBoxPanel.setBackground(Color.RED);
		textBoxPanel.setPreferredSize(new Dimension(300,200));
		
		gbc = new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		mainFrame.getContentPane().add(textBoxPanel,gbc);
//		mainFrame.pack();
		mainFrame.setVisible(true);
	}
}
