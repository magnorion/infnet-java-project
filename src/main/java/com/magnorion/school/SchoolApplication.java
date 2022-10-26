package com.magnorion.school;

import com.magnorion.school.models.test.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolApplication {

	public static void main(String[] args) {
		AlunoTest.main(args);
		ProfessorTest.main(args);
		CursoTest.main(args);
		DisciplinaTest.main(args);
		MonitorTest.main(args);

		SpringApplication.run(SchoolApplication.class, args);
	}
}
