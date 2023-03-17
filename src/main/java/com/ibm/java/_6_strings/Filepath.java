package com.ibm.java._6_strings;

import java.nio.file.Files;

public class Filepath {
	
	private String separator;
	private String root;
	private String fullPath;
	
	// --> /Users/ionut/workspace/trainings/java-core-ibm/pom.xml
	// c:\myFiles\workspace
	//	File
	public static void main(String[] args) {
		Filepath path = new Filepath("/", "/","/Users/ionut/workspace/trainings/java-core-ibm/pom.xml");
		System.out.println(path.extension());
		System.out.println(path.filename());
		System.out.println(path.pwd());
		System.out.println(path.depth());
	}
	
	public Filepath(String separator, String root, String fullPath) {
		this.separator = separator;
		this.root = root;
		this.fullPath = fullPath;
	}
	
	public String extension() {
		int indexOfPoint = fullPath.lastIndexOf(".");
		return fullPath.substring(indexOfPoint + 1);
	}
	
	public String filename() {
		int lastIndexOfSeparator = fullPath.lastIndexOf(separator);
		return fullPath.substring(lastIndexOfSeparator + 1);
	}
	
	public String pwd() {
		int lastIndexOfSeparator = fullPath.lastIndexOf(separator);
		return fullPath.substring(0, lastIndexOfSeparator);
	}
	
	public int depth() {
		String[] elementsOfThePath = fullPath.split(separator);
		return elementsOfThePath.length;
	}
}
