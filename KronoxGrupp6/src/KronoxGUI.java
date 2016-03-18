
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
	private final JTextArea textArea_5 = new JTextArea();



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
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		setBounds(0, 0, width, height);

		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labelTime = new JLabel("");
		labelTime.setFont(new Font("Futura", Font.PLAIN, 55));
		labelTime.setBounds(349, 54, 197, 74);
		contentPane.add(labelTime);
		
		JLabel lblProgramcourse = new JLabel("PROGRAM/COURSE");
		lblProgramcourse.setFont(new Font("Futura", Font.PLAIN, 14));
		lblProgramcourse.setForeground(Color.WHITE);
		lblProgramcourse.setBackground(Color.BLACK);
		lblProgramcourse.setBounds(130, 129, 165, 49);
		contentPane.add(lblProgramcourse);
		
		JLabel lblRoom = new JLabel("ROOM");
		lblRoom.setFont(new Font("Futura", Font.PLAIN, 14));
		lblRoom.setForeground(Color.WHITE);
		lblRoom.setBackground(Color.BLACK);
		lblRoom.setBounds(315, 129, 61, 49);
		contentPane.add(lblRoom);
		
		JLabel lblNewLabel = new JLabel("START/END");
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(6, 129, 85, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblInfo = new JLabel("INFO");
		lblInfo.setFont(new Font("Futura", Font.PLAIN, 14));
		lblInfo.setForeground(Color.WHITE);
		lblInfo.setBackground(Color.BLACK);
		lblInfo.setBounds(435, 129, 55, 49);
		contentPane.add(lblInfo);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.BLACK);
		textArea.setBounds(0, 126, 540, 49);
		contentPane.add(textArea);
		
		JLabel lblNiagara = new JLabel("NIAGARA");
		lblNiagara.setFont(new Font("Futura", Font.PLAIN, 50));
		lblNiagara.setBounds(117, 6, 275, 60);
		contentPane.add(lblNiagara);
		
		JLabel lblSchedule = new JLabel("SCHEDULE");
		lblSchedule.setFont(new Font("Futura", Font.PLAIN, 35));
		lblSchedule.setBounds(130, 65, 207, 49);
		contentPane.add(lblSchedule);
		
		labelDate = new JLabel("");
		labelDate.setFont(new Font("Futura", Font.PLAIN, 16));
		labelDate.setBounds(404, 17, 126, 18);
		contentPane.add(labelDate);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/johanneradford/Desktop/Malmö-en1-127x150.png"));
		lblNewLabel_1.setBounds(17, 6, 88, 110);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("08:15-12:00");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Futura", Font.PLAIN, 14));
		label_1.setBackground(Color.BLACK);
		label_1.setBounds(6, 227, 85, 49);
		contentPane.add(label_1);
		
		JLabel label_3 = new JLabel("08:15-12:00");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Futura", Font.PLAIN, 14));
		label_3.setBackground(Color.BLACK);
		label_3.setBounds(6, 328, 85, 49);
		contentPane.add(label_3);
		
		JLabel label_5 = new JLabel("08:15-12:00");
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("Futura", Font.PLAIN, 14));
		label_5.setBackground(Color.BLACK);
		label_5.setBounds(6, 429, 85, 49);
		contentPane.add(label_5);
		
		JLabel label_7 = new JLabel("08:15-12:00");
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("Futura", Font.PLAIN, 14));
		label_7.setBackground(Color.BLACK);
		label_7.setBounds(6, 668, 85, 49);
		contentPane.add(label_7);
		
		
		JLabel lblFredsOchKonfliktvetenskap_1 = new JLabel("");
		lblFredsOchKonfliktvetenskap_1.setForeground(Color.BLACK);
		lblFredsOchKonfliktvetenskap_1.setFont(new Font("Futura", Font.PLAIN, 10));
		lblFredsOchKonfliktvetenskap_1.setBackground(Color.BLACK);
		lblFredsOchKonfliktvetenskap_1.setBounds(103, 219, 221, 34);
		contentPane.add(lblFredsOchKonfliktvetenskap_1);
		lblFredsOchKonfliktvetenskap_1.setText("Byggingenjör,\nProjekt- och produktionsledning\n");
		
		
		JLabel lblCe_1 = new JLabel("C0E11");
		lblCe_1.setForeground(Color.BLACK);
		lblCe_1.setFont(new Font("Futura", Font.PLAIN, 13));
		lblCe_1.setBackground(Color.BLACK);
		lblCe_1.setBounds(315, 220, 61, 49);
		contentPane.add(lblCe_1);
		
		JLabel lblFrelsningFackverkI = new JLabel("Föreläsning: Fackverk I");
		lblFrelsningFackverkI.setForeground(Color.BLACK);
		lblFrelsningFackverkI.setFont(new Font("Futura", Font.PLAIN, 10));
		lblFrelsningFackverkI.setBackground(Color.BLACK);
		lblFrelsningFackverkI.setBounds(394, 221, 146, 41);
		contentPane.add(lblFrelsningFackverkI);
		
		
		
		JLabel label = new JLabel("08:15-12:00");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Futura", Font.PLAIN, 14));
		label.setBackground(Color.BLACK);
		label.setBounds(6, 174, 85, 49);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("08:15-12:00");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Futura", Font.PLAIN, 14));
		label_2.setBackground(Color.BLACK);
		label_2.setBounds(6, 281, 85, 49);
		contentPane.add(label_2);
		
		JLabel label_4 = new JLabel("08:15-12:00");
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Futura", Font.PLAIN, 14));
		label_4.setBackground(Color.BLACK);
		label_4.setBounds(6, 374, 85, 49);
		contentPane.add(label_4);
		
		JLabel label_6 = new JLabel("08:15-12:00");
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Futura", Font.PLAIN, 14));
		label_6.setBackground(Color.BLACK);
		label_6.setBounds(6, 490, 85, 41);
		contentPane.add(label_6);
		
		JLabel lblFredsOchKonfliktvetenskap = new JLabel("Freds- och konfliktvetenskap");
		lblFredsOchKonfliktvetenskap.setForeground(Color.BLACK);
		lblFredsOchKonfliktvetenskap.setFont(new Font("Futura", Font.PLAIN, 10));
		lblFredsOchKonfliktvetenskap.setBackground(Color.BLACK);
		lblFredsOchKonfliktvetenskap.setBounds(103, 174, 165, 34);
		contentPane.add(lblFredsOchKonfliktvetenskap);
		
		JLabel lblA = new JLabel("A0513");
		lblA.setForeground(Color.BLACK);
		lblA.setFont(new Font("Futura", Font.PLAIN, 13));
		lblA.setBackground(Color.BLACK);
		lblA.setBounds(315, 174, 61, 49);
		contentPane.add(lblA);
		
		JLabel lblObligatorySeminar = new JLabel("Obligatory seminar (1 ECTS)");
		lblObligatorySeminar.setForeground(Color.BLACK);
		lblObligatorySeminar.setFont(new Font("Futura", Font.PLAIN, 10));
		lblObligatorySeminar.setBackground(Color.BLACK);
		lblObligatorySeminar.setBounds(394, 175, 146, 49);
		contentPane.add(lblObligatorySeminar);
		
		JLabel lblCe = new JLabel("B0305");
		lblCe.setForeground(Color.BLACK);
		lblCe.setFont(new Font("Futura", Font.PLAIN, 13));
		lblCe.setBackground(Color.BLACK);
		lblCe.setBounds(315, 281, 61, 49);
		contentPane.add(lblCe);
		
		JLabel lblNic = new JLabel("C0319");
		lblNic.setForeground(Color.BLACK);
		lblNic.setFont(new Font("Futura", Font.PLAIN, 13));
		lblNic.setBackground(Color.BLACK);
		lblNic.setBounds(315, 328, 61, 49);
		contentPane.add(lblNic);
		
		JLabel lblC = new JLabel("C0205");
		lblC.setForeground(Color.BLACK);
		lblC.setFont(new Font("Futura", Font.PLAIN, 13));
		lblC.setBackground(Color.BLACK);
		lblC.setBounds(315, 371, 61, 49);
		contentPane.add(lblC);
		
		JLabel lblA_1 = new JLabel("A0510");
		lblA_1.setForeground(Color.BLACK);
		lblA_1.setFont(new Font("Futura", Font.PLAIN, 13));
		lblA_1.setBackground(Color.BLACK);
		lblA_1.setBounds(315, 429, 61, 49);
		contentPane.add(lblA_1);
		
		JLabel lblBe = new JLabel("B0E15");
		lblBe.setForeground(Color.BLACK);
		lblBe.setFont(new Font("Futura", Font.PLAIN, 13));
		lblBe.setBackground(Color.BLACK);
		lblBe.setBounds(315, 668, 61, 49);
		contentPane.add(lblBe);
		
		JLabel lblByggteknikTeknikOch = new JLabel("Byggteknik, Teknik och arkitektur");
		lblByggteknikTeknikOch.setForeground(Color.BLACK);
		lblByggteknikTeknikOch.setFont(new Font("Futura", Font.PLAIN, 10));
		lblByggteknikTeknikOch.setBackground(Color.BLACK);
		lblByggteknikTeknikOch.setBounds(103, 235, 165, 34);
		contentPane.add(lblByggteknikTeknikOch);

		
		JLabel lblHusbyggnadTeknik = new JLabel("- Husbyggnad, teknik och funktion");
		lblHusbyggnadTeknik.setForeground(Color.BLACK);
		lblHusbyggnadTeknik.setFont(new Font("Futura", Font.PLAIN, 10));
		lblHusbyggnadTeknik.setBackground(Color.BLACK);
		lblHusbyggnadTeknik.setBounds(103, 251, 252, 34);
		contentPane.add(lblHusbyggnadTeknik);
		
		
		JTextArea txtrByggingenjrProjektOch = new JTextArea();
		txtrByggingenjrProjektOch.setText("Transport Management\n- Transporter och hållbar utveckling");
		txtrByggingenjrProjektOch.setBackground(new Color(255, 228, 225));
		txtrByggingenjrProjektOch.setFont(new Font("Futura", Font.PLAIN, 10));
		txtrByggingenjrProjektOch.setBounds(103, 333, 221, 34);
		contentPane.add(txtrByggingenjrProjektOch);
		
		JTextArea txtrFrelsningFackverkI = new JTextArea();
		txtrFrelsningFackverkI.setBackground(new Color(255, 228, 225));
		txtrFrelsningFackverkI.setText("Seminarium halva klassen:\nmiljöledning i transportföretag");
		txtrFrelsningFackverkI.setFont(new Font("Futura", Font.PLAIN, 10));
		txtrFrelsningFackverkI.setBounds(394, 333, 120, 34);
		contentPane.add(txtrFrelsningFackverkI);
		
		JTextArea txtrInternationalProgrammeFor = new JTextArea();
		txtrInternationalProgrammeFor.setText("International Programme for European \nStudies\n-Urban Images in Literature and Film");
		txtrInternationalProgrammeFor.setFont(new Font("Futura", Font.PLAIN, 10));
		txtrInternationalProgrammeFor.setBackground(new Color(255, 228, 225));
		txtrInternationalProgrammeFor.setBounds(103, 432, 221, 56);
		contentPane.add(txtrInternationalProgrammeFor);
		
		JTextArea txtrUrbanImagesIn = new JTextArea();
		txtrUrbanImagesIn.setText("Seminar 3\t");
		txtrUrbanImagesIn.setFont(new Font("Futura", Font.PLAIN, 10));
		txtrUrbanImagesIn.setBackground(new Color(255, 228, 225));
		txtrUrbanImagesIn.setBounds(394, 436, 120, 34);
		contentPane.add(txtrUrbanImagesIn);
	
		JTextArea txtrFrgestundInfrSaltenta = new JTextArea();
		txtrFrgestundInfrSaltenta.setText("Frågestund inför saltenta.\nÅterkoppling till övning om \ngranskning av C-Uppsats.");
		txtrFrgestundInfrSaltenta.setFont(new Font("Futura", Font.PLAIN, 10));
		txtrFrgestundInfrSaltenta.setBackground(new Color(255, 228, 225));
		txtrFrgestundInfrSaltenta.setBounds(394, 668, 142, 43);
		contentPane.add(txtrFrgestundInfrSaltenta);
		
		JTextArea txtrSocionomprogrammetForskningsmetodik = new JTextArea();
		txtrSocionomprogrammetForskningsmetodik.setText("Socionomprogrammet\n- Forskningsmetodik\n");
		txtrSocionomprogrammetForskningsmetodik.setFont(new Font("Futura", Font.PLAIN, 10));
		txtrSocionomprogrammetForskningsmetodik.setBackground(new Color(255, 228, 225));
		txtrSocionomprogrammetForskningsmetodik.setBounds(103, 668, 177, 41);
		contentPane.add(txtrSocionomprogrammetForskningsmetodik);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setForeground(Color.PINK);
		textArea_1.setBackground(new Color(255, 228, 225));
		textArea_1.setBounds(0, 220, 540, 65);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setForeground(Color.PINK);
		textArea_2.setBackground(new Color(255, 228, 225));
		textArea_2.setBounds(0, 328, 540, 44);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setForeground(Color.PINK);
		textArea_3.setBackground(new Color(255, 228, 225));
		textArea_3.setBounds(0, 661, 540, 56);
		contentPane.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setForeground(Color.PINK);
		textArea_4.setBackground(new Color(255, 228, 225));
		textArea_4.setBounds(0, 428, 540, 60);
		contentPane.add(textArea_4);
		
		JLabel lblFredsOchKonfliktvetenskap_11 = new JLabel("- Freds- och konfliktvetenskap III");
		lblFredsOchKonfliktvetenskap_11.setForeground(Color.BLACK);
		lblFredsOchKonfliktvetenskap_11.setFont(new Font("Futura", Font.PLAIN, 10));
		lblFredsOchKonfliktvetenskap_11.setBackground(Color.BLACK);
		lblFredsOchKonfliktvetenskap_11.setBounds(103, 190, 165, 34);
		contentPane.add(lblFredsOchKonfliktvetenskap_11);
		
		JTextArea txtrVerksamhetsfrlagdUtbildning = new JTextArea();
		txtrVerksamhetsfrlagdUtbildning.setFont(new Font("Futura", Font.PLAIN, 10));
		txtrVerksamhetsfrlagdUtbildning.setText("Verksamhetsförlagd utbildning\nVFU\n");
		txtrVerksamhetsfrlagdUtbildning.setBounds(103, 296, 151, 34);
		contentPane.add(txtrVerksamhetsfrlagdUtbildning);
		
		JTextArea txtrVisuellKommunikation = new JTextArea();
		txtrVisuellKommunikation.setText("Visuell kommunikation\n- Visuell kommunikation: Examensarbete");
		txtrVisuellKommunikation.setFont(new Font("Futura", Font.PLAIN, 10));
		txtrVisuellKommunikation.setBounds(103, 386, 187, 34);
		contentPane.add(txtrVisuellKommunikation);
		
		JTextArea txtrUppsatsSeminar = new JTextArea();
		txtrUppsatsSeminar.setText("50% Uppsats seminar\t");
		txtrUppsatsSeminar.setFont(new Font("Futura", Font.PLAIN, 10));
		txtrUppsatsSeminar.setBounds(394, 379, 146, 44);
		contentPane.add(txtrUppsatsSeminar);
		
		JTextArea txtrDatavetenskapOchApplikationsutveckling = new JTextArea();
		txtrDatavetenskapOchApplikationsutveckling.setText("Datavetenskap och applikationsutveckling, \nInformationsarkitekt, Spelutveckling,\nSystemutvecklare\n- Systemutveckling och projekt I\n");
		txtrDatavetenskapOchApplikationsutveckling.setFont(new Font("Futura", Font.PLAIN, 10));
		txtrDatavetenskapOchApplikationsutveckling.setBounds(103, 504, 187, 79);
		contentPane.add(txtrDatavetenskapOchApplikationsutveckling);
		
		JTextArea txtrProjektarbeteOchHandledning = new JTextArea();
		txtrProjektarbeteOchHandledning.setText("Projektarbete och handledning");
		txtrProjektarbeteOchHandledning.setFont(new Font("Futura", Font.PLAIN, 10));
		txtrProjektarbeteOchHandledning.setBounds(394, 504, 146, 34);
		contentPane.add(txtrProjektarbeteOchHandledning);
		
		JTextArea txtrAAB = new JTextArea();
		txtrAAB.setFont(new Font("Futura", Font.PLAIN, 13));
		txtrAAB.setText("A0304\nA0322\nB0203\nB0303\nB0321\nC0306\nC0309\nC0312\nC0325");
		txtrAAB.setBounds(315, 494, 55, 162);
		contentPane.add(txtrAAB);
		textArea_5.setBounds(103, 721, 98, 60);
		contentPane.add(textArea_5);
		
		
		
		
		
	
	
				
		clockKronox = new ClockKronox(this);
		
		
	}
	private void setBounds(int x2, int y, double width, double height) {
		// TODO Auto-generated method stub
		
	}
}
