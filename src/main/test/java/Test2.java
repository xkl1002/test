import ml.lkxe.sms2.entity.Student;
import ml.lkxe.sms2.service.StudentService;
import ml.lkxe.sms2.service.impl.StudentServiceImpl;
import org.junit.Test;

import java.util.List;

public class Test2 {
    @Test
    public void login() {
        StudentService studentService = new StudentServiceImpl();
        try {
            List<Student> students = studentService.searchAllByNameAndPassword("戴子韬", "2hRsykFpOz");
            Student student = students.get(0);
            System.out.println(student);
        }
        catch (Exception e) {
            System.out.println("姓名或密码错误！");
          }
    }

}
