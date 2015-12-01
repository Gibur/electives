package domain;

@SuppressWarnings("serial")
public class Lecturer extends User {
	private String degree;

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

}
