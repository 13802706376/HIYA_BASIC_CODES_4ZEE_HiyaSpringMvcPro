package com.hiya.common;

import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController
{

	protected Logger LOG = Logger.getLogger(BaseController.class);


	public ModelAndView getAutoView(HttpServletRequest request) throws Exception
	{
		if (request == null)
		{
			RequestAttributes ra = RequestContextHolder.getRequestAttributes();
			request = ((ServletRequestAttributes) ra).getRequest();
		}
		String requestURI = request.getRequestURI();
		LOG.info("requestURI:" + requestURI);
		String contextPath = request.getContextPath();

		requestURI = requestURI.replace(".hiya", "");
		int cxtIndex = requestURI.indexOf(contextPath);
		if (cxtIndex != -1)
		{
			requestURI = requestURI.substring(cxtIndex + contextPath.length());
		}

		String[] paths = requestURI.split("[/]");
		if (paths != null && paths.length == 5)
		{
			String jspPath = "/" + paths[1] + "/" + paths[2] + "/" + paths[3]
					+ StringUtil.makeFirstLetterUpperCase(paths[4]) + ".jsp";
			return new ModelAndView(jspPath);
		} else if (paths != null && paths.length == 4)
		{
			String jspPath = "/" + paths[1] + "/" + paths[2] + StringUtil.makeFirstLetterUpperCase(paths[3]) + ".jsp";
			return new ModelAndView(jspPath);
		} else
		{
			LOG.error("your request url is not the right pattern, it is not allowed use this getAutoView method");
			throw new Exception("url:[" + requestURI + "] is not in this pattern");
		}

	}

}