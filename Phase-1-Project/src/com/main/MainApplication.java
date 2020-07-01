package com.main;

import java.io.IOException;

import com.model.FileOperationsWorking;
import com.model.WelcomeScreenWorking;

public class MainApplication {
	public static void main(String[] args) throws IOException,NullPointerException,Exception{
		FileOperationsWorking work= new FileOperationsWorking();
		WelcomeScreenWorking welcome = new WelcomeScreenWorking();
		welcome.displayMainMenu(work);
		}
	
}
