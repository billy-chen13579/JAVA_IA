package ia_app;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Myframe extends JFrame implements ActionListener{
	
	JRadioButton calendar_chooser;
	JRadioButton studentinfo_chooser;
	JPanel calendar_panel = new JPanel();
	JPanel studentinfo_panel = new JPanel();
	JLayeredPane layer;
	
	//StudentInfo panel
	JButton add_student = new JButton();
	JComboBox day_inweek = new JComboBox();
	JComboBox am_pm = new JComboBox();
	JComboBox hour_inday  = new JComboBox();
	JComboBox minute_inhour  = new JComboBox();
	JComboBox subject  = new JComboBox();
	JComboBox past_class  = new JComboBox();
	
	JLabel class_time = new JLabel();
	JLabel subject_label = new JLabel();
	JLabel past_class_label = new JLabel();
	JLabel ask_Q = new JLabel();
	JLabel class_notes = new JLabel();

	Myframe(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(700,700);
		
		//radio button
		
		calendar_chooser = new JRadioButton("Calendar page");
		calendar_chooser.setBounds(30,30,70,50);
		calendar_chooser.setFont(new Font("Comic Sans", Font.CENTER_BASELINE, 15));
		calendar_chooser.setBackground(Color.cyan);
		
		studentinfo_chooser = new JRadioButton("Student info page");
		studentinfo_chooser.setBounds(130,30,70,50);
		studentinfo_chooser.setFont(new Font("Comic Sans", Font.CENTER_BASELINE, 15));
		studentinfo_chooser.setBackground(Color.cyan);
		
		ButtonGroup buttongroup = new ButtonGroup();
		buttongroup.add(calendar_chooser);
		buttongroup.add(studentinfo_chooser);
		
		calendar_chooser.addActionListener(this);
		studentinfo_chooser.addActionListener(this);
		
		//z-axis
//		layer = new JLayeredPane();
//		layer.setBounds(0,150, 700,550);
		
		//main panel

		this.add(calendar_chooser);
		this.add(studentinfo_chooser);
		this.add(studentinfo_panel);
		
		this.setVisible(true);

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == studentinfo_chooser) {
			System.out.println("choose me");
			student_panel();
			
		}else if(e.getSource() == calendar_chooser) {
			
			calendar_panel();
		}
		
	}
	
	public void student_panel() {
		studentinfo_panel.setBounds(50,150,600,500);
		studentinfo_panel.setBackground(Color.LIGHT_GRAY);
		studentinfo_panel.setLayout(null);
		
		add_student.setBounds(350, 20, 120, 40);
		add_student.setText("Add Student");
		add_student.addActionListener(this);
		add_student.setFocusable(false);
		add_student.setFont(new Font("Comic Sans", Font.CENTER_BASELINE, 15));
		add_student.setBackground(Color.cyan);
		
		
		String[] days = {"mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		String[] a_p_m = {"AM", "PM"};
		String[] day_hour = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		String[] day_min = {"00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
		String[] subject_teach = {"Math", "Science", "Physics", "College Physics", "Calculus", "SAT", "AMC"};
		String[] past_classevent = {"test1", "test2"};

		day_inweek.setBounds(350, 100,150, 30);
		day_inweek.setFont(new Font("Comic Sans", Font.CENTER_BASELINE, 8));
		if (day_inweek.getItemCount() < 5) {
			for(int i=0; i<7; i++) {
				day_inweek.addItem(days[i]);
			}
		}
		
//		am_pm  = new JComboBox(a_p_m);
//		
//		hour_inday = new JComboBox(day_hour);
//		
//		minute_inhour  = new JComboBox(day_min);
//		
//		subject  = new JComboBox(subject_teach);
//		
//		past_class = new JComboBox(past_classevent);
		
		
//
//		class_time
//		subject_label
//		past_class_label
//		ask_Q
//		class_notes
		
		
		studentinfo_panel.add(add_student);
		studentinfo_panel.add(day_inweek);
		
	}
	
	public void calendar_panel() {

	}

}
