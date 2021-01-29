package controller;

import java.util.List;
import dao.DoctorImpl;
import dao.IDoctor;
import model.Doctor;

public class DoctorController {
	 IDoctor dImpl = new DoctorImpl();

	  public int addDoctor(int id, String name, String specialization, long contactnumber) {
	    Doctor doctor = new Doctor(id, name, specialization, contactnumber);
	    return dImpl.addDoctor(doctor);
	  }

	  public List<Doctor> viewDoctor() {
	    return dImpl.viewDoctor();
	  }

	  public int editDoctor(int id, String name, String specialization, long contactnumber) {
	    Doctor doctor = new Doctor(id, name, specialization, contactnumber);
	    return dImpl.editDoctor(doctor);
	  }

	  public int removeDoctor(int id) {
	    Doctor doctor = new Doctor();
	    doctor.setId(id);
	    return dImpl.removeDoctor(doctor);
	  }

	}


	


