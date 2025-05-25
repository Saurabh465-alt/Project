 abstract class Person {
    protected String name;
    protected String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract void showDetails();
}

class Faculty {
    private String facultyName;

    public Faculty(String name) {
        this.facultyName = name;
    }

    public String getFacultyName() {
        return facultyName;
    }
}


class Course {
    private String courseId;
    private String courseName;
    private Faculty faculty;

    public Course(String courseId, String courseName, Faculty faculty) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.faculty = faculty;
    }

    public void showCourse() {
        System.out.println("- " + courseId + ": " + courseName + " | Faculty: " + faculty.getFacultyName());
    }
}


class Section {
    private String sectionName;
    private Course course1;
    private Course course2;
    private Course course3;

    public Section(String sectionName, Course c1, Course c2, Course c3) {
        this.sectionName = sectionName;
        this.course1 = c1;
        this.course2 = c2;
        this.course3 = c3;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void displayCourses() {
        if (course1 != null) course1.showCourse();
        if (course2 != null) course2.showCourse();
        if (course3 != null) course3.showCourse();
    }
}


class Student extends Person {
    private Section section;

    public Student(String name, String id, Section section) {
        super(name, id);
        this.section = section;
    }

    @Override
    public void showDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Section: " + section.getSectionName());
        System.out.println("Courses Assigned:");
        section.displayCourses();
    }
}


public class college_management {
    public static void main(String[] args) {
       
        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Prof. Mehta");
        Faculty f3 = new Faculty("Dr. Roy");
        Faculty f4 = new Faculty("Ms. Kapoor");
        Faculty f5 = new Faculty("Mr. Singh");
        Faculty f6 = new Faculty("Mrs. Das");
        Faculty f7 = new Faculty("Dr. Iyer");
        Faculty f8 = new Faculty("Mr. Verma");
        Faculty f9 = new Faculty("Prof. Rathi");

      
        Course a1 = new Course("CS101", "Programming Fundamentals", f1);
        Course a2 = new Course("MA101", "Mathematics I", f2);
        Course a3 = new Course("PH101", "Physics I", f3);
        Section sectionA = new Section("A", a1, a2, a3);

    
        Course b1 = new Course("CS102", "Data Structures", f4);
        Course b2 = new Course("MA102", "Calculus", f5);
        Course b3 = new Course("CH101", "Chemistry", f6);
        Section sectionB = new Section("B", b1, b2, b3);

       
        Course c1 = new Course("CS103", "OOP in Java", f7);
        Course c2 = new Course("EE101", "Basic Electrical", f8);
        Course c3 = new Course("EN101", "English Communication", f9);
        Section sectionC = new Section("C", c1, c2, c3);

      
        Student s1 = new Student("Rahul", "S001", sectionA);
        Student s2 = new Student("Ayesha", "S002", sectionB);
        Student s3 = new Student("Karan", "S003", sectionC);

        
        s1.showDetails();
        System.out.println("--------------------");
        s2.showDetails();
        System.out.println("--------------------");
        s3.showDetails();}
} 
    

