package com.hiya.common;

import javax.servlet.ServletContext;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContextProvider implements ApplicationContextAware
{

	private static ApplicationContext applicationContext;

	private static ServletContext servletContext;

	/**
	 * 
	 * @param servletContext
	 */
	public static void init(ServletContext _servletContext)
	{
		servletContext = _servletContext;
	}

	/**
	 * spring启动时注入context
	 */
	public void setApplicationContext(ApplicationContext contex) throws BeansException
	{
		applicationContext = contex;
	}

	/**
	 * 获取spring的上下文�?
	 * 
	 * @return
	 */
	public static ApplicationContext getContext()
	{
		return applicationContext;
	}

	/**
	 * 获取web应用的ServletContext对象�?
	 * 
	 * @return
	 * @throws Exception
	 */
	public static ServletContext getServletContext() throws Exception
	{
		return servletContext;
	}

	/**
	 * 根据类从spring上下文获取bean�?
	 * 
	 * @param cls
	 * @return
	 */
	public static Object getBean(Class<?> cls)
	{
		return applicationContext.getBean(cls);
	}

	/**
	 * 根据类名从spring上下文获取bean�?
	 * 
	 * @param cls
	 * @return
	 */
	public static Object getBean(String beanId)
	{
		return applicationContext.getBean(beanId);
	}

}
