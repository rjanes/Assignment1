package com.caloriecounter.assignment1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserLoadSave {
	
	
	private CreateUserActivity readFile(File f) {
		CreateUserActivity logfiletoread = null;
		try {
		FileInputStream fin = new FileInputStream(f);
		ObjectInputStream ois= new ObjectInputStream(fin);
		logfiletoread = (CreateUserActivity)ois.readObject();
		ois.close();
		}
		catch(ClassNotFoundException cnfe) { cnfe.printStackTrace(); }
		catch(IOException ioe) { ioe.printStackTrace(); }
		return logfiletoread;
}
	
	
	public static void writeFile(CreateUserActivity save_overwrite, File f) {
		try{
		FileOutputStream fout= new FileOutputStream(f);
		ObjectOutputStream oos= new ObjectOutputStream(fout);
		oos.writeObject(save_overwrite);
		oos.close();
		}
		catch(IOException ioe) { ioe.printStackTrace(); }
		}
	
}
