package ml.lkxe.sms2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ml.lkxe.sms2.entity.Student;
import ml.lkxe.sms2.service.StudentService;
import ml.lkxe.sms2.mapper.StudentMapper;
import ml.lkxe.sms2.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author Kaixl
* @description 针对表【student】的数据库操作Service实现
* @createDate 2023-04-22 20:14:20
*/
@Service
public class StudentServiceImpl implements StudentService{
   private static final SqlSession sqlSession = MybatisUtils.getSession();

    @Override
    public List<Student> searchAllByNameAndPassword(String name, String password) {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = studentMapper.searchAllByNameAndPassword(name, password);
        return students;
    }

    @Override
    public List<Student> searchAll(Integer from, Integer pagesize) {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List <Student> students = studentMapper.searchAll(0,5);
        for (Student student: students) {
            System.out.println(student);
        }
        return students;
    }

    @Override
    public List<Student> selectAllByNameOrMajorOrSnoIsNotNull(String name, String major) {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List <Student> students = studentMapper.selectAllByNameOrMajorOrSnoIsNotNull(name,major);
        for (Student student: students) {
            System.out.println(student);
        }
        return students;
    }

    @Override
    public List<Student> selectByIdLessThanFive(List<Integer> id) {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Integer> ids = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            ids.add(i);
        }
        List <Student> students = studentMapper.selectByIdLessThanFive(ids);
        for (Student student: students) {
            System.out.println(student);
        }

        return students;
    }
}




