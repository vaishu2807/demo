package org.com;

public class Organization implements client {

	@Override
	public void empName() {
		System.out.println("employee name is vaishu");
		System.out.println("vaishu");
	}

	@Override
	public void empId() {
	   System.out.println("employee id is 2001");
		
	}
	public static void main(String[] args) {
	 Organization a = new Organization();
	 a.empId();
	 a.empName();
	}

}
