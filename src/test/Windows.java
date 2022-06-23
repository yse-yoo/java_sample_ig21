package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Windows {

	private JLabel label;
	
	private JTextField textField;
	
	private JButton button;
	
	public void init() {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(textField.getText());
			}
		});
	}
}
