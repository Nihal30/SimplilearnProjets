package phase1FinalProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Scanner;

public class LockMe 

{
	//file path deceleration
	static final String projectFilePath = "D:\\files for lockme.com";
	
	public static void display()
	{
		System.out.println("-----------------------------------------------------------\n");
		System.out.println("\tWelcom to LockMe.com Secure app");
		System.out.println("\tDeveloped by : Nihal Kishore Sonwani\n");
		System.out.println("-----------------------------------------------------------");
	}
	
	//display menu 
	public static void displayMenu()
	{
		System.out.println("-----------------------------------------------------------");
		System.out.println("\t\tLockme.com\n");
		System.out.println("  1. Display all file");
		System.out.println("  2. Add a new file");
		System.out.println("  3. Delete a file");
		System.out.println("  4. Search file");
		System.out.println("  5. Exit");
		System.out.println("-----------------------------------------------------------");

		
	}
	//creating method to get all file
	public static void getAllfile()
	{
		File folder = new File(projectFilePath);
		File[] listofFile = folder.listFiles();
		
		if(listofFile.length>0)
		{
			 System.out.println("  Files List is Below");
		  for(var l:listofFile) 
		  {
			 System.out.println(l.getName());
		  }
		}
		else
		{
			System.out.println("  The file is empty");
		}
	}
	//creating method to add file
	public static void creatFile() throws IOException
	{
		try {
		Scanner obj = new Scanner(System.in);
		String fileName;
		System.out.println(" Enter file name :");
		fileName=obj.nextLine();
		
		int lineCount;
		System.out.println("Enter how many lines in file:");
		lineCount = Integer.parseInt(obj.nextLine());
		
		FileWriter fw = new FileWriter (projectFilePath+"\\"+fileName);
		
		//read line by line from user 
		for(int i=1;i<=lineCount;i++)
		{
			System.out.println("Enter file line:");
			fw.write(obj.nextLine()+"\n");
		}
		System.out.println("File created successfilly");
		fw.close();
		
		}
		catch(Exception ex){
			
		}
		
		
		
	}
	//creating method to delete file
	public static void deleteFile()
	
	{
		try {
		Scanner sc  =  new Scanner(System.in);
		String fileName ;
		System.out.println("Enter File name to be deleted :");
		fileName=sc.nextLine();
		File f = new File(projectFilePath+"\\"+fileName);
		if (f.exists()) {
			f.delete();
			System.out.println(" File Deletde Successfully  ");
		}
		else
			
		{
			System.out.println("File doesnot exist");
		}
		}
		catch(Exception ex) {
			System.out.println("Unable to delet some error has been occurred");
		}
		
		
	}
	
	//search file method
	public static void searchFile()
	
	{
		try 
		{
			
		Scanner obj = new Scanner(System.in);
		String fileName;
		System.out.println("Enter the file name to be search : ");
		fileName = obj.nextLine();
		
		ArrayList <String> allFileName = new ArrayList<String>();
		File folder = new File(projectFilePath);
		
		File[] listofFile = folder.listFiles();
		if (listofFile.length>0) {
			for (var l:listofFile)
			{
				allFileName.add(l.getName());
			}
		}
		File f= new File(projectFilePath+"\\"+fileName);
		if (allFileName.contains(fileName))
		{
			System.out.println("File is available");
		}
		else
		{
			System.out.println("file is not available");
		}
		
		}
		catch(Exception ex)
		{
			
		}
		
		}
}
