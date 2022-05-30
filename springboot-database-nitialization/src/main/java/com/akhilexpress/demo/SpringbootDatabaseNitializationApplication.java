package com.akhilexpress.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.akhilexpress.demo.dao.StudentDAO;
import com.akhilexpress.demo.entities.Student;

@SpringBootApplication
public class SpringbootDatabaseNitializationApplication implements CommandLineRunner {

	
	  @Autowired 
	  StudentDAO studentDAO;
	 
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDatabaseNitializationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		  Student student=new Student(); student.setStudentName("Asif");
		  student.setStudentAddress("Banagalore");
		  
		  Student student2=new Student(); student2.setStudentName("Akhilesh");
		  student2.setStudentAddress("M.P");
		  
		  studentDAO.saveStudent(student); studentDAO.saveStudent(student2);
		 
		
	}

}
