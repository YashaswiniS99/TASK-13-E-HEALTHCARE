package dao;

import java.util.List;
import model.Doctor;

public interface IDoctor {
	public int addDoctor(Doctor doctor);
	public List<Doctor> viewDoctor();
	public int editDoctor(Doctor doctor);
	public int removeDoctor(Doctor doctor);

}
