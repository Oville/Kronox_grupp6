
public class Parser {

	private String lokal;
	private String kurs;
	private String endTime;
	private String startTime;
	

	public Parser(String lokal, String kurs, String startTime, String endTime) {
		this.lokal = lokal;
		this.kurs = kurs;
		this.endTime = endTime;
		this.startTime = startTime;
		
	}
	
	public void ParserLokal (String lokal){
		this.lokal = lokal;
	}

	public String ParserKurs(){
		return this.kurs = kurs;
	}
	
	
	public void ParserStartTime (String startTime, String endTime){
		this.startTime = startTime;
		this.endTime= endTime;
	}
	
	

	public String toString(){
		String string = startTime + "-" + endTime + " " + lokal + " "  + kurs;
		return string;
	}

	
	
}
