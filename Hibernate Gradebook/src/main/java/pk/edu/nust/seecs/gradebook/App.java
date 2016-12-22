package pk.edu.nust.seecs.gradebook;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import pk.edu.nust.seecs.gradebook.dao.CloDao;
import pk.edu.nust.seecs.gradebook.dao.CourseDao;
import pk.edu.nust.seecs.gradebook.dao.GradeDao;
import pk.edu.nust.seecs.gradebook.dao.StudentDao;
import pk.edu.nust.seecs.gradebook.dao.TeacherDao;
import pk.edu.nust.seecs.gradebook.entity.Clo;
import pk.edu.nust.seecs.gradebook.entity.Course;
import pk.edu.nust.seecs.gradebook.entity.Grade;
import pk.edu.nust.seecs.gradebook.entity.Student;
import pk.edu.nust.seecs.gradebook.entity.Teacher;

/**
 * My main App. 
 * <p>
 This executes everything.
 */

public class App {

    public static void main(String[] args) throws ParseException {
        
        TeacherDao tdao = new TeacherDao();
        
        Teacher teacher = new Teacher("Qaisar Chaudhary");
        tdao.addTeacher(teacher);
        
        StudentDao sdao = new StudentDao();
        
        Student student = new Student("Hamza Mahmood");
        sdao.addStudent(student);
        /*
        GradeDao gtao = new GradeDao();
        
        Grade grade = new Grade();
        grade.setName("A");
        grade.setScore(95);
        
        gtao.addGrade(grade);
        */
        /*
        CourseDao cdao = new CourseDao();
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date d1 = df.parse("12/06/2016");
        Date d2 = df.parse("12/12/2016");
        
        
        Course course = new Course("Web Engineering",d1,d2,4);
        cdao.addCourse(course);
        */
        CloDao clodao = new CloDao();

        // Add new clo
        Clo clo = new Clo();
        clo.setName("CLO 1");
        clo.setDescription("Design efficient solutions for algorithmic problems");
        clo.setPlo("2");
        clodao.addClo(clo);

        clodao.updateClo(clo);

        // Delete an existing clo
        //dao.deleteClo(1);

        // Get all clos
        for (Clo iter : clodao.getAllClos()) {
            System.out.println(iter);
        }

        // Get clo by id
        System.out.println(clodao.getCloById(1));
    }
}