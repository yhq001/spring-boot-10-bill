package com.yhq.springboot.mapper;

import com.yhq.springboot.entities.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther:
 */
@Mapper
public interface UserMapper {

    User getUserByUsername(String username);

    List<User> getUsers(User user);

    User getUserById(Integer id);

    int addUser(User user);

    int deleteUserById(Integer id);

    int updateUser(User user);

}
