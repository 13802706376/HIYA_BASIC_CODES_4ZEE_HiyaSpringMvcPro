package com.hiya.domain;

import java.io.Serializable;
import java.util.Date;

public class CityEntity implements Serializable
{

	private static final long serialVersionUID = 3454357453L;

	private String id;
	private String name;
	private String provinceId;
	private String govArea;
	private String acreage;

	private String gdp;

	private String createdBy;

	private String lastUpdateBy;

	private Date createdDate;
	private Date lastUpdateDate;

	private String attr1;
	private String attr2;
	private String attr3;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getProvinceId()
	{
		return provinceId;
	}

	public void setProvinceId(String provinceId)
	{
		this.provinceId = provinceId;
	}

	public String getGovArea()
	{
		return govArea;
	}

	public void setGovArea(String govArea)
	{
		this.govArea = govArea;
	}

	public String getAcreage()
	{
		return acreage;
	}

	public void setAcreage(String acreage)
	{
		this.acreage = acreage;
	}

	public String getGdp()
	{
		return gdp;
	}

	public void setGdp(String gdp)
	{
		this.gdp = gdp;
	}

	public String getCreatedBy()
	{
		return createdBy;
	}

	public void setCreatedBy(String createdBy)
	{
		this.createdBy = createdBy;
	}

	public String getLastUpdateBy()
	{
		return lastUpdateBy;
	}

	public void setLastUpdateBy(String lastUpdateBy)
	{
		this.lastUpdateBy = lastUpdateBy;
	}

	public Date getCreatedDate()
	{
		return createdDate;
	}

	public void setCreatedDate(Date createdDate)
	{
		this.createdDate = createdDate;
	}

	public Date getLastUpdateDate()
	{
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate)
	{
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getAttr1()
	{
		return attr1;
	}

	public void setAttr1(String attr1)
	{
		this.attr1 = attr1;
	}

	public String getAttr2()
	{
		return attr2;
	}

	public void setAttr2(String attr2)
	{
		this.attr2 = attr2;
	}

	public String getAttr3()
	{
		return attr3;
	}

	public void setAttr3(String attr3)
	{
		this.attr3 = attr3;
	}

}