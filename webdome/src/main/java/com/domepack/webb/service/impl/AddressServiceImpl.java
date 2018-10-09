package com.domepack.webb.service.impl;

import java.util.List;

import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.domepack.webb.dao.AreaMapper;
import com.domepack.webb.dao.CityMapper;
import com.domepack.webb.dao.ProvinceMapper;
import com.domepack.webb.entity.Area;
import com.domepack.webb.entity.City;
import com.domepack.webb.entity.Province;
import com.domepack.webb.service.AddressService;

public class AddressServiceImpl implements AddressService {
   @Autowired
   ProvinceMapper proviceMapper;
   @Autowired
   CityMapper cityMapper;
   @Autowired
   AreaMapper areaMapper;
	
	
	@Override
	public List<Province> listProvince(String code) {
		List<Province> provices = proviceMapper.selectAllProvines(code);
		return provices;
	}

	@Override
	public List<City> listCity(String code) {
		List<City> cities = cityMapper.selectAllCity(code);
		return cities;
	}

	@Override
	public List<Area> listArea(String code) {
		List<Area> areas = areaMapper.selectAllArea(code);
		return areas;
	}

}
