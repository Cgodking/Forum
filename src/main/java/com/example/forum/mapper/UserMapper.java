package com.example.forum.mapper;
import com.example.forum.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface UserMapper {
    int insertUser(User user);

    User findByUsername(@Param("username") String username);

    User findByEmail(@Param("email") String email);

    int updateUser(User user);

    User findById(@Param("id") Long id);

    List<User> findAll();

    int deleteUser(@Param("id") Long id);
}
