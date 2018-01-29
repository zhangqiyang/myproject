package com.guigu.instructional.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.po.StaffInfoExample;
import com.guigu.instructional.po.StaffInfoExample.Criteria;
import com.guigu.instructional.system.mapper.StaffInfoMapper;
import com.guigu.instructional.system.service.StaffInfoService;

/**       
 * <p>project_name:InstructionalManagement</p>
 * <p>package_name:com.guigu.instructional.system.service.impl.StaffInfoServiceImpl</p>
 * <p>description��</p>
 * <p>@author������ʦ<p>   
 * <p> date:2018��1��26������8:59:08 </p>
 * <p>comments��    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */

@Service("staffInfoServiceImpl")
public class StaffInfoServiceImpl implements StaffInfoService {

    // @Autowired
    // @Qualifier
    @Resource(name = "staffInfoMapper")
    private StaffInfoMapper staffInfoMapper;

    @Override
    public boolean addStaff(StaffInfo staffInfo) {
        try {
            int i = staffInfoMapper.insertSelective(staffInfo);
            if (i > 0) {
                return true;
            }
        } catch (Exception e) {

        }

        return false;
    }

    @Override
    public boolean updateStaff(StaffInfo staffInfo) {
        try {
            int i = staffInfoMapper.updateByPrimaryKeySelective(staffInfo);
            if (i > 0) {
                return true;
            }
        } catch (Exception e) {

        }

        return false;
    }

    @Override
    public List<StaffInfo> getStaffInfoList(StaffInfo staffInfo) {
        StaffInfoExample staffInfoExample =new StaffInfoExample();
        
        Criteria criteria =staffInfoExample.createCriteria();
        if(staffInfo!=null) {
            //����id��ѯ
            if(staffInfo.getStaffId()!=null) {
                criteria.andStaffIdEqualTo(staffInfo.getStaffId());
            }
            //����name��ѯ
            if(staffInfo.getStaffName()!=null) {
                staffInfo.setStaffName("%"+staffInfo.getStaffName()+"%");
                criteria.andStaffNameLike(staffInfo.getStaffName());
            }
            //���ݵ绰�����ѯ
            if(staffInfo.getStaffMobilePhone()!=null) {
                criteria.andStaffMobilePhoneEqualTo(staffInfo.getStaffMobilePhone());
            }
            //1��������  0����ɾ��
            //��ѯ����������Ա��������
//            staffInfo.setStaffState("1");
            
        }
        criteria.andStaffStateEqualTo("1");
       
        
        return staffInfoMapper.selectByExample(staffInfoExample);
    }

    @Override
    public StaffInfo getStaffInfo(Integer staffId) {
        
        return staffInfoMapper.selectByPrimaryKey(staffId);
    }

}
