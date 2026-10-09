package SkillBuilders;

import java.io.File;
import java.util.Scanner;

public class ClassFile {

	public static void main(String[] args) 
	{
		File textFile;
		String fileName;
		Scanner input = new Scanner(System.in);
				
	    //Obtain file name from user
	    System.out.println("Enter File Name: ");
        fileName = input.next();
		
		 //Create a new file 
		textFile = new File(fileName);
				
		//Determine if the file exists
		if (textFile.exists()) 
		{
			
			System.out.println("File Exists.");
		}
		else
        {
			
			System.out.println("File does not exist.");
		}
	}

}
