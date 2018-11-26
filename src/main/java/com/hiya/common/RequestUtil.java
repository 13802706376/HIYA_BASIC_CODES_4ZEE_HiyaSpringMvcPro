package com.hiya.common;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.StringUtils;

public final class RequestUtil
{

	public static String getString(HttpServletRequest request, String key, String defaultValue)
	{
		String value = request.getParameter(key);
		if (StringUtil.isEmpty(value))
			return defaultValue;
		return value.replace("'", "''").trim();
	}

	/**
	 * 取字符串类型的参数�?? 如果取得的�?�为null，则返回空字符串�?
	 * 
	 * @param request
	 * @param key
	 * @return
	 */
	public static String getString(HttpServletRequest request, String key)
	{
		return getString(request, key, "");
	}

	/**
	 * 从Request中取得指定的小写�?
	 * 
	 * @param request
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String getLowercaseString(HttpServletRequest request, String key)
	{
		return getString(request, key).toLowerCase();
	}

	/**
	 * 从request中取得int�?
	 * 
	 * @param request
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static int getInt(HttpServletRequest request, String key)
	{
		return getInt(request, key, 0);
	}

	/**
	 * 从request中取得int�?,如果无�?�则返回缺省�?
	 * 
	 * @param request
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static int getInt(HttpServletRequest request, String key, int defaultValue)
	{
		String str = request.getParameter(key);
		if (StringUtil.isEmpty(str))
			return defaultValue;
		return Integer.parseInt(str);

	}

	/**
	 * 从Request中取得long�?
	 * 
	 * @param request
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static long getLong(HttpServletRequest request, String key)
	{
		return getLong(request, key, 0);
	}

	/**
	 * 从Request中取得long�?,如果无�?�则返回缺省�?
	 * 
	 * @param request
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static long getLong(HttpServletRequest request, String key, long defaultValue)
	{
		String str = request.getParameter(key);
		if (StringUtil.isEmpty(str))
			return defaultValue;
		return Long.parseLong(str.trim());
	}

	/**
	 * 从Request中取得long�?,如果无�?�则返回缺省�?
	 * 
	 * @param request
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static Long getLong(HttpServletRequest request, String key, Long defaultValue)
	{
		String str = request.getParameter(key);
		if (StringUtil.isEmpty(str))
			return defaultValue;
		return Long.parseLong(str.trim());
	}

	/**
	 * 从Request中取得float�?
	 * 
	 * @param request
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static float getFloat(HttpServletRequest request, String key)
	{
		return getFloat(request, key, 0);
	}

	/**
	 * 从Request中取得float�?,如无值则返回缺省�?
	 * 
	 * @param request
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static float getFloat(HttpServletRequest request, String key, float defaultValue)
	{
		String str = request.getParameter(key);
		if (StringUtil.isEmpty(str))
			return defaultValue;
		return Float.parseFloat(request.getParameter(key));
	}

	/**
	 * 从Request中取得boolean�?,如无值则返回缺省�? false, 如�?�为数字1，则返回true
	 * 
	 * @param request
	 * @param key
	 * @return
	 */
	public static boolean getBoolean(HttpServletRequest request, String key)
	{
		return getBoolean(request, key, false);
	}

	/**
	 * 从Request中取得boolean�? 对字符串,如无值则返回缺省�?, 如�?�为数字1，则返回true
	 * 
	 * @param request
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public static boolean getBoolean(HttpServletRequest request, String key, boolean defaultValue)
	{
		String str = request.getParameter(key);
		if (StringUtil.isEmpty(str))
			return defaultValue;
		return Boolean.parseBoolean(str);
	}

	/**
	 * 从Request中取得boolean�?,如无值则返回缺省�? 0
	 * 
	 * @param request
	 * @param key
	 * @return
	 */
	public static Short getShort(HttpServletRequest request, String key)
	{
		return getShort(request, key, (short) 0);
	}

	/**
	 * 从Request中取得Short�? 对字符串,如无值则返回缺省�?
	 * 
	 * @param request
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public static Short getShort(HttpServletRequest request, String key, Short defaultValue)
	{
		String str = request.getParameter(key);
		if (StringUtil.isEmpty(str))
			return defaultValue;
		return Short.parseShort(str);
	}

	/**
	 * 取得当前页URL,如有参数则带参数
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @return
	 */
	public static String getUrl(HttpServletRequest request)
	{
		StringBuffer urlThisPage = new StringBuffer();
		urlThisPage.append(request.getRequestURI());
		Enumeration<?> e = request.getParameterNames();
		String para = "";
		String values = "";
		urlThisPage.append("?");
		while (e.hasMoreElements())
		{
			para = (String) e.nextElement();
			values = request.getParameter(para);
			urlThisPage.append(para);
			urlThisPage.append("=");
			urlThisPage.append(values);
			urlThisPage.append("&");
		}
		return urlThisPage.substring(0, urlThisPage.length() - 1);
	}

}
