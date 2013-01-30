package com.caloriecounter.assignment1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

/**
 * This class is the Activity that controls the xml creat_user_activity.xml
 * It calls the User class to create a user then saves the new user into a file
 * that can be read later.
 * @author Robert Janes
 * @version 1.0
 */
public class CreateUserActivity extends Activity {
	private ArrayList<User> created_user = new ArrayList<User>();
	private File user_savefile = new File("USERSAVE");
	private File array_of_users;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_user_activity);
		readFile(array_of_users);
		System.out.println("These are the list of users: " + array_of_users);
		
		
		
	}
	
	
	/**
	 * Called when button that creates  a new user is touched 
	 * in create_user_activity xml.
	 *@param none
	 */
	public void userCreation(){
		EditText name = (EditText) findViewById(R.id.name_field);
		EditText age = (EditText) findViewById(R.id.age_field);
		EditText height = (EditText) findViewById(R.id.height_field);
		EditText weight = (EditText) findViewById(R.id.weight_field);
		//GET AND PARSE EditText FIELDS
		String agestr = age.getText().toString();
		String heightstr = height.getText().toString();
		String weightstr = weight.getText().toString();
		double age_parsed = Double.parseDouble(agestr);
		double height_parsed = Double.parseDouble(heightstr);
		double weight_parsed = Double.parseDouble(weightstr);
		//END GET AND PARSE EditTextFIELDS
		
		//create the new user
		User newuser = new User(name.getText().toString(), age_parsed, height_parsed, weight_parsed);
		created_user.add(newuser);//save to array of users.
		writeFile(created_user, user_savefile);
		//
	}
	
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	private static User readFile(File f) {
		User logfiletoread = null;
		try {
		FileInputStream fin = new FileInputStream(f);
		ObjectInputStream ois= new ObjectInputStream(fin);
		logfiletoread = (User)ois.readObject();
		ois.close();
		}
		catch(ClassNotFoundException cnfe) { cnfe.printStackTrace(); }
		catch(IOException ioe) { ioe.printStackTrace(); }
		return logfiletoread;
}
	
	/**
	 * This class takes 2 parameters: A ArrayList<User>, and a File to store that array. 
	 * @param
	 * @return void
	 */
	public static void writeFile(ArrayList<User> array_to_save, File file_to_save_array_to) {
		//readfile first to maintain the contents of the file??
		readFile(file_to_save_array_to);
		try{
		FileOutputStream fout= new FileOutputStream(file_to_save_array_to);
		ObjectOutputStream oos= new ObjectOutputStream(fout);
		oos.writeObject(array_to_save);
		oos.close();
		}
		catch(IOException ioe) { ioe.printStackTrace(); }
		
	}
	
	
	public void setUserInfoDatabase(){
		
		
	}
	
}
