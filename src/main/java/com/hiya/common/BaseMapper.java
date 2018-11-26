package com.hiya.common;

import org.springframework.stereotype.Repository;

@Repository
public interface BaseMapper<T>
{

	/**
	 * ��Ӷ���
	 * 
	 * @param entity
	 * @return
	 */
	public void add(T entity);

	/**
	 * ��������ɾ��
	 * 
	 * @param id
	 */
	public int delById(Object params);

	/**
	 * ���¶���
	 * 
	 * @param entity
	 */
	public int update(T entity);

	/**
	 * ��������IDȡ�ö���
	 * 
	 * @param id
	 * @return
	 */
	public T getById(Object params);

	/**
	 * ����ĳһ������������
	 * 
	 * @param params
	 * @return
	 */
	public T getUnique(Object params);

}
