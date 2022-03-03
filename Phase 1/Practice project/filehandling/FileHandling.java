package com.simplilearn.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class FileHandling {
	public static Boolean createFile()
	{
		try
		{
			File f = new File("D:\\Files\\Files.txt");
			if(f.createNewFile())
			{
				System.out.println(".....File Created Successfully.....");
			}
			else
			{
				System.out.println("File Already Exists........");
			}
		}
		catch(IOException e)
		{
			System.out.println("Exception occured "+e);
			return false;
		}
		
		try
		{
			File f = new File("D:\\Files\\Files.txt");
			FileWriter writer= new FileWriter(f);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the message to add into a file: ");
			String msg = sc.nextLine();
			writer.write(msg);
			writer.close();
			if(f.canWrite())
				System.out.println("This content is write to file : "+msg);
		}
		catch(IOException e)
		{
			System.out.println("Exception occured "+e);
			return false;
		}
		return true;
	}
	
	public static List<String> readFile(String fileName)
	{
		List<String> list= Collections.emptyList();
		try {
			list= Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return list;
	}
	
	public static void appendFile(String fileName, String str) throws IOException {
		try {
		   BufferedWriter out = new BufferedWriter(new FileWriter("D:\\Files\\Files.txt", true));
		   out.write(str);
		   out.close();
	   }
	   catch (IOException e) {
		   System.out.println("exception occurred" + e);
	   }
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Choose the operation from below: ");
			System.out.println("1. Create and Write File");
			System.out.println("2. Read File");
			System.out.println("3. Append File");
			System.out.println("4. Exit");
			int choice = sc.nextInt();
			
			if(choice == 1)
			{
				createFile();
			}
			else if(choice == 2)
			{
				List<String> result= readFile("D:\\Files\\Files.txt");
				java.util.Iterator<String> it= result.iterator();
				System.out.println();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
			}
			else if(choice == 3)
			{
				Scanner scan= new Scanner(System.in);
				System.out.println("Enter string to append : ");
				String data1= scan.nextLine();
				appendFile("D:\\Files\\Files.txt", data1);
			}
			
			else if(choice == 4)
			{
				break;
			}
			
			else
			{
				System.out.println("Invalid Choice");
			}
		}
	}
}
