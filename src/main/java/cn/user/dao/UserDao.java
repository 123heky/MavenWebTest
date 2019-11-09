package cn.user.dao;

import cn.user.domain.User;

import java.util.List;

public interface UserDao {
    public List<User> selectUserList();

    public User selectUser(User user);
}
