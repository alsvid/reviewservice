package domain.model;

public class Review {
	private String writer;
	private int numberofstars;
	private String content;
	private Address location;
	
	public Review() {
		
	}
	
	public Review(String writer, int numberofstars, String content, Address location) {
		setWriter(writer);
		setNumberofstars(numberofstars);
		setContent(content);
		setLocation(location);
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getNumberofstars() {
		return numberofstars;
	}

	public void setNumberofstars(int numberofstars) {
		this.numberofstars = numberofstars;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Address getLocation() {
		return location;
	}

	public void setLocation(Address location) {
		this.location = location;
	}
	
	
}
