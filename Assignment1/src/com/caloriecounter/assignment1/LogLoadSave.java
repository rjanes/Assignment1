package com.caloriecounter.assignment1;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LogLoadSave {

	
	private LogCapture readFile(File f) {
		LogCapture logfiletoread = null;
		try {
		FileInputStream fin = new FileInputStream(f);
		ObjectInputStream ois= new ObjectInputStream(fin);
		logfiletoread = (LogCapture)ois.readObject();
		ois.close();
		}
		catch(ClassNotFoundException cnfe) { cnfe.printStackTrace(); }
		catch(IOException ioe) { ioe.printStackTrace(); }
		return logfiletoread;
}
	public static void writeFile(LogCapture save_overwrite, File f) {
		try{
		FileOutputStream fout= new FileOutputStream(f);
		ObjectOutputStream oos= new ObjectOutputStream(fout);
		oos.writeObject(save_overwrite);
		oos.close();
		}
		catch(IOException ioe) { ioe.printStackTrace(); }
		}
	
}
