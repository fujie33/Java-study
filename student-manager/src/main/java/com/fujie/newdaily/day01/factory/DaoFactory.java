package com.fujie.newdaily.day01.factory;

import com.fujie.newdaily.day01.dao.AdminDao;
import com.fujie.newdaily.day01.dao.impl.AdminDaoImpl;

/**
 * @ClassName DaoFactory
 * @Description TODO
 * @Author 付洁
 * @Date 2020/11/16
 **/
public class DaoFactory {
    public static AdminDao getAdminDaoInstance(){
        return new AdminDaoImpl();
    }
}
