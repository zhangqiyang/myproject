package com.guigu.instructional.edumanage.service;

import java.util.List;

import com.guigu.instructional.po.ClassTransactionInfo;


public interface ClasstranService {

	
//���������Ϣ
	public boolean addClasstran(ClassTransactionInfo classTransactionInfo);
//	����������Ϣ
	
	public boolean updateClasstran(ClassTransactionInfo classTransactionInfo);
	
//	����������ѯ������Ϣ
	
	public  List<ClassTransactionInfo> getClasstranInfoList(ClassTransactionInfo classTransactionInfo);
//���ݱ�Ų�ѯ������Ϣ
	
	public ClassTransactionInfo getClasstranInfo(Integer classTransactionId);
}
