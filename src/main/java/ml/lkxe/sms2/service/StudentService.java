package ml.lkxe.sms2.service;

import ml.lkxe.sms2.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author Kaixl
* @description 针对表【student】的数据库操作Service
* @createDate 2023-04-22 20:14:20
*/
public interface StudentService {
    List<Student> searchAllByNameAndPassword(String name, String password);
    List<Student> searchAll( Integer from, Integer pagesize);
    List<Student> selectAllByNameOrMajorOrSnoIsNotNull(String name, String major);
    List<Student> selectByIdLessThanFive(List<Integer> id);
}
