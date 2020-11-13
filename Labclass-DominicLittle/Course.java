
/**
 * Write a description of class Course here.
 *
 * @author Dominic Little
 * 
 * @version 2011.07.31
 */
public class Course
{
    // instance variables - replace the example below with your own
    // The course the student can choose
    public String course;
    // The ID of the course that the student has chosen
    public String courseid;

    /**
     * set a new course for this student
     */
    public class changeCourse {
        public String newcourse() {
        System.out.println("Computing G400");
        return course;
        
    }
}
    /**
     *Set a new course for this student.
     */
    public void changecourse(String replacementcourse, String id1)
    {
        course = replacementcourse;
        courseid = id1;
    }
}

