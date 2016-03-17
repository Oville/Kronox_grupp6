
import java.awt.BorderLayout;
import java.util.Calendar;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.Timer;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import java.awt.Image.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.*;


public class KronoxGUI extends JFrame {

	
	private JPanel contentPane;
	private JLabel labelTime;
	private JLabel labelDate;
	private ClockKronox clockKronox;
	
	JLabel pic;
	Timer tm;
	int x = 0;
	
	String[] list = {
			"/Users/johanneradford/Desktop/1.png",
			"/Users/johanneradford/Desktop/2.png",
	};
	
	
	



	public void setTimeOnLabel(String time){
		labelTime.setText(time);
	}
	public void setDateOnLabel(String date){
		labelDate.setText(date);
		
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new KronoxGUI();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KronoxGUI frame = new KronoxGUI();
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
	public KronoxGUI() {
	
			super("Java SlideShow");
			pic = new JLabel();
			pic.setBounds(0, 30, 100, 100);
			//SetImageSize(1);
			
			tm = new Timer(5000, new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					//SetImageSize(x);
					x += 1;
					if(x >= list.length)
						x = 0;

				}
				
				
			} );
			
			getContentPane().add(pic);
			tm.start();
			getContentPane().setLayout(null);
			setSize(100,100);
			
		

	

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 540, 960);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labelTime = new JLabel("");
		labelTime.setFont(new Font("Futura", Font.PLAIN, 55));
		labelTime.setBounds(321, 75, 197, 74);
		contentPane.add(labelTime);
		
		JLabel lblProgramcourse = new JLabel("PROGRAM/COURSE");
		lblProgramcourse.setFont(new Font("Futura", Font.PLAIN, 14));
		lblProgramcourse.setForeground(Color.WHITE);
		lblProgramcourse.setBackground(Color.BLACK);
		lblProgramcourse.setBounds(130, 161, 377, 49);
		contentPane.add(lblProgramcourse);
		
		JLabel lblRoom = new JLabel("ROOM");
		lblRoom.setFont(new Font("Futura", Font.PLAIN, 14));
		lblRoom.setForeground(Color.WHITE);
		lblRoom.setBackground(Color.BLACK);
		lblRoom.setBounds(315, 161, 61, 49);
		contentPane.add(lblRoom);
		
		JLabel lblNewLabel = new JLabel("START/END");
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(6, 161, 85, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblInfo = new JLabel("INFO");
		lblInfo.setFont(new Font("Futura", Font.PLAIN, 14));
		lblInfo.setForeground(Color.WHITE);
		lblInfo.setBackground(Color.BLACK);
		lblInfo.setBounds(435, 161, 55, 49);
		contentPane.add(lblInfo);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.BLACK);
		textArea.setBounds(0, 158, 540, 49);
		contentPane.add(textArea);
		
		JLabel lblNiagara = new JLabel("NIAGARA");
		lblNiagara.setFont(new Font("Futura", Font.PLAIN, 50));
		lblNiagara.setBounds(117, 16, 275, 60);
		contentPane.add(lblNiagara);
		
		JLabel lblSchedule = new JLabel("SCHEDULE");
		lblSchedule.setFont(new Font("Futura", Font.PLAIN, 35));
		lblSchedule.setBounds(130, 75, 207, 49);
		contentPane.add(lblSchedule);
		
		labelDate = new JLabel("");
		labelDate.setFont(new Font("Futura", Font.PLAIN, 16));
		labelDate.setBounds(408, 58, 126, 18);
		contentPane.add(labelDate);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/johanneradford/Desktop/Malmö-en1-127x150.png"));
		lblNewLabel_1.setBounds(17, 16, 88, 110);
		contentPane.add(lblNewLabel_1);
	
		
      
		
		clockKronox = new ClockKronox(this);
		
		
	}
	
}
