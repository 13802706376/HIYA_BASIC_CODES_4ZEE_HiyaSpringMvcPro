package com.hiya.city.test;

import java.io.FileNotFoundException;
import java.lang.reflect.ParameterizedType;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration({"classpath:configuration/hiya-context.xml"})  
public abstract class AbstractControllerTest<T>
{  
	
	
	Logger LOG = null;
    {
    	  @SuppressWarnings("unchecked")
    	  Class <T> sourceClass = (Class <T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]; 
	      LOG = Logger.getLogger(sourceClass);
	      
	         try
			{
				Log4jConfigurer.initLogging("classpath:configuration/log4j.xml");
			} catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
    }
	
    
	@Before
	public void before()
	{
		
		 LOG.info("--------------Junit test begin--------------");
	}
	
	@After
	public void end()
	{
		 LOG.info("--------------Junit test end--------------");
	}
}  