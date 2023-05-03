package com.infy.main.ServiceI;

import java.util.List;

import com.infy.main.Model.Student;

public interface HServiceI {

	public void savestudent(Student s);
	public List<Student> getstudent();
	public void deletestudent(int id);
}
