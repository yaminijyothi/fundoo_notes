package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResource {
	@Autowired
	StudentRepository repo;
	@GetMapping("list")
	public List<Student>  getStudents(){
		List<Student> list=new ArrayList<>();
		
	Student s=new Student();
		s.setName("yamini");
		s.setId(101);
		s.setCource("java");
		
		
		Student s1=new Student();
		s1.setName("jyothi");
		s1.setId(102);
		s1.setCource("spring");
		

		Student s2=new Student();
		s2.setName("divya");
		s2.setId(103);
		s2.setCource("python");
		
		list.add(s);
		list.add(s1);
		list.add(s2);
		return list; 
		
		//List<Student> list=(List<Student>) repo.findAllById(list);
		//return list;		
		
	}

}
