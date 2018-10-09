package com.domepack.webb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.domepack.webb.entity.City;
import com.domepack.webb.entity.Province;


public interface CityMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
    
    List<City> selectAllCity(@Param("code") String code);
}