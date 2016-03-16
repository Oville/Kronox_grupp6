import java.awt.BorderLayout;
import java.util.Calendar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.ImageIcon;

public class KronoxGUI extends JFrame {

	private JPanel contentPane;
	private JLabel timeLable;
	private JLabel dateLable;
	private ClockKronox clockKronox;

	public void setTimeOnLabel(String time){
		timeLable.setText(time);
	}
	public void setDateOnLabel(String date){
		dateLable.setText(date);
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 540, 960);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		timeLable = new JLabel("");
		timeLable.setFont(new Font("Futura", Font.PLAIN, 55));
		timeLable.setBounds(343, 75, 197, 74);
		contentPane.add(timeLable);
		
		JLabel programLable = new JLabel("PROGRAM/COURSE");
		programLable.setFont(new Font("Futura", Font.PLAIN, 14));
		programLable.setForeground(Color.WHITE);
		programLable.setBackground(Color.BLACK);
		programLable.setBounds(138, 161, 154, 49);
		contentPane.add(programLable);
		
		JLabel roomLable = new JLabel("ROOM");
		roomLable.setFont(new Font("Futura", Font.PLAIN, 14));
		roomLable.setForeground(Color.WHITE);
		roomLable.setBackground(Color.BLACK);
		roomLable.setBounds(315, 161, 61, 49);
		contentPane.add(roomLable);
		
		JLabel startEndLable = new JLabel("START/END");
		startEndLable.setFont(new Font("Futura", Font.PLAIN, 14));
		startEndLable.setForeground(Color.WHITE);
		startEndLable.setBackground(Color.BLACK);
		startEndLable.setBounds(20, 161, 85, 49);
		contentPane.add(startEndLable);
		
		JLabel infoLable = new JLabel("INFO");
		infoLable.setFont(new Font("Futura", Font.PLAIN, 14));
		infoLable.setForeground(Color.WHITE);
		infoLable.setBackground(Color.BLACK);
		infoLable.setBounds(435, 161, 55, 49);
		contentPane.add(infoLable);
		
		JTextArea textArea_black = new JTextArea();
		textArea_black.setBackground(Color.BLACK);
		textArea_black.setBounds(0, 161, 540, 49);
		contentPane.add(textArea_black);
		
		JLabel niagaraLable = new JLabel("NIAGARA");
		niagaraLable.setFont(new Font("Futura", Font.PLAIN, 50));
		niagaraLable.setBounds(117, 16, 275, 60);
		contentPane.add(niagaraLable);
		
		JLabel scheduleLable = new JLabel("SCHEDULE");
		scheduleLable.setFont(new Font("Futura", Font.PLAIN, 35));
		scheduleLable.setBounds(117, 71, 207, 49);
		contentPane.add(scheduleLable);
		
		dateLable = new JLabel("");
		dateLable.setFont(new Font("Futura", Font.PLAIN, 16));
		dateLable.setBounds(408, 58, 126, 18);
		contentPane.add(dateLable);
		
		JLabel startEnd1 = new JLabel("startEnd1");
		startEnd1.setBounds(10, 222, 95, 16);
		contentPane.add(startEnd1);
		
		JLabel startEnd14 = new JLabel("startEnd14");
		startEnd14.setBounds(6, 633, 78, 16);
		contentPane.add(startEnd14);
		
		JLabel startEnd16 = new JLabel("startEnd16");
		startEnd16.setBounds(6, 695, 74, 16);
		contentPane.add(startEnd16);
		
		JLabel startEnd10 = new JLabel("startEnd10");
		startEnd10.setBounds(6, 503, 68, 16);
		contentPane.add(startEnd10);
		
		JLabel startEnd13 = new JLabel("startEnd13");
		startEnd13.setBounds(10, 601, 68, 16);
		contentPane.add(startEnd13);
		
		JLabel startEnd2 = new JLabel("startEnd2");
		startEnd2.setBounds(9, 251, 61, 16);
		contentPane.add(startEnd2);
		
		JLabel startEnd17 = new JLabel("startEnd17");
		startEnd17.setBounds(6, 726, 78, 16);
		contentPane.add(startEnd17);
		//hej
		
		JLabel startEnd3 = new JLabel("startEnd3");
		startEnd3.setBounds(4, 281, 61, 16);
		contentPane.add(startEnd3);
		
		JLabel startEnd15 = new JLabel("startEnd15");
		startEnd15.setBounds(10, 657, 78, 16);
		contentPane.add(startEnd15);
		
		JLabel startEnd12 = new JLabel("startEnd12");
		startEnd12.setBounds(6, 569, 77, 16);
		contentPane.add(startEnd12);
		
		JLabel startEnd11 = new JLabel("startEnd11");
		startEnd11.setBounds(10, 530, 68, 16);
		contentPane.add(startEnd11);
		
		JLabel startEnd4 = new JLabel("startEnd4");
		startEnd4.setBounds(6, 319, 61, 16);
		contentPane.add(startEnd4);
		
		JLabel startEnd9 = new JLabel("startEnd9");
		startEnd9.setBounds(6, 475, 61, 16);
		contentPane.add(startEnd9);
		
		JLabel startEnd8 = new JLabel("startEnd8");
		startEnd8.setBounds(6, 436, 61, 16);
		contentPane.add(startEnd8);
		
		JLabel startEnd7 = new JLabel("startEnd7");
		startEnd7.setBounds(10, 414, 61, 16);
		contentPane.add(startEnd7);
		
		JLabel startEnd5 = new JLabel("startEnd5");
		startEnd5.setBounds(10, 343, 61, 16);
		contentPane.add(startEnd5);
		
		JLabel startEnd6 = new JLabel("startEnd6");
		startEnd6.setBounds(6, 378, 61, 16);
		contentPane.add(startEnd6);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(new Color(255, 228, 225));
		textArea_1.setBounds(0, 247, 540, 31);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBackground(new Color(255, 228, 225));
		textArea_2.setBounds(0, 309, 540, 31);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBackground(new Color(255, 228, 225));
		textArea_3.setBounds(0, 371, 540, 31);
		contentPane.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBackground(new Color(255, 228, 225));
		textArea_4.setBounds(0, 433, 540, 31);
		contentPane.add(textArea_4);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBackground(new Color(255, 228, 225));
		textArea_5.setBounds(0, 493, 540, 31);
		contentPane.add(textArea_5);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBackground(new Color(255, 228, 225));
		textArea_6.setBounds(0, 558, 540, 31);
		contentPane.add(textArea_6);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setBackground(new Color(255, 228, 225));
		textArea_7.setBounds(0, 622, 540, 31);
		contentPane.add(textArea_7);
		
		JTextArea textArea_8 = new JTextArea();
		textArea_8.setBackground(new Color(255, 228, 225));
		textArea_8.setBounds(0, 685, 540, 31);
		contentPane.add(textArea_8);
		
		clockKronox = new ClockKronox(this);
	}
}
