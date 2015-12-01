package domain;

@SuppressWarnings("serial")
public class User extends Entity {
	private String login;
	private String password;
	private String name;
	private String surname;
	private String patronimyc;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatronimyc() {
		return patronimyc;
	}

	public void setPatronimyc(String patronimyc) {
		this.patronimyc = patronimyc;
	}

}
