package hackthon.domain;

import java.util.List;

public class Icon {
	
	private String url;
	
	private List<Integer> scaledSize;
	
	

	public Icon(String url, List<Integer> scaledSize) {
		super();
		this.url = url;
		this.scaledSize = scaledSize;
	}

	public Icon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Integer> getScaledSize() {
		return scaledSize;
	}

	public void setScaledSize(List<Integer> scaledSize) {
		this.scaledSize = scaledSize;
	}
	
	
}
