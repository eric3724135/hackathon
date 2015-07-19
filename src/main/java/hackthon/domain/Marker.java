package hackthon.domain;


public class Marker {

	private String addr;
	
	private String text;
	
	private String label;
	
//	private Icon icon;
	
	private String animation;
	
	
	

	public Marker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Marker(String addr, String text, String label) {
		super();
		this.addr = addr;
		this.text = text;
		this.label = label;
//		this.icon = icon;
		this.animation = "DROP";
	}

	

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

//	public Icon getIcon() {
//		return icon;
//	}
//
//	public void setIcon(Icon icon) {
//		this.icon = icon;
//	}

	public String getAnimation() {
		return animation;
	}

	public void setAnimation(String animation) {
		this.animation = animation;
	}
	
	
}
