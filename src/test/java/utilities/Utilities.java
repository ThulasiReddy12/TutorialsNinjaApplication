package utilities;

import java.util.Date;

import ApplicationBaeTest.BaseClass;

public class Utilities extends BaseClass{
public static final int IMPLICIT_WAIT_TIME = 10;
	
	public static final long PAGE_Load_TIME = 10;
	

	public static String random_EmailID() {
		Date date = new Date();
		String num = date.toString().replace(" ", "_").replace(":", "_");
		String email = "thulasireddy972" + num + "@gmail.com";
		return email;

	}
	public static String invalidrandom_EmailID() {
		Date date = new Date();
		String num = date.toString().replace(" ", "_").replace(":", "_");
		String email = "shilpa" + num + "@gmail.com";
		return email;

	}
}


