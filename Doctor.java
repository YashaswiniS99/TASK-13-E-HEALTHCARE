package model;

public class Doctor {

	private int id;
	  private String name;
	  private String specialization;
	  private long contactnumber;
	
	  public Doctor(int id, String name, String specialization, long contactnumber) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.contactnumber = contactnumber;
	}

	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public long getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + ", contactnumber="
				+ contactnumber + "]";
	}
	  
	  
}


