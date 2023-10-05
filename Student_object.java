package ia_app;

import java.util.ArrayList;

public class Student_object {
	
	String class_name;
	String class_day;
	String class_pm_am;
	String class_hour;
	String class_minute;
	
	String student_subject;
	String student_pastclass;
	ArrayList<String> student_recent_Q = new ArrayList<String>();
	
	Student_object(String class_name, String class_day, String class_pm_am, String class_hour, String class_minute, String student_subject, String student_pastclass, String question){
		
		this.class_name = class_name;
		this.class_day = class_day;
		this.class_pm_am = class_pm_am;
		this.class_hour = class_hour;
		this.class_minute = class_minute;
		
		this.student_subject = student_subject;
		this.student_pastclass = student_pastclass;
		this.student_recent_Q.set(0, question);
		
	}
}
