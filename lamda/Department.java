package lamda;

public class Department {
	
	private int departmentid;
	private int managerid;
	private String departmentname;
	public int getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	public int getManagerid() {
		return managerid;
	}
	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentid + ", managerId=" + managerid + ", departmentName="
				+ departmentname + "]";
	}

	public Department(int departmentId, int managerId, String departmentName) {
		super();
		this.departmentid = departmentId;
		this.managerid = managerId;
		this.departmentname = departmentName;
	}

}

