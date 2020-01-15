package cn.itcast.controller;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() throws Exception{
        return null;
    }

    @RequestMapping("/findById")
    public  User findById(Integer id) throws Exception{
        return null;
    }

    @RequestMapping("/update")
    public void update(@RequestBody User user) throws Exception{

    }

    @RequestMapping("/save")
    public void save(@RequestBody User user) throws Exception{

    }

    @RequestMapping("/deleteByIds")
    public void deleteByIds(@RequestBody Integer[] ids) throws Exception{

    }
}
