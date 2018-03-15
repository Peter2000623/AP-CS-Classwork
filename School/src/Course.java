/*
 * Peter Song
 * Instructor; Mr. Daniel
 * APCS
 * 3/15/2018
 * This program describes course class.
 */
//import java.util.ArrayList;

public class Course {
	String courseTitle;
	int maxStudent;
	int numberOfLessons;
	 Lesson[] courseLesson = new Lesson[50];
//	ArrayList courseLesson = new ArrayList<Lesson>();
	Assessment courseAssessment;
	
	public Course(String courseTitle, int maxStudent, int numberOfLessons) {
		this.courseTitle=courseTitle;
		this.maxStudent=maxStudent;
		this.numberOfLessons=numberOfLessons;
	}
	
	public void addLesson(String lessonTitle,int durationMinutes,boolean requiresLab) {
//		courseLesson.add(new Lesson(lessonTitle,durationMinutes,requiresLab));
		for(int i=0;i<courseLesson.length;i++) {
			if(courseLesson[i]==null) {
				courseLesson[i]= new Lesson(lessonTitle,durationMinutes,requiresLab);
				break;
			}
		}
		
		
	}
	
	public void addAssessment(String assessmentTitle,int maxMarks) {
		courseAssessment=new Assessment(assessmentTitle,maxMarks);
	}
	
	public void outputCourseDetails() {
		System.out.print("Course: ");
		System.out.println(courseTitle+"\n"+"Max Students: "+maxStudent);
		System.out.println();
		this.courseAssessment.outputAssessmentDetails();
		for(int i=0;i<this.courseLesson.length;i++) {
			if(this.courseLesson[i]!=null) {
			System.out.println("Lesson "+(i+1));
			this.courseLesson[i].outputLessonDetails();
			}
	}
	}
	
	public static void main(String[] args) {
		Course a = new Course("Computer",20,12);		
		a.addAssessment("Project1", 100);	
		a.addLesson("Inheritance", 40, false);
		a.addLesson("Abstract", 40, true);
//		for(int i=0;i<a.courseLesson.size();i++) {
//			System.out.println("Lesson "+(i+1));
//			((Lesson) a.courseLesson.get(i)).outputLessonDetails();
//		}
		a.outputCourseDetails();
		
		
	}
}
