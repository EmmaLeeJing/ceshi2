package com.domepack.webb.dao;

import com.domepack.webb.entity.CaiPiaoNum;

public interface CaiPiaoNumMapper {
	
    int deleteByPrimaryKey(Long id);

    int insert(CaiPiaoNum record);

    int insertSelective(CaiPiaoNum record);

    CaiPiaoNum selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CaiPiaoNum record);

    int updateByPrimaryKey(CaiPiaoNum record);
}