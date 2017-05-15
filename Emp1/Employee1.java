package pom.Emp1;

public class Employee1 {
	static int empid;
	String empname;
	String  empdept;
	
	
	public Employee1() {
		super();
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public String getEmpdept() {
		return empdept;
	}


	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}


	public Employee1(int empid, String empname, String empdept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdept = empdept;
	}
	

}
