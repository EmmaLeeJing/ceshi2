package com.domepack.webb.service;

import java.util.List;

import com.domepack.webb.entity.CaiPiaoNum;

public interface CaiPiaoService {
	/**
	 * ������Ʊ��
	 * @param caipiao
	 * @return
	 */
	public String insert(CaiPiaoNum caipiao);
	/**
	 * ��Ʊ�б�
	 * @param caipiao
	 * @return
	 */
	public List<CaiPiaoNum> listCaiPiao(CaiPiaoNum caipiao);
}
