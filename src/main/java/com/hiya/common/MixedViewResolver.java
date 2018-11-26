package com.hiya.common;

import java.util.Locale;
import java.util.Map;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;


/**
 * spring 使用混合视图�?
 *
 */
public class MixedViewResolver implements ViewResolver
{
	private Map<String, ViewResolver> resolvers;

	public void setResolvers(Map<String, ViewResolver> resolvers)
	{
		this.resolvers = resolvers;
	}

	public View resolveViewName(String viewName, Locale locale) throws Exception
	{
		int n = viewName.lastIndexOf('.');
		String suffix ="jsp";//默认 jsp 视图
		if (n != (-1)){
			suffix= viewName.substring(n + 1);
		}
		ViewResolver resolver = resolvers.get(suffix);
		viewName=viewName.substring(0,n);
		if (resolver != null)
			return resolver.resolveViewName(viewName, locale);
		throw new Exception("No ViewResolver for " + suffix);

	}
}
