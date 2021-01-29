package util;

public class Query {
	 public static String adminAuthentication = "select * from admin where username=? and password=?";
	  public static String addDoctor = "insert into doctor values(?,?,?,?)";
	  public static String viewDoctor = "select * from doctor";
	  public static String editDoctor = "update doctor set name=?,specialization=?,contactnumber=? where id=?";
	  public static String removeDoctor = "delete from doctor where id=?";
	}

