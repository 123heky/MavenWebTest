package cn.user.service.inpl;

import cn.user.dao.UserDao;
import cn.user.domain.User;
import cn.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public User selectUser(User user) {
       return userDao.selectUser(user);
    }
}
