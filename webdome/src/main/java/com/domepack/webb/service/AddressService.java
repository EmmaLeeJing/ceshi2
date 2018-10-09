package com.domepack.webb.service;

import java.util.List;

import com.domepack.webb.entity.Area;
import com.domepack.webb.entity.City;
import com.domepack.webb.entity.Province;

public interface AddressService {
	
	List<Province> listProvince(String code);
	
	List<City> listCity(String code);
	
	List<Area> listArea(String code);

}
