package com.fujie.newdaily.day01.dao;

import com.fujie.newdaily.day01.entity.Admin;
import com.fujie.newdaily.day01.factory.DaoFactory;
import junit.framework.TestCase;
import org.junit.Test;

import java.sql.SQLException;

public class AdminDaoTest extends TestCase {
    private final AdminDao adminDao = DaoFactory.getAdminDaoInstance();
    @Test
    public void testfindAdminByAccount(){
        Admin admin;
        try{
            admin = (Admin) adminDao.findAdminByAccount("fujie");
            assertEquals("fujie",admin.getAdminName());
            System.out.println(admin);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

}