import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	
	private JLabel id_label;
	private JLabel pass_label;
	private JFrame frame;
	private JPanel panel;
	private JPanel panel2;
	private JTextField id_txt;
	private JTextField pass_txt;
	
	public GUI() {
		frame = new JFrame();
		
		JButton button = new JButton("Login");
		button.addActionListener(this);
		button.setSize(new Dimension(100,10));

		
		id_label = new JLabel("ID");
		id_label.setPreferredSize(new Dimension(80,10));
		
		pass_label =  new JLabel("PASSWORD");
		pass_label.setPreferredSize(new Dimension(80,10));
		
		id_txt = new JTextField(20);
		pass_txt = new JTextField(20);
		
		
		panel = new JPanel();
		
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30)); 
		panel.setLayout(new GridLayout(2,1));
		panel.add(id_label);
		panel.add(id_txt);	
		panel.add(pass_label);
		panel.add(pass_txt);	
		//panel.add(button);
		
		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1,1));
		
		panel2.add(button);
		
		
		
		
		//frame.add(panel, BorderLayout.CENTER);
		//frame.add(panel);
		//frame.add(panel2);
		frame.add(panel, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.SOUTH);
		frame.setSize(300,300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String id = id_txt.getText();
		String password = pass_txt.getText();
		//System.out.println(id+", "+password);
		
		if(id.equals("lovekwon200") && password.equals("kjh233!!")) {
			JOptionPane.showMessageDialog(null, "SUCCESS");
		}else {
			JOptionPane.showMessageDialog(null, "FAIL");
		}
	}
}



























