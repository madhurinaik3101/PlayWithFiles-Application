package com.model;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileOperationsWorking implements PlayWithFilesInterface {
	
static String path= File.separator + "Users"+ File.separator + "Nagaraj"+ File.separator + "Desktop"+ File.separator +"Project1";

//Build path for the file
public String addPathToFile(String filename) {
	//File.Seperator makes the path platform independent
	StringBuffer filePath = new StringBuffer(File.separator + "Users"+ File.separator + "Nagaraj"+ File.separator + "Desktop"+ File.separator +"Project1"+File.separator);
	//Add filename to the Path
	filePath.append(filename);
	return String.valueOf(filePath);
	
}

//Add file
public void addFile(String filename) throws IOException{
	
	String absoluteFilePath= new FileOperationsWorking().addPathToFile(filename);
	//Create new file
    File file = new File(absoluteFilePath);
    if(file.createNewFile()){
        System.out.println(" File Created");
    }
    else { 
    	System.out.println("File already exists");
   }
}

//Delete File
public void deleteFile(String filename) throws Exception {
	
	String absoluteFilePath= new FileOperationsWorking().addPathToFile(filename);
	try {         
	File file= new File(absoluteFilePath);            
	if(file.delete()){  
	System.out.println("Output:"+ filename + " deleted");  
	}  
	else {  
	System.out.println("Output:File Not Found");  
	}  
	}
	catch(Exception exception){  
	exception.printStackTrace();  
	}  
}

//Return Files in Ascending Order
public void returnFilesInAscendingOrder()
{
	File fileDir = new File(path);
	if(fileDir.isDirectory()){
		List listFile = Arrays.asList(fileDir.list());
		Collections.sort(listFile);
		System.out.println("Sorting by filename in ascending order");
		for(Object s:listFile){
			System.out.println(s);
		}
	}
	else{
		System.out.println("Output:" + fileDir.getAbsolutePath() + " is not a directory");
	}

}

//Search for file
public void searchFile(String filename) {
	File fileDir = new File(path);
	List listFile = Arrays.asList(fileDir.list());
	int flag=0;
	for(Object s:listFile){
			String value=String.valueOf(s);
			if(value.equals(filename)) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
	if (flag==1) {
		System.out.println("Output:File Found");
		File file= new File(filename);
		System.out.println(file.getAbsolutePath());
	}
	else {
		System.out.println("Output:File Not Found");
	}
	}

}
	


 



