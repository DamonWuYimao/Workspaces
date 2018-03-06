package org.spring.manager;

import org.spring.dao.UserDao;


public class UserManagerImpl implements UserManager {

	private UserDao userDao;
	/*
	 * 构造注入
	 */
	public UserManagerImpl(UserDao userDao) {
	this.userDao = userDao;
}
	/*
	 * set注入
	 */
	@Override
	public void adduser(String username, String password) {

	userDao.adduser(username, password);
			}

}
