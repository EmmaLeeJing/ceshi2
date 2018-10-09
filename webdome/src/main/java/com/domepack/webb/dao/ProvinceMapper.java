package com.domepack.webb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.domepack.webb.entity.Province;


public interface ProvinceMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Province record);

    int insertSelective(Province record);

    Province selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Province record);

    int updateByPrimaryKey(Province record);
    
    List<Province> selectAllProvines(@Param("code") String code);
}