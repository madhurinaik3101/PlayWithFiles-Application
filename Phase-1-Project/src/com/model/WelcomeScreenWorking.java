package com.model;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

public class WelcomeScreenWorking {
	
//Take Input
public String takeInputString() {
		 System.out.println("Enter filename");
		Scanner sc = new Scanner(System.in);
		String filename= sc.nextLine();
		return filename;
	 }
//Valid Option values for Main Menu can only be 1,2,3
public boolean optionValidityForMainMenu(int option) {
	boolean value=false;
	int options []= {1,2,3};
	for(int opt:options) {
		if(option==opt) {
			value=true;
			break;
		}
	}
	return value;
}

//Valid Option values for Sub Menu can only be 1,2,3,4
public boolean optionValidityForSubMenu(int option) {
	boolean value=false;
	int options []= {1,2,3,4};
	for(int opt:options) {
		if(option==opt) {
			value=true;
			break;
		}
	}
	return value;
}
//Display Main Menu
 public void displayMainMenu(FileOperationsWorking work) throws IOException,InputMismatchException,Exception  {
		 	System.out.println("- -  - - - -  - -  -  - -  - -  - -  - - -  -  - - - -  - -  - - - - - -  - - - - ");
			System.out.println("\t Welcome to my Application PlayWithFiles \n");
			System.out.println("\t \t -Developed by Madhuri Naik- \n");
			System.out.println("PlayWithFiles gives you the liberty to perform simple operations on Files \n" );
			System.out.println("The various options provided by the application are:");
			System.out.println("[1] Return the files in ascending order");
			System.out.println("[2] Operations on the files");
			System.out.println("[3] Exit the application");
			System.out.println("- -  - - - -  - -  -  - -  - -  - -  - - -  -  - - - -  - -  - - - - - -  - - - - ");
			System.out.println("Select option number from above\n");
			try {
			Scanner scan= new Scanner(System.in);
			int firstOption = scan.nextInt();
			boolean valid= new WelcomeScreenWorking().optionValidityForMainMenu(firstOption);
			if(valid) {
			switch(firstOption){
			case 1:
				work.returnFilesInAscendingOrder();
				new WelcomeScreenWorking().displayMainMenu(work);
				break;
			case 2:
				new WelcomeScreenWorking().displaySubMenu(work,firstOption);
				break;
			case 3:
				System.exit(1);
				break;
				}
			}
			else {
				System.out.println("Output:Invalid input....Enter valid option number....Valid option numbers are 1,2,3");
				new WelcomeScreenWorking().displayMainMenu(work);
			}
			}
			catch (InputMismatchException input)
			 {
				System.out.println("Output: Invalid input....Enter valid option number....Valid option numbers are 1,2,3");
				new WelcomeScreenWorking().displayMainMenu(work);
				
			 }
			
			}
			
//Display File Operations Menu
public void displaySubMenu(FileOperationsWorking work,int firstOption) throws IOException,Exception {
		    System.out.println("- -  - - - -  - -  -  - -  - -  - -  - - -  -  - - - -  - -  - - - - - -  - - - - ");
		 	System.out.println("Select option from below:");
			System.out.println("[1] Add file to existing directory list");
			System.out.println("[2] Delete user defined file from the existing directory list");
			System.out.println("[3] Search user file in the main directory");
			System.out.println("[4] Return to the main menu" );
			System.out.println("- -  - - - -  - -  -  - -  - -  - -  - - -  -  - - - -  - -  - - - - - -  - - - - ");
			try {
			Scanner scan= new Scanner(System.in);
			int secondOption = scan.nextInt();
			boolean valid= new WelcomeScreenWorking().optionValidityForSubMenu(secondOption);
			if(valid) {
			switch(secondOption) {
			case 1:
				work.addFile(new WelcomeScreenWorking().takeInputString());
				new WelcomeScreenWorking().displayMainMenu(work);
				break;
			case 2:
				work.deleteFile(new WelcomeScreenWorking().takeInputString());
				new WelcomeScreenWorking().displayMainMenu(work);
				break;
			case 3:
				work.searchFile(new WelcomeScreenWorking().takeInputString());
				new WelcomeScreenWorking().displayMainMenu(work);
				break;
			case 4:
				new WelcomeScreenWorking().displayMainMenu(work);
				break;
			}
			}
			else {
				System.out.println("Output:Invalid input....Enter valid option number....Valid option numbers are 1,2,3,4");
				new WelcomeScreenWorking().displayMainMenu(work);
			}
	        }
			catch (InputMismatchException input)
			 {
				System.out.println("Output:Invalid input....Enter valid option number....Valid option numbers are 1,2,3,4");	
			 }
	 }
	public static void main(String[] args) {
		
	}
		


	}

