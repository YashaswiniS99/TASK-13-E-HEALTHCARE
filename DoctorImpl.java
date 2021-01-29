package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Doctor;
import util.Db;
import util.Query;

public class DoctorImpl implements IDoctor{
	
	PreparedStatement pst = null;
	  ResultSet rs = null;
	  int result = 0;

	  @Override
	  public int addDoctor(Doctor doctor) {
	    try {
	      pst = Db.getCon().prepareStatement(Query.addDoctor);
	      pst.setInt(1, doctor.getId());
	      pst.setString(2, doctor.getName());
	      pst.setString(3, doctor.getSpecialization());
	      pst.setLong(4, doctor.getContactnumber());
	      result = pst.executeUpdate();
	    } catch (ClassNotFoundException | SQLException e) {
	      result = 0;
	    } finally {
	      try {
	        Db.getCon().close();
	        pst.close();
	      } catch (ClassNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	    }
	    return result;
	  }

	  @Override
	  public List<Doctor> viewDoctor() {
	    List<Doctor> doctor = new ArrayList<Doctor>();
	    try {
	      pst = Db.getCon().prepareStatement(Query.viewDoctor);
	      rs = pst.executeQuery();
	      while (rs.next()) {
	        Doctor d = new Doctor(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getLong(4));
	        doctor.add(d);
	      }

	    } catch (ClassNotFoundException | SQLException e) {
	      try {
	        Db.getCon().close();
	        pst.close();
	        rs.close();
	      } catch (ClassNotFoundException e1) {
	        // TODO Auto-generated catch block
	        e1.printStackTrace();
	      } catch (SQLException e1) {
	        // TODO Auto-generated catch block
	        e1.printStackTrace();
	      }

	    }
	    return doctor;
	  }

	  @Override
	  public int editDoctor(Doctor doctor) {
	    try {
	      pst = Db.getCon().prepareStatement(Query.editDoctor);
	      pst.setInt(4, doctor.getId());
	      pst.setString(1, doctor.getName());
	      pst.setString(2, doctor.getSpecialization());
	      pst.setLong(3, doctor.getContactnumber());
	      result = pst.executeUpdate();
	    } catch (ClassNotFoundException | SQLException e) {
	      result = 0;
	    } finally {
	      try {
	        Db.getCon().close();
	        pst.close();
	      } catch (ClassNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	    }
	    return result;
	  }

	  @Override
	  public int removeDoctor(Doctor doctor) {
	    try {
	      pst = Db.getCon().prepareStatement(Query.removeDoctor);
	      pst.setInt(1, doctor.getId());
	      result = pst.executeUpdate();
	    } catch (ClassNotFoundException | SQLException e) {
	      result = 0;
	    } finally {
	      try {
	        Db.getCon().close();
	        pst.close();
	      } catch (ClassNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	    }
	    return result;
	  }

	

	}




