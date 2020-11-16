package com.fujie.newdaily.day01.service;


import com.fujie.newdaily.day01.utils.ResultEntity;

/**
 * @ClassName AdminService
 * @Description TODO
 * @Author 付洁
 * @Date 2020/11/16
 **/
public interface AdminService {
    ResultEntity adminLogin(String account,String password);
}

