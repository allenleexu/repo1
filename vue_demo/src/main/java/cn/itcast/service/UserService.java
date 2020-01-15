package cn.itcast.service;

import cn.itcast.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll() throws Exception;

    User findById(Integer uid) throws Exception;

    void update(User user) throws Exception;

    void save(User user) throws Exception;

    void deleteByIds(Integer[] ids) throws Exception;
}
