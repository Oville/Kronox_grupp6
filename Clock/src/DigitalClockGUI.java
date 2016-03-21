import java.awt.BorderLayout;
import java.util.Calendar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private ClockLogic clockLogic;
	private JLabel labelTime;
	private JLabel labelDate;

	
public void setTimeOnLabel(String time){
	labelTime.setText(time);
}

public void setDateOnLabel(String date){
	labelDate.setText(date);
	
}

	
		

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 373, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labelTime = new JLabel("");
		labelTime.setFont(new Font("Avenir", Font.PLAIN, 25));
		labelTime.setBounds(203, 187, 164, 69);
		contentPane.add(labelTime);
		
		labelDate = new JLabel("");
		labelDate.setBounds(6, 175, 134, 81);
		contentPane.add(labelDate);
		
		clockLogic = new ClockLogic(this);
		
		
	}
}
