package service;
import java.util.List;

import Entity.User;
import dao.UserDao;
import daoimpl.UserDaoimpl;

public class UserService {
   private UserDao userDao;
   
   public User  getUserByPassword(String password) {
   	User user=userDao.getUserByPassword( password);
   	return user;
   }
    public User  getUserById(int id) {
    	User user=userDao.getUserById( id);
    	return user;
    }
	public void addUser(User user) {
			userDao.add(user);
	}
    public User getUser(String username) {
    	User user=userDao.getUser(username);
    	 return user;
    }
    public List<User> getUser() {
    	List<User> user=userDao.getUser();
    	 return user;
    }
    public void delete(User user) {
    	userDao.delete(user);
    }
    public void update(User user) {
    	userDao.update(user);
    }
    
    
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
    
}
