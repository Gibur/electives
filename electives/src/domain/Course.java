package domain;

import javax.xml.crypto.Data;

@SuppressWarnings("serial")
public class Course extends Entity {
	private int lecturerID;
	private Data startDate;
	private Data endDate;
	private boolean isOpen;

	public int getLecturer_id() {
		return lecturerID;
	}

	public void setLecturer_id(int lecturer_id) {
		this.lecturerID = lecturer_id;
	}

	public Data getStartDate() {
		return startDate;
	}

	public void setStartDate(Data startDate) {
		this.startDate = startDate;
	}

	public Data getEndDate() {
		return endDate;
	}

	public void setEndDate(Data endDate) {
		this.endDate = endDate;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
}
