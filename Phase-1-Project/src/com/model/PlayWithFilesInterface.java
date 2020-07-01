package com.model;

import java.io.IOException;

public interface PlayWithFilesInterface  {
public void addFile(String filename) throws IOException;
public void returnFilesInAscendingOrder();
public void deleteFile(String filename) throws Exception; 
public void searchFile(String filename);
}
