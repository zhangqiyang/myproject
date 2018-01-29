package com.guigu.instructional.system.service;

import java.util.List;

import com.guigu.instructional.po.RoleInfo;

/**       
 * <p>project_name:InstructionalManagement</p>
 * <p>package_name:com.guigu.instructional.system.service.RoleInfoService</p>
 * <p>description��</p>
 * <p>@author������ʦ<p>   
 * <p> date:2018��1��26������1:17:26 </p>
 * <p>comments��    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */

public interface RoleInfoService {
    
    /**
     * addRole:��ӽ�ɫ
     * @author ����ʦ
     * @param roleInfo
     * @return  <br/>
     * @since JDK 1.8
     */
    public boolean addRole(RoleInfo roleInfo);
    
    /**
     * 
     * updateRole:���½�ɫ
     * @author ����ʦ
     * @param roleInfo
     * @return  <br/>
     * @since JDK 1.8
     */
    public boolean updateRole(RoleInfo roleInfo);
    
    /**
     * getRoleInfoList:����������ѯ���еĽ�ɫ
     * @author ����ʦ
     * @param roleInfo
     * @return  <br/>
     * @since JDK 1.8
     */
    public List<RoleInfo> getRoleInfoList(RoleInfo roleInfo);
    
    /**
     * getRoleInfo:���ݱ�Ų�ѯ��ɫ��Ϣ
     * @author ����ʦ
     * @param roleId
     * @return  <br/>
     * @since JDK 1.8
     */
    public RoleInfo getRoleInfo(Integer roleId);
}


