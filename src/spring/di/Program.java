package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/*
		Exam exam = new NewlecExam();
		ExamConsole console = new InlineExamConsole(exam); // DI
		console.setExam(exam);
		*/
		
		// (지시서)객체 생성하기
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		// 방법1
//		ExamConsole console = (ExamConsole) context.getBean("console");
		// 방법2
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
//		List<Exam> exams = new ArrayList<>();
//		List<Exam> exams = (List<Exam>) context.getBean("exams");
//		exams.add(new NewlecExam(1,1,1,1));
//		
//		for (Exam e : exams)
//			System.out.println(e);

	}

}
