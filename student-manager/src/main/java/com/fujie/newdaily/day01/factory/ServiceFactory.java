package com.fujie.newdaily.day01.factory;

import com.fujie.newdaily.day01.service.AdminService;
import com.fujie.newdaily.day01.service.impl.AdminServiceImpl;

/**
 * @ClassName ServiceFactory
 * @Description TODO
 * @Author 付洁
 * @Date 2020/11/16
 **/
public class ServiceFactory {
    public static AdminService getAdminServiceInstance(){
        return new AdminServiceImpl();
    }
}
