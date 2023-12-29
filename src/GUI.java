import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI implements ActionListener {
	
	boolean topCount = false;
	//declared here
	JLabel label;
	JButton button;
	
	public GUI() {
		
		//JFrame object
		JFrame frame = new JFrame();
		//JPanel object
		JPanel panel = new JPanel();
		
		button = new JButton("Bottom Text");//top
		//use button object
		button.addActionListener(this);//refers to GUI class
		//button.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
		
		//now externally declared
		label = new JLabel("Top Text");//bottom
		
		//parameter/argument is border object
		//top, bottom, left, right
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		//layout manager object
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Test Menu");
		//set window to match certain size
		frame.pack();
		frame.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new GUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(topCount) {

			label.setText("Top Text");
			button.setText("Bottom Text");
			topCount = false;
		
		}
		else {
			
			label.setText("Bottom Text");
			button.setText("Top Text");
			topCount = true;
			
		}
		
	}

}
