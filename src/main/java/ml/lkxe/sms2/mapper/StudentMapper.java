package ml.lkxe.sms2.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import ml.lkxe.sms2.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
* @author Kaixl
* @description 针对表【student】的数据库操作Mapper
* @createDate 2023-04-22 20:14:20
* @Entity ml.lkxe.sms2.entity.Student
*/
public interface StudentMapper {
    List<Student> searchAll(@Param("from") Integer from , @Param("pagesize") Integer pagesize) ;

    List<Student> searchAllByNameAndPassword(@Param("name") String name, @Param("password") String password);

    List<Student> selectAllByNameOrMajorOrSnoIsNotNull(@Param("name") String name, @Param("major") String major);

    List<Student> selectByIdLessThanFive(List<Integer> id);
}








