package com.hiya.common;

import org.springframework.stereotype.Repository;

@Repository
public interface BaseMapper<T>
{

	/**
	 * 添加对象
	 * 
	 * @param entity
	 * @return
	 */
	public void add(T entity);

	/**
	 * 根据主键删除
	 * 
	 * @param id
	 */
	public int delById(Object params);

	/**
	 * 更新对象
	 * 
	 * @param entity
	 */
	public int update(T entity);

	/**
	 * 根据主键ID取得对象
	 * 
	 * @param id
	 * @return
	 */
	public T getById(Object params);

	/**
	 * 返回某一条单独的数据
	 * 
	 * @param params
	 * @return
	 */
	public T getUnique(Object params);

}
