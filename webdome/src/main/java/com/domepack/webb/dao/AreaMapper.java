package com.domepack.webb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.domepack.webb.entity.Area;


public interface AreaMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
    
    List<Area> selectAllArea(@Param("code") String code);
}