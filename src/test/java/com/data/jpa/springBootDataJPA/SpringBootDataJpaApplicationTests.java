package com.data.jpa.springBootDataJPA;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import com.data.jpa.springBootDataJPA.entities.Student;
import com.data.jpa.springBootDataJPA.repos.StudentRepository;

import org.junit.Assert;

@SpringBootTest
class SpringBootDataJpaApplicationTests {

	@Autowired
	private StudentRepository repository;

	@Test
	void testSaveStudent() {
		Student student = new Student();
		student.setId(1l);
		student.setName("Pratik");
		student.setScore(100);
		repository.save(student);

		Student savedStudent = repository.findById(1l).get();
		System.out.println(savedStudent);

		student.setId(1l);
		student.setName("Pratik1234");
		student.setScore(105);
		repository.save(student);


		savedStudent = repository.findById(1l).get();
		System.out.println(savedStudent);

		Assert.assertNotNull(savedStudent);

	}
}
