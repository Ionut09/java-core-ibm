package com.ibm.java._7_exceptions;

import com.ibm.java._5_oop.Student;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Exceptions {
	
	public static void main(String[] args) throws IOException, MyCustomCheckedException { //declare
		
		//		int badDivision = 2 / 0;
		
		Student student = new Student();
		try {
			student.setAge(200);
		} catch (ArithmeticException | IllegalArgumentException ex) {
			System.err.println("Bad input for age: " + ex.getMessage() + "!");
			ex.printStackTrace();
			student.setAge(21);
		} catch (Exception ex) {
			//catch everything
		} finally {
			System.out.println("In finally student has age: " + student.getAge());
		}
		
		System.err.println("Here after exception being thrown and caught!");
		
		//must be handled or declared
		Stream<String> stream = null;
		try { //handled
			stream = Files.lines(Path.of("/Users/ionut/workspace/trainings/java-core-ibm/.gitignore999"));
			//			stream.forEach(System.out::println);
			//			int s = 2/0;
			System.out.println("in try after exceptional method!!");
		} catch (IOException ex) {
			System.out.println("File couldn't be read!");
		} finally {
			System.out.println("Something in finally!");
			if (stream != null) {
				stream.close();
			}
		}
		
		//		readFileContent();
		System.out.println("No file found. main method ending normally!!!");
		
		//try-with-resources
		String pathToGitignore = "/Users/ionut/workspace/trainings/java-core-ibm/.gitignore";
		try (Stream<String> streamInTryWithResources = Files.lines(Path.of(pathToGitignore))) { //handled
			
			streamInTryWithResources.forEach(System.out::println);
			System.out.println("in try after exceptional method!!");
		} catch (IOException ex) {
			System.out.println("File couldn't be read!");
		}
		
//		try {
//			method1();
//		} catch (MyCustomException e) {
//
//		}
		method1();
		method2();
	}
	
	private static void readFileContent() throws IOException {
		Files.lines(Path.of("/Users/ionut/workspace/trainings/java-core-ibm/.gitignore999"))
		     .forEach(System.out::println);
	}
	
	private static void method1() throws MyCustomCheckedException {
		System.out.println("in method1");
	}
	
	private static void method2() throws MyCustomUncheckedException{
		System.out.println("in method2");
	}
}
