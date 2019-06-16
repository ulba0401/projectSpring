package VO;

import java.io.Serializable;

public class WordVO implements Serializable{
	private String abbword;
	private String fullname;
	private String explanation;
	private String korword;
	private String unit;
	
	public WordVO(String abbword, String fullname, String explanation, String korword, String unit) {
		super();
		this.abbword = abbword;
		this.fullname = fullname;
		this.explanation = explanation;
		this.korword = korword;
		this.unit = unit;
	}

	public String getAbbword() {
		return abbword;
	}

	public void setAbbword(String abbword) {
		this.abbword = abbword;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String getKorword() {
		return korword;
	}

	public void setKorword(String korword) {
		this.korword = korword;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}


	
	
	
}
