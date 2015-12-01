package domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Entity implements Serializable{
	private int id;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}
}
