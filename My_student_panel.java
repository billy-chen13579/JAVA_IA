package ia_app;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class My_student_panel extends JFrame implements ActionListener {

	
	JButton add_student = new JButton();
	JComboBox day_inweek;// = new JComboBox();
	JComboBox am_pm;// = new JComboBox();
	JComboBox hour_inday;//  = new JComboBox();
	JComboBox minute_inhour;//  = new JComboBox();
	JComboBox subject;//  = new JComboBox();
	JComboBox past_class;//  = new JComboBox();
	
	JLabel class_time = new JLabel();
	JLabel subject_label = new JLabel();
	JLabel past_class_label = new JLabel();
	JLabel ask_Q = new JLabel();
	JLabel class_notes = new JLabel();
	JLabel name_label = new JLabel();
	
	JTextField recently_asked_text = new JTextField();
	JTextField student_name = new JTextField();
	
	String[] days = {"mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
	String[] a_p_m = {"AM", "PM"};
	String[] day_hour = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
	String[] day_min = {"00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
	String[] subject_teach = {"Math", "Science", "Physics", "College Physics", "Calculus", "SAT", "AMC"};
	String[] past_classevent = {"test1", "test2"};
	
	String name_student;
	String get_day;
	String get_am_pm;
	String get_hour;
	String get_minute;
	String get_subject;
	String get_pastclass;
	String get_question;
	
	Student_object[] student_object_list = new Student_object[50];
	
	int object_list_index = 0;
	
	JPanel student_button = new JPanel();
	ArrayList<JButton> button_list = new ArrayList<JButton>();
	int button_list_index = 0;
	
	FileWriter writer;
	FileReader reader;
	
	My_student_panel(){
		
		try {
			//writer = new FileWriter("/Users/billychen/eclipse-workspace/CS IA/GFG.txt");
			reader = new FileReader("/Users/billychen/eclipse-workspace/CS IA/GFG.txt");
			//writer.write("hi");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		add_student.setBounds(350, 20, 120, 40);
		add_student.setText("Add Student");
		add_student.addActionListener(this);
		add_student.setFocusable(false);
		add_student.setFont(new Font("Comic Sans", Font.CENTER_BASELINE, 15));
		add_student.setBackground(Color.cyan);
		
		day_inweek = new JComboBox(days);
		day_inweek.setBounds(400, 100, 150, 30);
		day_inweek.setFont(new Font("Comic Sans", Font.CENTER_BASELINE, 8));
		
		am_pm = new JComboBox(a_p_m);
		am_pm.setBounds(400, 130, 100, 30);
		am_pm.setFont(new Font("Comic Sans", Font.CENTER_BASELINE, 8));
		
		hour_inday = new JComboBox(day_hour);
		hour_inday.setBounds(400, 155, 70, 30);
		hour_inday.setFont(new Font("Comic Sans", Font.CENTER_BASELINE, 8));
		
		minute_inhour = new JComboBox(day_min);
		minute_inhour.setBounds(470, 155, 70, 30);
		minute_inhour.setFont(new Font("Comic Sans", Font.CENTER_BASELINE, 8));

		subject = new JComboBox(subject_teach);
		subject.setBounds(400, 190, 150, 30);
		subject.setFont(new Font("Comic Sans", Font.CENTER_BASELINE, 10));
		
		past_class = new JComboBox(past_classevent);
		past_class.setBounds(400, 230, 150, 30);
		past_class.setFont(new Font("Comic Sans", Font.CENTER_BASELINE, 10));
			
		//Text label
		class_time.setText("Class Time: ");
		class_time.setBounds(300, 130, 100, 30);
		class_time.setFont(new Font("MV Boli", Font.PLAIN, 15));
		class_time.setForeground(Color.black);
		
		subject_label.setText("Subject: ");
		subject_label.setBounds(300, 190, 100, 30);
		subject_label.setFont(new Font("MV Boli", Font.PLAIN, 15));
		subject_label.setForeground(Color.black);
		
		past_class_label.setText("Past Class:");
		past_class_label.setBounds(300, 230, 100, 30);
		past_class_label.setFont(new Font("MV Boli", Font.PLAIN, 15));
		past_class_label.setForeground(Color.black);

		ask_Q.setText("Recently Asked Q's: ");
		ask_Q.setBounds(290, 280, 100, 30);
		ask_Q.setFont(new Font("MV Boli", Font.PLAIN, 10));
		ask_Q.setForeground(Color.black);
		
		name_label.setText("Student Name: ");
		name_label.setBounds(300, 370, 100, 30);
		name_label.setFont(new Font("MV Boli", Font.PLAIN, 10));
		name_label.setForeground(Color.black);
//		class_notes;
//		
		
		//text field
		recently_asked_text.setBounds(400, 270, 180, 80);
		recently_asked_text.setFont(new Font("Consolas", Font.PLAIN, 10));
		recently_asked_text.setBackground(Color.LIGHT_GRAY);
		
		student_name.setBounds(400, 370, 180, 50);
		student_name.setFont(new Font("Consolas", Font.PLAIN, 10));
		student_name.setBackground(Color.LIGHT_GRAY);
		
		//student panel
		student_button.setBounds(20, 100, 250, 300);
		student_button.setBackground(Color.LIGHT_GRAY);
		student_button.setLayout(new FlowLayout());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(600,500);
		
		this.add(add_student);
		this.add(day_inweek);
		this.add(am_pm);
		this.add(hour_inday);
		this.add(minute_inhour);
		this.add(subject);
		this.add(past_class);
//		
		this.add(class_time);
		this.add(subject_label);
		this.add(past_class_label);
		this.add(ask_Q);
		this.add(name_label);
//		this.add(class_notes);
		
		this.add(recently_asked_text);
		this.add(student_name);
		
		this.add(student_button);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add_student) {
			//System.out.println("Hi");
			
			name_student = student_name.getText();
			get_day = (String) day_inweek.getSelectedItem();
			get_am_pm = (String) am_pm.getSelectedItem();
			get_hour = (String) hour_inday.getSelectedItem();
			get_minute = (String) minute_inhour.getSelectedItem();
			get_subject = (String) subject.getSelectedItem();
			get_pastclass = (String) past_class.getSelectedItem();
			get_question = recently_asked_text.getText();
			
			try {
				
				writer = new FileWriter("/Users/billychen/eclipse-workspace/CS IA/GFG.txt", true);
				
				writer.write(name_student + "\n");
				writer.write(get_day + "\n");
				writer.write(get_am_pm + "\n");
				writer.write(get_hour + "\n");
				writer.write(get_minute + "\n");
				writer.write(get_subject + "\n");
				writer.write(get_pastclass + "\n");
				writer.write(get_question + "\n\n\n");
				writer.close();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
//			
//			student_object_list[object_list_index] = new Student_object(name_student, get_day, get_am_pm, get_hour, get_minute, get_subject, get_pastclass, get_question);
//			object_list_index++;
//			
//			button_list.set(button_list_index, new JButton(name_student));
//			student_button.add(button_list.get(button_list_index));
//			
		}
		
	}
}
