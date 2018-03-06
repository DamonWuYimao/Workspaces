package org.strut.dao;

import java.sql.Connection;
import java.util.List;

import org.strut.actionform.*;

/**
 * �û���ɾ�Ĳ�Dao��ӿ�
 */
public interface UserDao {
	
	/**
	 * �����û�
	 * @param conn
	 * @param user user����  
	 */
	public void addUser(Connection conn, UserActionForm user);
	
	/**
	 * ����userId�ļ���ɾ���û�
	 * @param conn
	 * @param userIdList  userId�ļ���
	 */
	public void deleteUsers(Connection conn, String[] userIdList);
	
	/**
	 * �޸��û�
	 * @param conn
	 * @param user user����  
	 */
	public void modifyUser(Connection conn, UserActionForm user);
	
	/**
	 * �����û�id��ѯ�û�
	 * @param userId �û�id
	 * @return  user����  
	 */
	public UserActionForm findUserById(String userId);
	
	/**
	 * ��ѯ�����û�
	 * @return user�����б�
	 */
	public List findAllUserList();
}
