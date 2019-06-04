package oop;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class Grading {
	

	    public static void main(String[] args) throws IOException {
	    	int[] grades = {4,87,34,97,33,67,53,52};
	    	int grade = 73;

	    	int lastGrade = Character.getNumericValue('7');
	    	
	    	char a = (String.valueOf(grade).charAt(0));
	    	
	    	String b = a + "5";
//	    	a += '5';
	    	
	    	System.out.print(b);

	        
	    }
	}


