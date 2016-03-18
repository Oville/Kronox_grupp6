
public class Parser {

	private String lokal;
	private String kurs;
	private String endTime;
	private String startTime;
	private String moment;
	

	public Parser(String moment, String lokal, String kurs, String startTime, String endTime) {
		this.lokal = lokal;
		this.kurs = kurs;
		this.endTime = endTime;
		this.startTime = startTime;
		this.moment = moment;
		
	}
	
	public void ParserLokal (String lokal){
		this.lokal = lokal;
	}

	public String ParserKurs(){
		this.kurs = kurs;
		return kurs;
	}
	
	
	public void ParserStartTime (String startTime, String endTime){
		this.startTime = startTime;
		this.endTime= endTime;
	}
	
	

	public String toString(){
		String string = moment + " " + startTime + "-" + endTime + " " + lokal + " "  + kurs + "\n";
		return string;
	}

	
	
}
