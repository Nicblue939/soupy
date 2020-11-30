package soups;

public class soupy {
	 
	private String type;
	private int cups;
	private String base;
	
	private soupy() {
	}

	public soupy(String type, int cups) {
		super();
		this.type = type;
		this.cups = cups;
	}
	
	public soupy(String type, int cups, String base) {
		super();
		this.type = type;
		this.cups = cups;
		this.base = base;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCups() {
		return cups;
	}

	public void setCups(int cups) {
		this.cups = cups;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
