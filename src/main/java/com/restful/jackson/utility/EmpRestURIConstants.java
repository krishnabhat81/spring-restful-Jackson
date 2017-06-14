package com.restful.jackson.utility;

/**
* @author Krishna Bhat
*
*/

//Spring Restful web service End Points

/* 
1	/rest/emp/dummy	GET	Health Check service, to insert a dummy data in the Employees data storage
2	/rest/emp/{id}	GET	To get the Employee object based on the id
3	/rest/emps	GET	To get the list of all the Employees in the data store
4	/rest/emp/create	POST	To create the Employee object and store it
5	/rest/emp/delete/{id}	PUT	To delete the Employee object from the data storage based on the id
*/

public class EmpRestURIConstants {
	
	public static final String DUMMY_EMP = "/rest/emp/dummy";
	public static final String GET_EMP = "/rest/emp/{id}";
	public static final String GET_ALL_EMP = "/rest/emps";
	public static final String CREATE_EMP = "/rest/emp/create";
	public static final String DELETE_EMP = "/rest/emp/delete/{id}";

}
