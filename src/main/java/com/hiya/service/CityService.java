package com.hiya.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hiya.domain.CityEntity;
import com.hiya.mapper.CityMapper;

@Service
@Transactional
public class CityService
{
	
	@Autowired
	protected CityMapper CityMapper;
	
	public CityEntity selectCityById(Map<String,Object>  paramMap)
	{
		return CityMapper.getById(paramMap);
	}
	
	
	
}
