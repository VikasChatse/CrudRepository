package com.infy.main.Controllar1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.main.Model.Student;
import com.infy.main.ServiceI.HServiceI;

@RestController
public class HController {

	@Autowired
	HServiceI hs;
	
	@PostMapping("/addstudent")
	public String addStudent(@RequestBody Student s) {
		hs.savestudent(s);
		return"data added";
	}
	
	@PutMapping("/update/{id}")
	public String updatestudent(@RequestBody Student s) {
		
		hs.savestudent(s);
		return"UPDATE SUCCESSFUL";
	}
	
	@GetMapping("/getstudent")
	public List<Student> getdata(){
		
List<Student>	kk=hs.getstudent();
	
return kk;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudet(@PathVariable int id) {
		
		hs.deletestudent(id);
		
		return"Delete Succefully";
	}
	
}
