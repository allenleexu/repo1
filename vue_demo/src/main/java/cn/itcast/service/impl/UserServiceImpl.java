package cn.itcast.service.impl;

import cn.itcast.domain.User;
import cn.itcast.mapper.UserMapper;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() throws Exception {
        return userMapper.findAll();
    }

    @Override
    public User findById(Integer uid) throws Exception {
        return userMapper.findById(uid);
    }

    @Override
    public void update(User user) throws Exception {
        userMapper.update(user);
    }

    @Override
    public void save(User user) throws Exception {
        userMapper.save(user);
    }

    @Override
    public void deleteByIds(Integer[] ids) throws Exception {
        if (ids!=null && ids.length > 0) {
            for (Integer id : ids) {
                userMapper.deleteByIds(id);
            }
        }
    }
}
