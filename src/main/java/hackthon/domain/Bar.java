package hackthon.domain;

public class Bar {

	private String letter;

	private String frequency;
	
	

	public Bar(String letter, String frequency) {
		super();
		this.letter = letter;
		this.frequency = frequency;
	}
	
	

	public Bar() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	
	

}
