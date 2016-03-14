import java.util.Calendar;

	import javax.swing.JOptionPane;
	
public class ClockKronox {
	

		private ClockKronox digitalKronoxGUI;
		private int alarmHour;
		private int alarmMinute;
		private  KronoxGUI digKronoxGUI;

		
		public ClockKronox (KronoxGUI digitalKronoxGUI){
			this.digKronoxGUI = digitalKronoxGUI;
			ClockThread clockThread = new ClockThread();
			clockThread.start();
			
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
				
					//String time = addZero(hour) + " : "+ addZero(min) + " : " + addZero(second);
					digKronoxGUI.setTimeOnLabel(addZero(hour) + " : "+ addZero(min) + " : " + addZero(second));
					
					//System.out.println(time);
					
					
				
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




