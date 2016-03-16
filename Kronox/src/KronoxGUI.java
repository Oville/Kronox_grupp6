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
	private JLabel labelTime;
	private JLabel labelDate;
	private ClockKronox clockKronox;

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
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("/Users/johanneradford/Desktop/Malmö-en1-127x150.png"));
		label_1.setBounds(20, 6, 85, 124);
		contentPane.add(label_1);
		
		labelTime = new JLabel("");
		labelTime.setFont(new Font("Futura", Font.PLAIN, 55));
		labelTime.setBounds(343, 75, 197, 74);
		contentPane.add(labelTime);
		
		JLabel lblProgramcourse = new JLabel("PROGRAM/COURSE");
		lblProgramcourse.setFont(new Font("Futura", Font.PLAIN, 14));
		lblProgramcourse.setForeground(Color.WHITE);
		lblProgramcourse.setBackground(Color.BLACK);
		lblProgramcourse.setBounds(138, 161, 377, 49);
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
		lblNewLabel.setBounds(20, 161, 85, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblInfo = new JLabel("INFO");
		lblInfo.setFont(new Font("Futura", Font.PLAIN, 14));
		lblInfo.setForeground(Color.WHITE);
		lblInfo.setBackground(Color.BLACK);
		lblInfo.setBounds(435, 161, 55, 49);
		contentPane.add(lblInfo);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.BLACK);
		textArea.setBounds(0, 161, 540, 49);
		contentPane.add(textArea);
		
		JLabel lblNiagara = new JLabel("NIAGARA");
		lblNiagara.setFont(new Font("Futura", Font.PLAIN, 50));
		lblNiagara.setBounds(117, 16, 275, 60);
		contentPane.add(lblNiagara);
		
		JLabel lblSchedule = new JLabel("SCHEDULE");
		lblSchedule.setFont(new Font("Futura", Font.PLAIN, 35));
		lblSchedule.setBounds(117, 71, 207, 49);
		contentPane.add(lblSchedule);
		
		labelDate = new JLabel("");
		labelDate.setFont(new Font("Futura", Font.PLAIN, 16));
		labelDate.setBounds(408, 58, 126, 18);
		contentPane.add(labelDate);
		
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
		
		JLabel lblMaskinOchMaterialteknik = new JLabel("Maskin- och materialteknik:\n\n");
		lblMaskinOchMaterialteknik.setFont(new Font("Futura", Font.PLAIN, 12));
		lblMaskinOchMaterialteknik.setBounds(127, 212, 166, 23);
		contentPane.add(lblMaskinOchMaterialteknik);
		
		JLabel label_2 = new JLabel("10:15 - 12:00");
		label_2.setFont(new Font("Futura", Font.PLAIN, 13));
		label_2.setBounds(10, 220, 109, 16);
		contentPane.add(label_2);
		
		JLabel lblA = new JLabel("A0407\n");
		lblA.setFont(new Font("Futura", Font.PLAIN, 13));
		lblA.setBounds(315, 221, 55, 16);
		contentPane.add(lblA);
		
		JLabel label_4 = new JLabel("");
		label_4.setFont(new Font("Futura", Font.PLAIN, 13));
		label_4.setBounds(408, 219, 109, 16);
		contentPane.add(label_4);
		
		JLabel lblNewLabel_1 = new JLabel("  Företag och företagande");
		lblNewLabel_1.setFont(new Font("Futura", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(125, 227, 168, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Språket i Affärsplanen");
		lblNewLabel_2.setFont(new Font("Futura", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(394, 222, 146, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("10:15 - 12:00");
		label.setFont(new Font("Futura", Font.PLAIN, 13));
		label.setBounds(0, 258, 109, 16);
		contentPane.add(label);
		
		clockKronox = new ClockKronox(this);
	}
}
