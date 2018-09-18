package com.domepack.webb.service;

import java.util.List;

import com.domepack.webb.entity.CaiPiaoNum;

public interface CaiPiaoService {
	/**
	 * 新增彩票号
	 * @param caipiao
	 * @return
	 */
	public String insert(CaiPiaoNum caipiao);
	/**
	 * 彩票列表
	 * @param caipiao
	 * @return
	 */
	public List<CaiPiaoNum> listCaiPiao(CaiPiaoNum caipiao);
}
