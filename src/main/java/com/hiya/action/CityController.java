package com.hiya.action;



import java.util.Hashtable;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hiya.common.BaseController;
import com.hiya.common.RequestUtil;
import com.hiya.domain.CityEntity;
import com.hiya.service.CityService;

@Controller
@RequestMapping("/business/city/")
public class CityController extends BaseController
{
	
	@Autowired
	CityService cityService;
	
	@RequestMapping("cityView")
	public ModelAndView cityView(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		  LOG.info("CityController>>cityView>>request="+request.getParameterMap());
		  String cityId = RequestUtil.getString(request, "cityId");
		  Map<String,Object> params = new Hashtable<String,Object>();
		  params.put("cityId", cityId);
		  CityEntity cityEntity = cityService.selectCityById(params);
		  ModelAndView mv = this.getAutoView(request);
		  mv.addObject("cityEntity", cityEntity);
          return mv;
	}
}