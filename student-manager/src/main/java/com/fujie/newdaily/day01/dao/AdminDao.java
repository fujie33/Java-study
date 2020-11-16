package com.fujie.newdaily.day01.dao;

import com.fujie.newdaily.day01.entity.Admin;

import java.sql.SQLException;

/**
 * @ClassName AdminDao
 * @Description TODO
 * @Author 付洁
 * @Date 2020/11/16
 **/
public interface AdminDao {
    Admin findAdminByAccount(String account) throws SQLException;
}
