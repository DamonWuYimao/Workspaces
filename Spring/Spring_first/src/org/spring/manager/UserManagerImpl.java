package org.spring.manager;

import org.spring.dao.UserDao;


public class UserManagerImpl implements UserManager {

	private UserDao userDao;
	/*
	 * ����ע��
	 */
	public UserManagerImpl(UserDao userDao) {
	this.userDao = userDao;
}
	/*
	 * setע��
	 */
	@Override
	public void adduser(String username, String password) {

	userDao.adduser(username, password);
			}

}
