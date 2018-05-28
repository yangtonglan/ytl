package dao;


import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import Entity.User;

public interface UserDao {
    public void delete(User user);
    public void update(User user);
    public void add(User user);
    public User getUser(String username);
    public List<User> getUser();
    public User getUserById(int id);
    public User getUserByPassword(String password);
    //计算分页
    Integer getlong(DetachedCriteria p);
    //分页数
    List<User> getpageuser(DetachedCriteria p,Integer start,Integer pagesize);
}