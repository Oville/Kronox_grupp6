
import java.util.Calendar;

import javax.swing.JOptionPane;

public class ClockLogic {

	private ClockLogic digitalClockGUI;
	
	private  DigitalClockGUI digClockGUI;

	
	public ClockLogic (DigitalClockGUI digitalClockGUI){
		this.digClockGUI = digitalClockGUI;
		ClockThread clockTread = new ClockThread();
		clockTread.start();
		
	}
	

		
	
	

	
	public static String addZero(int i){
		String s = String.valueOf(i);
		if( s.length() == 1) {
			s="0" + s;
		}
		return s;
	}
	
	private class ClockThread extends Thread{
		@Override
		public void run() {
			while(true){
				
				Calendar c = Calendar.getInstance();
				int hour = c.get(Calendar.HOUR_OF_DAY);
				int min = c.get(Calendar.MINUTE);
				int second = c.get(Calendar.SECOND);
				int day = c.get(Calendar.DATE);
				int month = c.get(Calendar.MONTH);
				int year = c.get(Calendar.YEAR);
				
				digClockGUI.setDateOnLabel(addZero(day) + " : "+ addZero(month + 1) + " : " + addZero(year));

				digClockGUI.setTimeOnLabel(addZero(hour) + " : "+ addZero(min) + " : " + addZero(second));
				
				
			
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					
					return;
				}
				
			
			}
			
			
		}

			
			
	}
	


		
	}

