package com.domepack.webb.dao;

import com.domepack.webb.entity.SystemDistrict;


public interface SystemDistrictMapper {
    int deleteByPrimaryKey(Long districtId);

    int insert(SystemDistrict record);

    int insertSelective(SystemDistrict record);

    SystemDistrict selectByPrimaryKey(Long districtId);

    int updateByPrimaryKeySelective(SystemDistrict record);

    int updateByPrimaryKey(SystemDistrict record);
}