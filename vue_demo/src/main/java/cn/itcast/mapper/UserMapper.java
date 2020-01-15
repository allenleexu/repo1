package cn.itcast.mapper;

import cn.itcast.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {
    @Select("")
    List<User> findAll() throws Exception;

    @Select("")
    User findById(Integer id) throws Exception;

    @Update("")
    void update(User user) throws Exception;

    @Insert("")
    void save(User user) throws Exception;

    @Delete("")
    void deleteByIds(int id) throws Exception;
}
