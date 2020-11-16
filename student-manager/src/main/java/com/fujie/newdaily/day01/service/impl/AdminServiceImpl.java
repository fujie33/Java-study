package com.fujie.newdaily.day01.service.impl;

import com.fujie.newdaily.day01.dao.AdminDao;
import com.fujie.newdaily.day01.entity.Admin;
import com.fujie.newdaily.day01.factory.DaoFactory;
import com.fujie.newdaily.day01.service.AdminService;
import com.fujie.newdaily.day01.utils.ResultEntity;
import org.apache.commons.codec.digest.DigestUtils;

import java.sql.SQLException;

/**
 * @ClassName AdminServiceImpl
 * @Description TODO
 * @Author 付洁
 * @Date 2020/11/16
 **/
public class AdminServiceImpl implements  AdminService {

    private final AdminDao adminDao = DaoFactory.getAdminDaoInstance();

    @Override
    public ResultEntity adminLogin(String account, String password) {
        ResultEntity resultEntity;
        Admin admin = null;
        try{
            admin = (Admin) adminDao.findAdminByAccount(account);
        }catch (SQLException e){
            System.err.println("根据账号查找管理员信息出现SQL异常");
        }
        if (admin != null){
            if (DigestUtils.md5Hex(password).equals(admin.getPassword())){
                resultEntity = ResultEntity.builder().code(0).message("登陆成功").data(admin).build();
            }else{
                resultEntity = ResultEntity.builder().code(1).message("密码错误").build();
            }
        }else{
            resultEntity = ResultEntity.builder().code(2).message("账号不存在").build();
        }
        return resultEntity;
    }
}

