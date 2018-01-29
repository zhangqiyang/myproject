package com.guigu.instructional.edumanage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.edumanage.mapper.ClassTransactionInfoMapper;
import com.guigu.instructional.edumanage.service.ClasstranService;
import com.guigu.instructional.po.ClassTransactionInfo;
import com.guigu.instructional.po.ClassTransactionInfoExample;
import com.guigu.instructional.po.ClassTransactionInfoExample.Criteria;

@Service("ClasstranServiceImpl")
public class ClasstranServiceImpl implements ClasstranService {

	 @Resource(name = "classTransactionInfoMapper")
	    private ClassTransactionInfoMapper classTransactionInfoMapper;

	    @Override
	    public boolean addClasstran(ClassTransactionInfo classTransactionInfo) {
	        try {
	            int i = classTransactionInfoMapper.insertSelective(classTransactionInfo);
	            if (i > 0) {
	                return true;
	            }
	        } catch (Exception e) {

	        }

	        return false;
	    }

	    @Override
	    public boolean updateClasstran(ClassTransactionInfo classTransactionInfo) {
	        try {
	            int i = classTransactionInfoMapper.updateByPrimaryKeySelective(classTransactionInfo);
	            if (i > 0) {
	                return true;
	            }
	        } catch (Exception e) {

	        }

	        return false;
	    }

	    @Override
	    public List<ClassTransactionInfo> getClasstranInfoList(ClassTransactionInfo classTransactionInfo) {
	    	ClassTransactionInfoExample classTransactionInfoExample =new ClassTransactionInfoExample();
	        
	        Criteria criteria =classTransactionInfoExample.createCriteria();
	        if(classTransactionInfo!=null) {
	            //����id��ѯ
	            if(classTransactionInfo.getClassTransactionId()!=null) {
	                criteria.andClassTransactionIdEqualTo(classTransactionInfo.getClassTransactionId());
	            }
	            
	            //1��������  0����ɾ��
	            //��ѯ����������Ա��������
//	            ClassTransactionInfo.setClassTransactionState("1");
//	  ɾ����֮��״̬1��Ϊ0 ��staff��staff-state�仯
	            
	        }
//	        criteria.andClassTransactionStateEqualTo("1");
	       
	        
	        return classTransactionInfoMapper.selectByExample(classTransactionInfoExample);
	    }

	    @Override
	    public ClassTransactionInfo getClasstranInfo(Integer classTransactionId) {
	        
	        return classTransactionInfoMapper.selectByPrimaryKey(classTransactionId);
	    }

	
	

}
