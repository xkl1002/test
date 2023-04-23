import ml.lkxe.sms2.entity.Student;
import ml.lkxe.sms2.mapper.StudentMapper;
import ml.lkxe.sms2.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static final SqlSession sqlSession = MybatisUtils.getSession();
    @Test
    public void testSelectAll() {
        try {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            List <Student> students = studentMapper.searchAll(0,5);
            for (Student student: students) {
                System.out.println(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testSelectAllByNameAndPassword() {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = studentMapper.searchAllByNameAndPassword("田晓明", "6lXlwROTS6");
        for (Student student: students) {
            System.out.println(student);
        }
    }
    @Test
    public void testSelectAllByNameOrMajorOrSnoIsNotNull() {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            List <Student> students = studentMapper.selectAllByNameOrMajorOrSnoIsNotNull(null,null);
            for (Student student: students) {
                System.out.println(student);
            }
    }
    @Test
    public void testSelectByIdLessThanFive() {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Integer> ids = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            ids.add(i);
        }
        List <Student> students = studentMapper.selectByIdLessThanFive(ids);
        for (Student student: students) {
            System.out.println(student);
        }
    }
}
