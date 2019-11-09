package cn.user.controller;

import cn.user.domain.User;
import cn.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "Login";
    }

    @RequestMapping("/login")
    public String login(User user){
        User u = userService.selectUser(user);
        if (u==null){
            return "Login";
        }else {
            return "Success";
        }
    }

}
