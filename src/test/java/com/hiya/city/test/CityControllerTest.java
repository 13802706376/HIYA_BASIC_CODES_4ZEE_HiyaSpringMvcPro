package com.hiya.city.test;

import java.util.Hashtable;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hiya.domain.CityEntity;
import com.hiya.service.CityService;

public  class CityControllerTest  extends AbstractControllerTest<CityControllerTest>
{  
	
	
	@Autowired
	CityService cityService;
	
	
	@Test
	public void testCityView()
	{
		  Map<String,Object> params = new Hashtable<String,Object>();
		  params.put("cityId", "4");
		  CityEntity cityEntity = cityService.selectCityById(params);
		  LOG.info(cityEntity.getName());
	}
}  