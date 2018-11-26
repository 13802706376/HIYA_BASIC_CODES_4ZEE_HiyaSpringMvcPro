package com.hiya.common;

public class StringUtil
{
	public static boolean isEmpty(String str)
	{
		if (str == null)
		{
			return true;
		}
		if (str.trim().equals(""))
		{
			return true;
		}
		return false;
	}
	
	/**
	 * ���ַ����ĵ�һ����ĸתΪ��д
	 * @param newStr
	 * @return
	 */
	public static String makeFirstLetterUpperCase(String newStr) {
		if (newStr.length() == 0)
			return newStr;

		char[] oneChar = new char[1];
		oneChar[0] = newStr.charAt(0);
		String firstChar = new String(oneChar);
		return (firstChar.toUpperCase() + newStr.substring(1));
	}
}
