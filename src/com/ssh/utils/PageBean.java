package com.ssh.utils;

import java.util.List;

public class PageBean<E> {

	//��ǰҳ
	private int currentPage;
	
	//�ܼ�¼��
	private int totalCount;
	//һҳ��ʾ�ļ�¼��
	private int pageSize;
	//��ҳ��
	private int totalPage;
	//�����
	private List<E> list;
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<E> getList() {
		return list;
	}
	public void setList(List<E> list) {
		this.list = list;
	}
	
	
}
