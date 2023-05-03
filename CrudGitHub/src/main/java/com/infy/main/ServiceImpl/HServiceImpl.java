package com.infy.main.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.main.Model.Student;
import com.infy.main.Repository1.HRepository;
import com.infy.main.ServiceI.HServiceI;
@Service
public class HServiceImpl implements HServiceI {

	@Autowired
	HRepository hr;
	
	@Override
	public void savestudent(Student s) {
		hr.save(s);
	
	}

	@Override
	public List<Student> getstudent() {
	List<Student>	p=hr.findAll();
		return p;
	}

	@Override
	public void deletestudent(int id) {
     hr.deleteById(id);
		
	}

	
	
	
}
